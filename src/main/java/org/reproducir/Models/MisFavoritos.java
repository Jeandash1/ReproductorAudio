package org.reproducir.Models;

public class MisFavoritos {

    public void adiciones(Audio audio){
        if (audio.getCalificacion() >= 8) {
            System.out.println( audio.getTitulo() + " es mi favoritos del momento");
        }else{
            System.out.println(audio.getTitulo() + " es mi favorito del momento");
        }
    }
    
}
