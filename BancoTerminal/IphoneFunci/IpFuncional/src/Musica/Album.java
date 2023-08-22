package Musica;

import java.util.List;

public class Album {
    private String nome;
    private String autor;
    private int qtd;
    private List<Musica> musicas;


    
    public Album(String nome, String autor, int qtd, List<Musica> musicas) {
        this.nome = nome;
        this.autor = autor;
        this.qtd = qtd;
        this.setMusicas(musicas.stream().filter(n -> n.getAutor().equals(autor)).toList());  
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getQtd() {
        return qtd;
    }
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    public List<Musica> getMusicas() {
        return musicas;
    }
    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }
    
}
