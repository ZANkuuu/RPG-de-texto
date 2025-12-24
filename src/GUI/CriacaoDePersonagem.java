package GUI;

import Dominio.SaveService;
import Entidades.Player.Armaduras;
import Entidades.Player.Armas;
import Entidades.Player.Jogador;

import java.util.Scanner;

public class CriacaoDePersonagem {
    public void criarPersonagem(Scanner in, Jogador jogador, SaveService saveService){
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
                     1 - Espada (8 de dano | 1 ataque por turno)
                     2 - Machado (12 de dano | 1 ataque a cada 2 turnos)
                     """);
            IO.print("Escolha sua arma: ");
            byte opcaoArma = Byte.parseByte(in.nextLine());

            switch(opcaoArma){
                case 1:
                    jogador.setArma(Armas.Espada);
                    campoVazio = false;
                    break;
                case 2:
                    jogador.setArma(Armas.Machado);
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
            byte opcaoArmadura = Byte.parseByte(in.nextLine());

            switch(opcaoArmadura){
                case 1:
                    jogador.setArmadura(Armaduras.Leve);
                    campoVazio = false;
                    break;
                case 2:
                    jogador.setArmadura(Armaduras.Pesada);
                    campoVazio = false;
                    break;
                default:
                    IO.println("Escolha uma armadura!");
            }
        }

        jogador.setDefesaJogador(jogador.getArmadura());
        jogador.setDanoJogador(jogador.getArma());

        saveService.salvarPersonagem(jogador);

        IO.println("===========================");
        IO.print("Aperte ENTER para continuar");
        in.nextLine();
    }
}