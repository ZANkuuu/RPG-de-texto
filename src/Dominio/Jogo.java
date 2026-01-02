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
    private final EnemyFactory enemyFactory;

    public Jogo(Jogador jogador, SaveService saveService, Scanner in, CriacaoDePersonagem criacaoDePersonagem,
                Combate combate, EnemyFactory enemyFactory){
        this.jogador = jogador;
        this.saveService = saveService;
        this.in = in;
        this.criacaoDePersonagem = criacaoDePersonagem;
        this.combate = combate;
        this.enemyFactory = enemyFactory;
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

        boolean combateRodando = true;

        while(combateRodando) {
            if (selecao()) {
                combate.combateAtivo(in, jogador, enemyFactory);
            }

            IO.print("""
                    Deseja continuar?
                    [1] - Sim.
                    [2] - Não.
                    Digite: \s""");
            byte escolha = Byte.parseByte(in.nextLine());

            switch(escolha){
                case 1:
                    break;
                case 2:
                    IO.println("Saindo...");
                    combateRodando = false;
                    break;
                default:
                    IO.println("Opção inválida");
            }
        }

    }
}