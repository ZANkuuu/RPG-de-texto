package Entidades.Player;

public class Jogador {
    private String nome;
    private byte level;
    private int hp;
    private Armas arma;
    private Armaduras armadura;

    public Jogador(){
        this.hp = 20;
        this.level = 1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null || nome.isBlank()) {
            throw new RuntimeException("Escolha um nome válido!");
        }

        this.nome = nome;
    }

    public byte getLevel() {
        return level;
    }

    public void setLevel(byte level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Armas getArma() {
        return arma;
    }

    public void setArma(Armas arma) {
        this.arma = arma;
    }

    public Armaduras getArmadura() {
        return armadura;
    }

    public void setArmadura(Armaduras armadura) {
        this.armadura = armadura;
    }

    @Override
    public String toString(){
        return "Nome do jogador: " + getNome() + ".\n" +
               "Nível: " + getLevel() + ".\n" +
               "Hp: " + getHp() + ".\n" +
               "Arma: " + getArma() + ".\n" +
               "Armadura: " + getArmadura() + ".\n";
    }
}