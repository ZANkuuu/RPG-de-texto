package Dominio;

import Entidades.Player.Jogador;
import GUI.Combate;
import GUI.CriacaoDePersonagem;

import java.util.Scanner;

public class Jogo {
    private final Jogador jogador;
    private final SaveService saveService;
    private final Scanner in;
    private final CriacaoDePersonagem criacaoDePersonagem;
    private final Combate combate;

    public Jogo(Jogador jogador, SaveService saveService, Scanner in, CriacaoDePersonagem criacaoDePersonagem, Combate combate){
        this.jogador = jogador;
        this.saveService = saveService;
        this.in = in;
        this.criacaoDePersonagem = criacaoDePersonagem;
        this.combate = combate;
    }

    boolean selecao(){
        while(true) {
            IO.print("""
                    ======================
                    [1] - Lutar
                    [2] - Ver personagem
                    [3] - Desistir
                    ======================
                    """);
            IO.print("Escolha uma opção: ");
            byte escolha = Byte.parseByte(in.nextLine());

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

    public void fluxoDeJogo(){
        criacaoDePersonagem.criarPersonagem(in, jogador, saveService);

        if(selecao()){
            combate.combateAtivo(in, jogador);
        }

    }
}