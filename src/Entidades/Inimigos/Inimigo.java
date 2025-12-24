package Entidades.Inimigos;

public abstract class Inimigo {
    private byte level;
    private int hp;
    private int defesaInimigo;

    public Inimigo(){
        this.level = 1;
        this.hp = 10;
        this.defesaInimigo = 3;
    }

    abstract int ataqueInimigo(int defesaJogador);

    public void tomarDanoInimigo(int dano){
        this.hp -= dano;
    }

    public int getHp(){
        return hp;
    }

    public int getDefesaInimigo(){
        return defesaInimigo;
    }
}