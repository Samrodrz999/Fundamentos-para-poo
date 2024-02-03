package Herencia;
public class Persona {
    //Atributos
    private String nombre;
    private String apellidos;
    private int edad;
    //Constructor
    public Persona(java.lang.String nombre, java.lang.String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    //Metodos
    public java.lang.String getNombre() {
        return nombre;
    }

    public java.lang.String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }
    @java.lang.Override
    public java.lang.String toString() {
        return "\nNombre=" + getNombre() + "Apellidos=" + getApellidos() + "Edad="+ getEdad();
    }
}
