package Entidades.Inimigos;

import Entidades.Player.Jogador;

public class Zumbi extends Inimigo{
    private int danoZumbi;

    @Override
    public void ataqueInimigo(Jogador jogador) {
        IO.println("Zumbi usou sua mordida");
        IO.println("Zumbi causou " + (5*danoZumbi)/(5+jogador.getDefesaJogador()) + " de dano.");
        jogador.tomarDanoJogador((5*danoZumbi)/(5+jogador.getDefesaJogador()));
    }

    public Zumbi(){
        super();
        this.danoZumbi = 10;
    }

    public String toString(){
        return "Zumbi";
    }
}