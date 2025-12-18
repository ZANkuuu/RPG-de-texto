package Entidades.Inimigos;

public abstract class Inimigo {
    private byte level;
    private int hp;

    public Inimigo(){
        this.level = 1;
        this.hp = 10;
    }

    abstract void atacar();

    void tomarDano(){

    }

}