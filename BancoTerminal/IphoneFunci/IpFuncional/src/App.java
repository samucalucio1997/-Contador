import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import Musica.*;
import Navegador.NavegadorInternet;

public class App {
    public static void main(String[] args) throws Exception {
        ReprodutorMusical tocador = new ReprodutorMusical(false,(byte)100);
        List<Musica> musicas = new ArrayList<>();
        musicas.add(new Musica("Tamo ai na atividade","Ricardo Ferreira", new SimpleDateFormat("dd/MM/yyyy").parse("20/05/2023")));
        musicas.add(new Musica("Taj mahal","Jorge benjor", new SimpleDateFormat("dd/MM/yyyy").parse("20/05/2023")));
        musicas.add(new Musica("Vale dourado","Jorge benjor", new SimpleDateFormat("dd/MM/yyyy").parse("20/05/2023")));
        Album album = new Album("Val do açaí", "Jorge benjor", 4, musicas);
         Album album1 = new Album("Val do açaí", "Ricardo Ferreira", 4, musicas);
        
        tocador.AdicionarAlbum(album);
        tocador.AdicionarAlbum(album1);

        System.out.println(tocador.getAlbuns().size());
        for (Album album2 : tocador.getAlbuns()) {
                   album2.getMusicas().stream().filter(a -> a.getAutor().equals(album.getAutor())).forEach(a -> tocador.SelecionarMusica(a));
        }

        System.out.println();
        System.out.println();
        for (Album album2 : tocador.getAlbuns()) {
                
                   album2.getMusicas().stream().filter(a -> a.getAutor().equals(album1.getAutor())).forEach(a -> tocador.SelecionarMusica(a));
        }
        
////////////////////////////////////////////////////////////////////////
          NavegadorInternet navegador =new NavegadorInternet();
          navegador.ExibirPagina("google.com"); 




    }
}
