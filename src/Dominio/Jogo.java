package Dominio;

import Entidades.Player.Jogador;

import java.util.Scanner;

import static Entidades.Player.Armas.*;
import static Entidades.Player.Armaduras.*;

public class Jogo {
    Jogador jogador = new Jogador();

     public void fluxoDeJogo(){
        Scanner in = new Scanner(System.in);

        criacaoDePersonagem(in);

        if(selecao(in)){
            combate();
        }

    }

    void salvarPersonagem(Jogador jogador){
         Save.player.add(jogador);
    }

    void criacaoDePersonagem(Scanner in){
        boolean campoVazio = true;

        //Escolha do nome do personagem
        while(campoVazio){

            try{
                IO.print("Digite o nome do personagem: ");
                jogador.setNome(in.nextLine());
                campoVazio = false;
            }catch(Exception e){
                IO.println(e.getMessage());
            }
        }

        campoVazio = true;
        IO.println("===========================");

        //Escolha da arma
        while(campoVazio){
            IO.print("""
                     1 - Espada (5 de dano | 1 ataque por turno)
                     2 - Machado (12 de dano | 1 ataque a cada 2 turnos)
                     """);
            IO.print("Escolha sua arma: ");
            byte opcaoArma = in.nextByte();
            in.nextLine();

            switch(opcaoArma){
                case 1:
                    jogador.setArma(Espada);
                    campoVazio = false;
                    break;
                case 2:
                    jogador.setArma(Machado);
                    campoVazio = false;
                    break;
                default:
                    IO.println("Escolha uma arma!");
            }
        }

        campoVazio = true;
        IO.println("===========================");

        //Escolha da armadura
        while(campoVazio){
            IO.print("""
                     1 - Leve (5 de defesa)
                     2 - Pesada (10 de defesa)
                     """);
            IO.print("Escolha sua armadura: ");
            byte opcaoArmadura = in.nextByte();
            in.nextLine();

            switch(opcaoArmadura){
                case 1:
                    jogador.setArmadura(Leve);
                    campoVazio = false;
                    break;
                case 2:
                    jogador.setArmadura(Pesada);
                    campoVazio = false;
                    break;
                default:
                    IO.println("Escolha uma armadura!");
            }
        }

        jogador.setDefesaJogador(jogador.getArmadura());

        salvarPersonagem(jogador);

        IO.println("===========================");
        IO.print("Aperte ENTER para continuar");
        in.nextLine();
    }

    boolean selecao(Scanner in){
        while(true) {
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
                    IO.println("Adentrando combate");
                    return true;
                case 2:
                    IO.print(jogador);
                    break;
                case 3:
                    IO.println("O jogador desistiu da partida");
                    return false;
                default:
                    IO.println("Escolha uma opção válida!");
            }
        }
    }

    void combate(){

    }

}