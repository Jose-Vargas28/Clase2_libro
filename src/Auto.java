public class Auto {
    String marca;
    String modelo;
    int cilindraje;


    public Auto(String marca, String modelo, int cilindraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindraje = cilindraje;
    }

    public void imprimirAuto() {
        System.out.println("La marca es: "+this.marca);
        System.out.println("El modelo es: "+this.modelo);
        System.out.println("El cilindraje es: "+this.cilindraje);
        System.out.println("--------------------");
    }
}
