package GUI;

import Dominio.Jogo;

import java.util.Scanner;

public class Menu {
    private final Scanner in;
    private final Jogo jogo;

    public Menu(Scanner in, Jogo jogo){
        this.in = in;
        this.jogo = jogo;
    }

    public void menuPrincipal(){
        IO.print("""
                  ===========================
                              RPG
                  ===========================
                  [1] - Jogar
                  [2] - Sair
                  ===========================
                  """);
        IO.print("Digite sua opção: ");
        byte opcaoMenu = Byte.parseByte(in.nextLine());

        IO.println("===========================");

        switch(opcaoMenu){
            case 1:
                jogo.fluxoDeJogo();
                break;
            case 2:
                IO.println("Saindo...");
                break;
            default:
                IO.println("Erro. Opção inválida!");
        }
    }
}