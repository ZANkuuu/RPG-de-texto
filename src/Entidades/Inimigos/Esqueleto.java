package Entidades.Inimigos;

public class Esqueleto extends Inimigo{

    @Override
    public int ataqueInimigo(int defesaJogador){
        IO.println("Esqueleto atirou uma flecha.");
        return 2;
    }

    public Esqueleto(){
        super();
    }

}