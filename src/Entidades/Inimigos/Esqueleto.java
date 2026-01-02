package Entidades.Inimigos;

import Entidades.Player.Jogador;

public class Esqueleto extends Inimigo{
    private int danoEsqueleto;

    @Override
    public void ataqueInimigo(Jogador jogador){
        IO.println("Esqueleto atirou uma flecha.");
        IO.println("Esqueleto causou " + (5*danoEsqueleto)/(5+jogador.getDefesaJogador()) + " de dano.");
        jogador.tomarDanoJogador((5*danoEsqueleto)/(5+jogador.getDefesaJogador()));
    }

    public Esqueleto(){
        super();
        this.danoEsqueleto = 12;
    }

    public String toString(){
        return "Esqueleto";
    }
}