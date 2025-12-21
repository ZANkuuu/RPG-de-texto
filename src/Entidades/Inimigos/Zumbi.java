package Entidades.Inimigos;

public class Zumbi extends Inimigo{

    @Override
    void ataqueInimigo() {
        IO.println("Zumbi usou sua mordida");

    }

    public Zumbi(){
        super();
    }

}