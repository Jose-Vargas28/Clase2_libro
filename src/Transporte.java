public class Transporte  {
    String tipo;
    int capacidad;
    String color;

    // Constructor
    public Transporte(String tipo, int capacidad, String color) {
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.color = color;
    }

    // Getters
    public String getTipo() {
        return tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getColor() {
        return color;
    }

    // Setters
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void imprimirTransporte() {
        System.out.println("El tipo de transporte es: "+this.tipo);
        System.out.println("La capacidad de personas es: "+this.capacidad);
        System.out.println("El color es: "+this.color);
        System.out.println("--------------------");

    }
}
