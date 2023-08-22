package Navegador;

import java.util.ArrayList;
import java.util.List;

public class NavegadorInternet {
    private List<ABA> abas;  

      
  
    /******************************************************/
    
    public NavegadorInternet() {
      abas = new ArrayList<>();
    }

    /******************************************************/
    public void ExibirPagina(String url){
           String Url = "https://www."+url;
           abas.add(new ABA(new Pagina(Url)));
           System.out.println(Url); 
    }
    
    public void AdicionarABAS(){
        ABA novaguia =new ABA(null);
        novaguia.setRefePagina(new Pagina("ContadorPaginas"));
        abas.add(novaguia);
    }

}
