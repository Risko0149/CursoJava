package entidades;

public class Estudiante {
    private String nombre;
    private double nota;

    public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public Estudiante(){

    }

    public String getNombre() {
        return nombre;
    }


    public double getNota() {
        return nota;
    }

}
