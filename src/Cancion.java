public class Cancion {
    String nombre;
    String genero;
    String artista;
    String album;
    int pista;

    //constructor

    public Cancion(String nombre, String genero, String artista, String album, int pista) {
        this.nombre = nombre;
        this.genero = genero;
        this.artista = artista;
        this.album = album;
        this.pista = pista;
    }

    public void imprimirCancion() {
        System.out.println("El nombre es: "+this.nombre);
        System.out.println("El género es: "+this.genero);
        System.out.println("El artista es: "+this.artista);
        System.out.println("El álbum: "+this.album);
        System.out.println("El número de pista es: "+this.pista);
        System.out.println("--------------------");
    }
}
