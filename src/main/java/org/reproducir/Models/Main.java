package org.reproducir.Models;

import org.reproducir.Canciones;

public class Main {
    public static void main(String[] args) {

        Canciones cancion = new Canciones();

        cancion.setTitulo("Soltera");
        cancion.setAutor("Blessd");
        cancion.setDuracionSegundos(320);
        cancion.setAlbum("W sounds");

        cancion.reproducir();

    }
}