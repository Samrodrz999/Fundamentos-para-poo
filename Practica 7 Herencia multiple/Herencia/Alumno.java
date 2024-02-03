package Herencia;

public class Alumno extends Persona {
    //Atriburo
    private String idalumno;

    //Constructor
    public Alumno(java.lang.String nombre, java.lang.String apellidos, int edad, java.lang.String idalumno) {
        super(nombre, apellidos, edad);
        this.idalumno = idalumno;
    }

    //Metodos set y get del atributo
    public java.lang.String getIdalumno() {
        return idalumno;
    }

    public void setIdalumno(java.lang.String idalumno) {
        this.idalumno = idalumno;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "\nNombre=" + getNombre() + "Apellidos=" + getApellidos() + "Edad=" + getEdad() + "\nidalumno=" + idalumno;
        }
    }
