public class Serie {
    String titulo;
    int temporadas;
    String genero;

    public Serie(String titulo, int temporadas, String genero) {
        this.titulo = titulo;
        this.temporadas = temporadas;
        this.genero = genero;
    }

    public void imprimirSerie() {
        System.out.println("El nombre es: "+this.titulo);
        System.out.println("El número de temporadas son: "+this.temporadas);
        System.out.println("El género es: "+this.genero);
        System.out.println("--------------------");
    }
}
