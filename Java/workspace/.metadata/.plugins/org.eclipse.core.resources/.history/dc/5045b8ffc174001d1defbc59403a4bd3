package Ejercicios7y8.PeliculasVideojuegos;

public class Pelicula implements Activar {
    private String titulo;
    private int duracion = 120;
    private boolean estatus;
    private String genero;
    private String director;

    public Pelicula() {}

    public Pelicula(String titulo, String director) {
        this.titulo = titulo;
        this.director = director;
    }

    public Pelicula(String titulo, int duracion, String genero, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", duracion='" + duracion + '\'' +
                ", estatus='" + estatus + '\'' +
                ", genero='" + genero + '\'' +
                ", director='" + director + '\'' +
                '}';
    }

    @Override
    public void activar() {
        estatus = true;
    }

    @Override
    public void desactivar() {
        estatus = false;
    }

    @Override
    public boolean isActive() {
        return estatus;
    }

    @Override
    public boolean compareTo(int duracionO) {
        if (duracion > duracionO) return true;
        return false;
    }

}
