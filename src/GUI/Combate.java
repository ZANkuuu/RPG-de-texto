package GUI;

import Dominio.EnemyFactory;
import Entidades.Inimigos.Inimigo;
import Entidades.Player.Jogador;

import java.util.Scanner;

public class Combate {
    private Inimigo inimigo;

    final int CURA = 7; // TEMPORARIO

    public Combate(){
    }

    public void combateAtivo(Scanner in, Jogador jogador, EnemyFactory enemyFactory){

        this.inimigo = enemyFactory.randomEnemy();

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
                     [2] - Curar (Quantidade de poções: %d)
                     ====================
                     """, inimigo, inimigo.getHp(), hpInimigoTemp, jogador.getNome(), jogador.getHp(),
                    hpJogadorTemp, jogador.getPocaoCura());

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

            inimigo.ataqueInimigo(jogador);
        }

        decisaoDeVitoria(inimigo.getHp());
    }

    void decisaoDeVitoria(int hpInimigo){
        IO.println("");
        if(hpInimigo > 0){
            IO.println("Jogador derrotado! O "+ inimigo +" foi embora.");
        }else{
            IO.println("O jogador venceu!");
        }
    }
}