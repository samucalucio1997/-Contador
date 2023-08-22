package Telefone;

import java.util.ArrayList;
import java.util.List;

public class AparelhoTelefonico {
  
  String numTel;
  boolean IsLigar;
  List<Contato> contatos; 
  
  
  public AparelhoTelefonico(String numTel, boolean isLigar) {
    this.numTel = numTel;
    IsLigar = isLigar;
    contatos = new ArrayList<>();
  }
  
  
  public boolean ligar(){
        if(!isIsLigar()){
          setIsLigar(true);
        } 
      return isIsLigar();  
  }

  public boolean EncerrarLigacao(){
      if(isIsLigar()){
        setIsLigar(false);
      }
      return isIsLigar();
  }
   
  public boolean CorreiodeVoz(){
          return false;
  }
  
  public List<Contato> ListarContatos(){
    return contatos;
  }
  
  public void AdicionarContato(Contato contato){
    
  }
  public String getNumTel() {
    return numTel;
  }

  public void setNumTel(String numTel) {
    this.numTel = numTel;
  }

  public boolean isIsLigar() {
    return IsLigar;
  }

  public void setIsLigar(boolean isLigar) {
    IsLigar = isLigar;
  }
}
