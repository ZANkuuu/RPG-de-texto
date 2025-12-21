import Dominio.Jogo;
import Dominio.SaveService;
import Entidades.Player.Jogador;
import GUI.CriacaoDePersonagem;
import GUI.Menu;

import java.util.Scanner;

public class Main {
    static void main() {
        SaveService saveService = new SaveService();
        Jogador jogador = new Jogador();
        CriacaoDePersonagem criacaoDePersonagem = new CriacaoDePersonagem();
        Scanner in = new Scanner(System.in);


        Jogo jogo = new Jogo(jogador, saveService, in, criacaoDePersonagem);
        Menu menu = new Menu(in, jogo);

        menu.menuPrincipal();

        in.close();
    }
}