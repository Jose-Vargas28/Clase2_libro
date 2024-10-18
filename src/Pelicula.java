public class Pelicula {
    String titulo;
    String genero;
    int anio;


    public Pelicula(String titulo, String genero, int anio) {
        this.titulo = titulo;
        this.genero = genero;
        this.anio = anio;
    }

    public void imprimirPelicula() {
        System.out.println("La película es: "+this.titulo);
        System.out.println("El género es: "+this.genero);
        System.out.println("El año en que salió es: "+this.anio);
        System.out.println("--------------------");
    }
}
