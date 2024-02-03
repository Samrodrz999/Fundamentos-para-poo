package Herencia;

public class Profesor extends Persona {
    //Atributos
    private String idprofesor;
    //Constructor

    public Profesor(java.lang.String nombre, java.lang.String apellidos, int edad, java.lang.String idprofesor) {
        super(nombre, apellidos, edad);
        this.idprofesor = idprofesor;
    }

    //Get y Set del atributo
    public java.lang.String getIdprofesor() {
        return idprofesor;
    }

    public void setIdprofesor(java.lang.String idprofesor) {
        this.idprofesor = idprofesor;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "\nNombre=" + getNombre() + "Apellidos=" + getApellidos() + "Edad=" + getEdad() + "\nidprofesor=" + idprofesor;
    }
}
