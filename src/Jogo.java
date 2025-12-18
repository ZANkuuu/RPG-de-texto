import Entidades.Player.Jogador;

import java.util.Scanner;

import static Entidades.Player.Armas.*;
import static Entidades.Player.Armaduras.*;

public class Jogo {
    Scanner in = new Scanner(System.in);
    Jogador jogador = new Jogador();

     void fluxoDoJogo(){
        criacaoDePersonagem();

        boolean opcao = true;

        while(opcao) {
            IO.print("""
                    ======================
                    [1] - Lutar
                    [2] - Ver personagem
                    [3] - Desistir
                    ======================
                    """);
            IO.print("Escolha uma opção: ");
            byte escolha = in.nextByte();

            switch(escolha){
                case 1:
                    combate();
                    break;
                case 2:
                    IO.print(jogador);
                    break;
                case 3:

                    break;
                default:
                    IO.println("Escolha uma opção válida!");
            }
        }
    }

    void criacaoDePersonagem(){
        boolean vazio = true;

        //Escolha do nome do personagem
        while(vazio){

            try{
                IO.print("Digite o nome do personagem: ");
                jogador.setNome(in.nextLine());
                vazio = false;
            }catch(Exception e){
                IO.println(e.getMessage());
            }
        }

        vazio = true;
        IO.println("===========================");

        //Escolha da arma
        while(vazio){
            IO.print("""
                     1 - Espada (5 de dano | 1 ataque por turno)
                     2 - Machado (12 de dano | 1 ataque a cada 2 turnos)
                     """);
            IO.print("Escolha sua arma: ");
            byte opcaoArma = in.nextByte();

            switch(opcaoArma){
                case 1:
                    jogador.setArma(Espada);
                    vazio = false;
                    break;
                case 2:
                    jogador.setArma(Machado);
                    vazio = false;
                    break;
                default:
                    IO.println("Escolha uma arma!");
            }
        }

        vazio = true;
        IO.println("===========================");

        //Escolha da armadura
        while(vazio){
            IO.print("""
                     1 - Leve (5 de defesa)
                     2 - Pesada (10 de defesa)
                     """);
            IO.print("Escolha sua armadura: ");
            byte opcaoArmadura = in.nextByte();

            switch(opcaoArmadura){
                case 1:
                    jogador.setArmadura(Leve);
                    vazio = false;
                    break;
                case 2:
                    jogador.setArmadura(Pesada);
                    vazio = false;
                    break;
                default:
                    IO.println("Escolha uma armadura!");
            }
        }

        IO.println("===========================");
        IO.print("Aperte ENTER para continuar");
        in.nextLine();
    }

    void combate(){

    }

}