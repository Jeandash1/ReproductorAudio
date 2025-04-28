package org.reproducir.Models;

public class Audio {

    private String titulo;
    private int TotalmeGusta;
    private int duracionSegundos;
    private int calificacion;
    private int totalReproduciones;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getTotalmeGusta() {
        return TotalmeGusta;
    }
    public void setTotalmeGusta(int totalmeGusta) {
        this.TotalmeGusta++;
    }
    public int getDuracionSegundos() {
        return duracionSegundos;
    }
    public void setDuracionSegundos(int duracionSegundos) {
        this.duracionSegundos = duracionSegundos;
    }

    public int getCalificacion() {
        return calificacion;
    }
    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    public int getTotalReproduciones() {
        return totalReproduciones;
    }
    public void setTotalReproduciones(int totalReproduciones) {
        this.totalReproduciones = totalReproduciones;
    }
    
    public void escuchar(){
        System.out.println("Titulo: " + titulo );
        System.out.println("Tiempo del audio " + duracionSegundos + "segundos");
    }

    public void meGusta(){
        this.TotalmeGusta++;
    }
    
    public void reproduciones(){
        this.totalReproduciones++;
    }
    
}
