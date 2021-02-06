package br.com.mvbos.lgj;

public class Player implements Comparable<Player>{
    private String name;
    private int score;
    public Player(String name, int score){
        this.name = name;
        this.score = score;
    }
    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }
    //Faz o override do compareTo para que o sort seja feito pelo atributo score
    @Override
    public int compareTo(Player jogador) {
        return (this.getScore() - jogador.getScore() );
    }
    //Faz um override do metodo toString para que o objeto seja mostrado na formatação correta
    @Override
    public String toString() {
        return name + ": " + score;
    }
}
