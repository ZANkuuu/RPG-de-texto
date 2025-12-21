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

    abstract void ataqueInimigo();

    void tomarDanoInimigo(int hp, int dano){
        this.hp = hp - dano;
    }

    public int getHp(){
        return this.hp;
    }

}