package erick.munoz.guerrero.models;

/**
 * Created by Lenovo-PC on 04/03/2017.
 */

public class Carro {
    private int idImage;
    private String titulo, description;

    public Carro(int idImage, String titulo, String description) {
        this.idImage = idImage;
        this.titulo = titulo;
        this.description = description;
    }

    public int getIdImage() {
        return idImage;
    }

    public void setIdImage(int idImage) {
        this.idImage = idImage;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
