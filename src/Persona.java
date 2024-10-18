public class Persona {
    String nombre;
    String apellido;
    int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public void imprimirPersona() {
        System.out.println("El nombre es: "+this.nombre);
        System.out.println("El apellido es: "+this.apellido);
        System.out.println("Su edad es: "+this.edad);
        System.out.println("--------------------");
    }
}
