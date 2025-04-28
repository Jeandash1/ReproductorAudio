package org.reproducir;
import org.reproducir.Models.Audio;

public class Podcast extends Audio {
    
    private String autor;
    private int capitulos;
    private String descripcion;

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCapitulos() {
        return capitulos;
    }
    public void setCapitulos(int capitulos) {
        this.capitulos = capitulos;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int getCalificacion() {
        
        if (getTotalReproduciones() >= 2000) {
            return 9;
        }else {
            return 2;
        }
    }

}
