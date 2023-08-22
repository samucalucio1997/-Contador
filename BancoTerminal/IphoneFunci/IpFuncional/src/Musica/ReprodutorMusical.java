package Musica;

import java.util.ArrayList;
import java.util.List;

import javax.naming.NoPermissionException;

public class ReprodutorMusical {
    private boolean Isrun;
    private byte volume;
    List<Musica> musicas;
    
    List<Album> albuns;
    
    public ReprodutorMusical(boolean isrun, byte i) {
        Isrun = isrun;
        this.volume = i;
        musicas = new ArrayList<>();
        albuns = new ArrayList<>();
    }
    public boolean tocar(){
         if(!isIsrun()){
             setIsrun(true);
            }  
            
            return this.isIsrun();
        }

        public boolean pausar(){
            if(isIsrun()){
            setIsrun(false);
        }
        return this.Isrun;
    } 
    
    public void SelecionarMusica(Musica musica){
        System.out.println(musica.getNome());
    }
    
    public void AdicionarMusica(Musica musica){
        if(!musicas.contains(musica)){
            musicas.add(musica);
        }
    }

    public void AdicionarAlbum(Album album) throws NoPermissionException{
        if(!albuns.contains(album) ){
            albuns.add(album);
        }else{
            throw new NoPermissionException();
        }
    }
    
    
    
    public boolean isIsrun() {
        return Isrun;
    }
    
    public void setIsrun(boolean isrun) {
        Isrun = isrun;
    }
    
    public byte getVolume() {
        return volume;
    }
    
    public void setVolume(byte volume) {
        this.volume = volume;
    }
    
    public List<Musica> getMusicas() {
        return musicas;
    }
    public List<Album> getAlbuns() {
        return albuns;
    }
}
