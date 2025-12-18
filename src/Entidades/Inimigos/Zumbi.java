package Entidades.Inimigos;

public class Zumbi extends Inimigo{

    @Override
    void atacar() {
        IO.println("Zumbi usou sua mordida");

    }

    public Zumbi(){
        super();
    }

}