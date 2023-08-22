package Telefone;

public class Contato {
   private String num;
   private String nome;
   
   public Contato(String num, String nome) {
       this.num = num;
       this.nome = nome;
   }
public String getNum() {
    return num;
}

public void setNum(String num) {
    this.num = num;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

   
}
