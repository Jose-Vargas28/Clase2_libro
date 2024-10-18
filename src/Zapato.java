public class Zapato {
    String marca;
    int talla;
    String color;

    public Zapato(String marca, int talla, String color) {
        this.marca = marca;
        this.talla = talla;
        this.color = color;
    }

    public void imprimirZapato() {
        System.out.println("La marca de zapatos es: "+this.marca);
        System.out.println("La talla es: "+this.talla);
        System.out.println("El color es: "+this.color);
        System.out.println("--------------------");
    }
}