import java.util.LinkedHashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        //para declarar el objeto
        //para instanciar una clase
        Libro libro1= new Libro("El resplandor","Stephen King","de bolsillo",700);
        Libro libro2= new Libro("Habitos Atomicos","James Clear","Penguin Audio",500);
        Libro libro3= new Libro("El Hobbit","J.R.R Tolkien","Booket",448);
        Libro libro4= new Libro("El amor en los tiempos del cólera","Gabriel García Márquez","Vintage",368);
        Libro libro5= new Libro("El principito","Antoine de Saint-Exupéry","El planeta",156);

        System.out.println("Clase Libro: ");
        libro1.imprimir();
        System.out.println(libro1.imprimir_cubierta());
        libro2.imprimir();
        System.out.println(libro2.imprimir_cubierta());
        libro3.imprimir();
        System.out.println(libro3.imprimir_cubierta());
        libro4.imprimir();
        System.out.println(libro4.imprimir_cubierta());
        libro5.imprimir();
        System.out.println(libro5.imprimir_cubierta());

        //clase cancion
        System.out.println("Clase cancion: ");
        Cancion cancion1 = new Cancion("Eye of the tiger", "Rock","Survivor","Eye of the tiger", 1);
        Cancion cancion2 = new Cancion("Bohemian Rhapsody", "Rock","Queen","A Night At The Opera", 11);
        cancion1.imprimirCancion();
        cancion2.imprimirCancion();

        //clase auto
        System.out.println("Clase auto: ");
        Auto auto1 = new Auto("Subaru", "Crosstrek",2000);
        Auto auto2 = new Auto("Mazda", "CX5", 2500);
        auto1.imprimirAuto();
        auto2.imprimirAuto();


        // clase transporte con métodos get and set
        System.out.println("Clase transporte: ");
        Transporte transporte1 = new Transporte("Trole", 100, "Gris");
        Transporte transporte2 = new Transporte("Avión", 180, "Blanco");
        transporte1.imprimirTransporte();
        transporte2.imprimirTransporte();

        //clase materia con métodos get and set

        System.out.println("Clase materia: ");
        Materia materia1 = new Materia("Cálculo", "Gr1", 3);
        Materia materia2 = new Materia("Diseño Web", "Gr4", 4);
        materia1.imprimirMateria();
        materia2.imprimirMateria();

        //clase Inst.Musical
        System.out.println("Clase Instrumento musical: ");
        InstrumentoMusical instrumentom1 = new InstrumentoMusical("Guitarra", "Cuerda", "EEUU");
        InstrumentoMusical instrumentom2 = new InstrumentoMusical("Piano", "Cuerda/percutida", "Europa");
        instrumentom1.imprimirInstrumentoMusical();
        instrumentom2.imprimirInstrumentoMusical();

        //clase película
        System.out.println("Clase Película: ");
        Pelicula pelicula1 = new Pelicula("Avengers", "Acción", 2012);
        Pelicula pelicula2 = new Pelicula("Shrek", "Aventura", 2001);
        pelicula1.imprimirPelicula();
        pelicula2.imprimirPelicula();

        //clase persona
        System.out.println("Clase Persona: ");
        Persona persona1 = new Persona("Juan ","Méndez", 27);
        Persona persona2 = new Persona("Ana ", "Mena", 25);
        persona1.imprimirPersona();
        persona2.imprimirPersona();

        //clase serie
        System.out.println("Clase Serie: ");
        Serie serie1 = new Serie("Avatar", 3, "Aventura");
        Serie serie2 = new Serie("El gato con botas", 4, "Infantil");
        serie1.imprimirSerie();
        serie2.imprimirSerie();

        //clase Videojuego
        System.out.println("Clase Videojuego: ");
        Videojuego juego1 = new Videojuego("The Crew 2", "Ubisoft", "Autos");
        Videojuego juego2 = new Videojuego("Resident Evil 2", "Capcom", "Survival Horror");
        juego1.imprimirVideojuego();
        juego2.imprimirVideojuego();

        //clase zapato
        System.out.println("Clase Zapato: ");
        Zapato zapato1 = new Zapato("Puma", 39, "Negro");
        Zapato zapato2 = new Zapato("Adidas", 40, "Azul");
        zapato1.imprimirZapato();
        zapato2.imprimirZapato();















    }
}
