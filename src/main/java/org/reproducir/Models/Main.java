package org.reproducir.Models;
import org.reproducir.Canciones;
import org.reproducir.Podcast;

public class Main {
    public static void main(String[] args) {

        Canciones cancion = new Canciones();
        Podcast podcast = new Podcast();

        cancion.setTitulo("Soltera");
        cancion.setCantante("Blessd");
        cancion.setGenero("Reggueton");
        cancion.setDuracionSegundos(320);
        cancion.setAlbum("W sounds");

        cancion.escuchar();
        System.out.println("Artista " + cancion.getCantante());
        System.out.println("Genero " + cancion.getGenero());
        System.out.println("Album: " + cancion.getAlbum());

        for (int i = 0; i < 50; i++) {

            cancion.meGusta();    
        }
        for (int i = 0; i < 2000; i++) {
            cancion.reproduciones();
        }

        System.out.println(cancion.getTotalmeGusta());
        System.out.println(cancion.getTotalReproduciones());

        System.out.println("----------------------");

        podcast.setTitulo("El miedo de las voces");
        podcast.setCapitulos(12);
        podcast.setDuracionSegundos(320);
        podcast.setAutor("Ricardo Ajona");
        podcast.setCapitulos(12);
        podcast.setDescripcion("este es un podcast inspirado que narra las mujeres de el maltrato hacia ellas en las familias colombianas");

        
        System.out.println("Presentador: " + podcast.getAutor()); 
        podcast.escuchar();
        System.out.println("Capitulos: " + podcast.getCapitulos());
        System.out.println("Descripcion: " + podcast.getDescripcion());

        for (int i = 0; i < 100; i++) {

            podcast.meGusta();    
        }
        for (int i = 0; i < 8000; i++) {
            podcast.reproduciones();
        }

        System.out.println(podcast.getTotalmeGusta());
        System.out.println(podcast.getTotalReproduciones());

        System.out.println("**        FAVORITOS       **");
        MisFavoritos favoritos = new MisFavoritos();

        favoritos.adiciones(podcast);
        favoritos.adiciones(cancion);
    }
}