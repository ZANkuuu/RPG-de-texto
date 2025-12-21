import Dominio.Jogo;

import java.util.Scanner;

public class Menu {

    static void main() {
        Scanner in = new Scanner(System.in);
        Jogo jogo = new Jogo();

        IO.print("""
                  ===========================
                              RPG
                  ===========================
                  [1] - Jogar
                  [2] - Sair
                  ===========================
                  """);
        IO.print("Digite sua opção: ");
        byte opcaoMenu = in.nextByte();

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

        in.close();
    }
}