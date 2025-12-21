package Dominio;

import Entidades.Player.Jogador;

import java.util.ArrayList;
import java.util.List;

public class SaveService {
    private final List<Jogador> playerList = new ArrayList<>();

    public void salvarPersonagem(Jogador jogador){
        playerList.add(jogador);
    }

    public List<Jogador> listPlayers(){
        return List.copyOf(playerList);
    }
}