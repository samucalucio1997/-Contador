package Navegador;

public class Pagina {
    private String Url="https://";

    

    public Pagina(String url) {
        Url += url;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }
}
