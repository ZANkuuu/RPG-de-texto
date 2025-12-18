import java.util.Scanner;

public class Main{

    static void main() {
        Scanner in = new Scanner(System.in);

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
                Jogo.fazerPersonagem();
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