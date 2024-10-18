public class Videojuego {
    String titulo;
    String desarrollador;
    String genero;


    public Videojuego(String titulo, String desarrollador, String genero) {
        this.titulo = titulo;
        this.desarrollador = desarrollador;
        this.genero = genero;
    }

    public void imprimirVideojuego() {
        System.out.println("El juego es: "+this.titulo);
        System.out.println("El desarrollador es: "+this.desarrollador);
        System.out.println("El género es: "+this.genero);
        System.out.println("--------------------");
    }
}
