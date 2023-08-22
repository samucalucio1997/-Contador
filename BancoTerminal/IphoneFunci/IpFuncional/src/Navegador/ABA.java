package Navegador;

public class ABA {
   private static String home;
   Pagina refePagina;
   
   
   
   public Pagina getRefePagina() {
    return refePagina;
}
public void setRefePagina(Pagina refePagina) {
    this.refePagina = refePagina;
}
public ABA(Pagina refePagina) {
    this.refePagina = refePagina;
}
static {
     home="https://Defaultpage.com";
   }
public static String getHome() {
    return home;
}
   
}
