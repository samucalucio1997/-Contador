package Musica;

import java.util.Date;

public class Musica {
    private String nome;
    private String autor;
    private Date data;


    
    public Musica(String nome, String autor, Date data) {
        this.nome = nome;
        this.autor = autor;
        this.data = data;
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
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    
}
