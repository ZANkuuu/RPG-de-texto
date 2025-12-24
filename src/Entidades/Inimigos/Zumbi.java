package Entidades.Inimigos;

public class Zumbi extends Inimigo{
    private int danoZumbi;

    @Override
    public int ataqueInimigo(int defesaJogador) {
        return (5*danoZumbi)/(5+defesaJogador);
    }

    public Zumbi(){
        super();
        this.danoZumbi = 10;
    }

    public String toString(){
        return "Zumbi";
    }
}