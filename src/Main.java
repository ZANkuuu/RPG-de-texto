import Dominio.Jogo;
import Dominio.SaveService;
import Entidades.Player.Jogador;
import GUI.Combate;
import GUI.CriacaoDePersonagem;
import GUI.Menu;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);

        SaveService saveService = new SaveService();
        Jogador jogador = new Jogador();
        CriacaoDePersonagem criacaoDePersonagem = new CriacaoDePersonagem();
        Combate combate = new Combate();

        Jogo jogo = new Jogo(jogador, saveService, in, criacaoDePersonagem, combate);
        Menu menu = new Menu(in, jogo);

        menu.menuPrincipal();

        in.close();
    }
}