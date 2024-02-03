package Herencia;
public class Practicante extends Alumno {
    //Atributos propios de la subclase
    private String idpracticante;
    //Constructor
    public Practicante(java.lang.String nombre, java.lang.String apellidos, int edad, java.lang.String idpracticante) {
        super(nombre, apellidos, edad, idpracticante);
        this.idpracticante = idpracticante;
    }
    //Get y Set del atributos propid de la subclase

    public java.lang.String getIdpracticante() {
        return idpracticante;
    }

    public void setIdpracticante(java.lang.String idpracticante) {
        this.idpracticante = idpracticante;
    }
    //Mostrar información de la subclase
    @java.lang.Override
    public java.lang.String toString() {
        return "\nNombre=" + getNombre() + "Apellidos=" + getApellidos() + "Edad=" + getEdad() + "\nidpracticante=" + idpracticante;
    }
}
