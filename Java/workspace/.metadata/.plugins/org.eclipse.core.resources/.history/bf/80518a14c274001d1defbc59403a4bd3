package Ejercicios7y8.PeliculasVideojuegos;

public class Videojuego implements Activar{
    private String titulo;
    private int duracion = 600;
    private boolean estatus = false;
    private String genero;
    private String compania;


    public Videojuego() {}

    public Videojuego(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public Videojuego(String titulo, int duracion, String genero, String compania) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
        this.compania = compania;
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

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", duracion='" + duracion + '\'' +
                ", estatus=" + estatus +
                ", genero='" + genero + '\'' +
                ", compania='" + compania + '\'' +
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
    public boolean compareTo(int durancionO) {
        if (duracion > durancionO) return true;
        return false;
    }
}
