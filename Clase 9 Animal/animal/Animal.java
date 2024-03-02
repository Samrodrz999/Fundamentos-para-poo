package animal;
import java.util.Objects;
public class Animal implements Cloneable {
    private String nombre;
    private int edad;
    private static int cantidadAnimales = 0;
    // Constructor vacio
    public Animal() {
        this.nombre = "Desconocido";
        this.edad = 0;
        cantidadAnimales++;
    }
    // Constructor con atributos
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        cantidadAnimales++;
    }

    // Método nombre del animal
    public String getNombre() {
        return nombre;
    }

    // Método colocar nombre del animal
    public void setNombre(String nombre) {
    this.nombre = nombre;
    }
    // Método para obtener la edad del animal
    public int getEdad() {

        return edad;
    }
}