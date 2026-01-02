package Entidades.Inimigos;

import Entidades.Player.Jogador;

public class Inimigo implements AcoesInimigo{
    private byte level;
    private int hp;
    private int defesaInimigo;

    public Inimigo(){
        this.level = 1;
        this.hp = 10;
        this.defesaInimigo = 3;
    }

    public void tomarDanoInimigo(int dano){
        this.hp -= dano;
    }

    public int getHp(){
        return hp;
    }

    public int getDefesaInimigo(){
        return defesaInimigo;
    }

    @Override
    public void ataqueInimigo(Jogador jogador) {

    }
}