import Entidades.Player.Jogador;

import java.util.Scanner;

import static Entidades.Player.Armas.*;
import static Entidades.Player.Armaduras.*;

public class Jogo {
    static Scanner in = new Scanner(System.in);

    static void fazerPersonagem(){
        boolean vazio = true;
        Jogador jogador = new Jogador();

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
        IO.print(jogador);
    }
}