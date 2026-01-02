package Dominio;

import Entidades.Inimigos.*;

import java.util.Random;

public class EnemyFactory {

    private static final Random random = new Random();

    public Inimigo randomEnemy(){
        int escolha = random.nextInt(2);

        switch(escolha){
            case 0:
                return new Zumbi();
            case 1:
                return new Esqueleto();
            default:
                throw new IllegalStateException("Erro na criação do inimigo");
        }
    }
}
