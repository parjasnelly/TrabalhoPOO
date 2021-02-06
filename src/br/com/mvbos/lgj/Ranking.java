package br.com.mvbos.lgj;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ranking {
    private List<Player> lista = new ArrayList<>();

    public Ranking(){
        // Lê o arquivo ranking.txt e guarda na arrayList
        try {
            BufferedReader input = new BufferedReader(new FileReader("ranking.txt"));
            while (input.ready()){
                lista.add(new Player(input.readLine(), Integer.parseInt(input.readLine())));
            }
            input.close();
        } catch (IOException e) {
            System.out.println("Erro ao abrir o arquivo");
        }

    }

    // retorna o obj player que está na posição idx da arrayList
    public String getPlayer(int idx) {
        return lista.get(idx).toString();
    }

    //Retorna o tamanho da arrayList
    public int getSize(){
        return lista.size();
    }

    //Adiciona um obj Player à lista
    public void addPlayer(Player player) {
        this.lista.add(player);
    }

    //Faz o sort em ordem decresente da lista
    public void sortRanking(){
        Collections.sort(lista, Collections.reverseOrder());
    }
    // Guarda os dados da lista no arquivo ranking.txt
    public void saveRanking(){
        try{
            BufferedWriter output = new BufferedWriter(new FileWriter("ranking.txt"));
            for (Player player : lista) {
                output.write(player.getName() + "\n");
                output.write(player.getScore() + "\n");
            }
            output.close();
        } catch(IOException e){
            System.out.println("Erro ao escrever no arquivo");
        }
    }
}
