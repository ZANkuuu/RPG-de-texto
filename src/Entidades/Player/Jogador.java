package Entidades.Player;

public class Jogador {
    private String nome;
    private byte level;
    private int hpJogador;
    private int defesaJogador;
    private Armas arma;
    private Armaduras armadura;

    public Jogador(){
        this.hpJogador = 20;
        this.level = 1;
    }

    void ataqueJogador(){

    }

    void tomarDanoJogador(int hp, int dano){
        this.hpJogador = hp - dano;
    }

    public int getDefesaJogador() {
        return defesaJogador;
    }

    public void setDefesaJogador(Armaduras tipoArmadura) {
        switch(tipoArmadura){
            case Armaduras.Leve:
                this.defesaJogador = 5;
                break;
            case Armaduras.Pesada:
                this.defesaJogador = 10;
                break;
        }
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
        return hpJogador;
    }

    public void setHpJogador(int hpJogador) {
        this.hpJogador = hpJogador;
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
               "Armadura: " + getArmadura() + " (" + getDefesaJogador() + " Defense).\n";
    }
}