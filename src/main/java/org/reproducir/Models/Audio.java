package org.reproducir.Models;

public class Audio {

    private String titulo;
    private String autor;
    private String meGusta;
    private int duracionSegundos;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getMeGusta() {
        return meGusta;
    }
    public void setMeGusta(String meGusta) {
        this.meGusta = meGusta;
    }
    public int getDuracionSegundos() {
        return duracionSegundos;
    }
    public void setDuracionSegundos(int duracionSegundos) {
        this.duracionSegundos = duracionSegundos;
    }

    public void reproducir(){
        System.out.println("Titulo: " + titulo );
        System.out.println("Cantante " + autor );
        System.out.println("Tiempo del audio " + duracionSegundos + "segundos");
    }
    

}
