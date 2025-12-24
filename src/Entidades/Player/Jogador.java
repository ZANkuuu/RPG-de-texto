package Entidades.Player;

public class Jogador {
    private String nome;
    private byte level;
    private int hpJogador;
    private int defesaJogador;
    private int danoJogador;
    private Armas arma;
    private Armaduras armadura;

    private int pocaoCura;

    public Jogador(){
        this.hpJogador = 20;
        this.level = 1;
        this.pocaoCura = 1;
    }

    public void curar(int cura){
        this.hpJogador += cura;
        this.pocaoCura -= 1;
    }

    public int ataqueJogador(int defesaInimigo){
        return (5*danoJogador)/(5+defesaInimigo);
    }

    public void tomarDanoJogador(int dano){
        this.hpJogador -= dano;
    }

    public void setDanoJogador(Armas tipoArma){
        switch(tipoArma){
            case Armas.Espada:
                this.danoJogador = 8;
                break;
            case Armas.Machado:
                this.danoJogador = 12;
                break;
        }
    }

    public int getPocaoCura(){
        return pocaoCura;
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