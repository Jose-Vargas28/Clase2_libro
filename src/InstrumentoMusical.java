public class InstrumentoMusical {
    String nombre;
    String tipo;
    String origen;


    public InstrumentoMusical(String nombre, String tipo, String origen) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.origen = origen;
    }

    public void imprimirInstrumentoMusical() {
        System.out.println("El instrumento es: "+this.nombre);
        System.out.println("El tipo de instrumento es: "+this.tipo);
        System.out.println("Fabricado en: "+this.origen);
        System.out.println("--------------------");
    }
}