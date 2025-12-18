package Entidades.Inimigos;

public class Esqueleto extends Inimigo{

    @Override
    void atacar(){
        IO.println("Esqueleto atirou uma flecha.");

    }

    public Esqueleto(){
        super();
    }

}