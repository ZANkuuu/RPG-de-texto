package Entidades.Inimigos;

public class Esqueleto extends Inimigo{

    @Override
    void ataqueInimigo(){
        IO.println("Esqueleto atirou uma flecha.");

    }

    public Esqueleto(){
        super();
    }

}