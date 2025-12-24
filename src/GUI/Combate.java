package GUI;

import Entidades.Inimigos.Zumbi;
import Entidades.Player.Jogador;

import java.util.Scanner;

public class Combate {
    final int CURA = 7;

    public void combateAtivo(Scanner in, Jogador jogador){
        Zumbi zumbi = new Zumbi();
        int hpZumbiTemp = zumbi.getHp();
        int hpJogadorTemp = jogador.getHp();

        while(jogador.getHp() > 0 && zumbi.getHp() > 0){
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
                     """, zumbi, zumbi.getHp(), hpZumbiTemp, jogador.getNome(), jogador.getHp(), hpJogadorTemp, jogador.getPocaoCura());
            IO.print("Escolha a opção: ");
            byte escolha = Byte.parseByte(in.nextLine());

            switch(escolha){
                case 1:
                    IO.println("Jogador atacou "+ zumbi);
                    IO.println("Jogador causou "+ jogador.ataqueJogador(zumbi.getDefesaInimigo()) +
                               " de dano.");

                    zumbi.tomarDanoInimigo(jogador.ataqueJogador(zumbi.getDefesaInimigo()));
                    break;
                case 2:
                    if(jogador.getHp() == hpJogadorTemp){
                        IO.println("O jogador já está com a vida cheia");
                        break;
                    }else if(jogador.getPocaoCura() == 0){
                        IO.println("Não há poções restantes!");
                        break;
                    }else{
                        IO.println("Jogador curou 7 pontos de vida!");
                        jogador.curar(CURA);
                    }
                    break;
                default:
                    IO.println("Opção inválida. Jogador perdeu o turno.");
            }

            IO.println("Zumbi usou sua mordida");
            IO.println("Zumbi causou " + zumbi.ataqueInimigo(jogador.getDefesaJogador()) + " de dano.");

            jogador.tomarDanoJogador(zumbi.ataqueInimigo(jogador.getDefesaJogador()));
        }



    }

    void vitoriaInimigo(){

    }

    void vitoriaJogador(){

    }
}