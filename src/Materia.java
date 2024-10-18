public class Materia {
    private String nombre;
    private String curso;
    private int creditos;


    public Materia(String nombre, String curso, int creditos) {
        this.nombre = nombre;
        this.curso = curso;
        this.creditos = creditos;
    }


    public String getNombre() {
        return nombre;
    }

    public String getCurso() {
        return curso;
    }

    public int getCreditos() {
        return creditos;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }


    public void imprimirMateria() {
        System.out.println("La materia es: "+this.nombre);
        System.out.println("El curso es:: "+this.curso);
        System.out.println("Los créditos que otorga son: "+this.creditos);
        System.out.println("--------------------");
    }
}
