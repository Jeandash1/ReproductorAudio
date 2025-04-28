package org.reproducir;

import org.reproducir.Models.Audio;

public class Canciones extends Audio {
    
    private String cantante;
    private String album;
    private String genero;

    public String getCantante() {
        return cantante;
    }
    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public String getAlbum() {
        return album;
    }
    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getCalificacion() {
        
        if (getTotalmeGusta() > 100) {
            return 8;
        }else {
            return 5;
        }
    }

}
