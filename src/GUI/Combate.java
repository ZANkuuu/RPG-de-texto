package GUI;

import Dominio.EnemyFactory;
import Entidades.Inimigos.Inimigo;
import Entidades.Player.Jogador;

import java.util.Scanner;

public class Combate {
    private final Inimigo inimigo;
    final int CURA = 7;

    public Combate(EnemyFactory enemyFactory){
        this.inimigo = enemyFactory.randomEnemy();
    }

    public void combateAtivo(Scanner in, Jogador jogador){
        int hpJogadorTemp = jogador.getHp();
        int hpInimigoTemp = inimigo.getHp();

        while(jogador.getHp() > 0 && inimigo.getHp() > 0){
            System.out.printf("""
                     ====================
                     %s
                     HP: %d/%d
                     --------------------
                     %s
                     HP: %d/%d
                     --------------------
                     [1] - Atacar
                     [2] - Curar (%d poção(ões))
                     ====================
                     """, inimigo, inimigo.getHp(), hpInimigoTemp, jogador.getNome(), jogador.getHp(), hpJogadorTemp, jogador.getPocaoCura());
            IO.print("Escolha a opção: ");
            byte escolha = Byte.parseByte(in.nextLine());

            switch(escolha) {
                case 1:
                    IO.println("Jogador atacou " + inimigo);
                    IO.println("Jogador causou " + jogador.ataqueJogador(inimigo.getDefesaInimigo()) +
                            " de dano.");

                    inimigo.tomarDanoInimigo(jogador.ataqueJogador(inimigo.getDefesaInimigo()));
                    break;
                case 2:
                    if (jogador.getHp() == hpJogadorTemp) {
                        IO.println("O jogador já está com a vida cheia");
                        break;
                    } else if (jogador.getPocaoCura() == 0) {
                        IO.println("Não há poções restantes!");
                        break;
                    } else {
                        IO.println("Jogador curou 7 pontos de vida!");
                        jogador.curar(CURA);
                    }
                    break;
                default:
                    IO.println("Opção inválida. Jogador perdeu o turno.");
            }



        }



    }

    void vitoriaInimigo(){

    }

    void vitoriaJogador(){

    }
}