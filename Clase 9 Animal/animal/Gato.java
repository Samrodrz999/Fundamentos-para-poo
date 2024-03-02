package animal;

// Definición de la clase Gato que hereda de la clase Animal
public class Gato extends Animal {
    // Variable miembro privada específica de la clase Gato
    private int vidas;

    // Constructor sin parámetros que inicializa las vidas en 7 por defecto
    public Gato() {
        super(); // Llama al constructor de la clase base (Animal)
        this.vidas = 7; // Inicializa las vidas en 7
    }

    // Constructor con parámetro de vidas (aunque siempre se establece en 7)
    public Gato(int vidas) {
        super(); // Llama al constructor de la clase base (Animal)
        this.vidas = 7; // Inicializa las vidas en 7 (ignorando el parámetro)
    }

    // Constructor con parámetros de nombre, edad y vidas
    public Gato(String nombre, int edad, int vidas) {
        super(nombre, edad); // Llama al constructor de la clase base (Animal) con nombre y edad
        this.vidas = vidas; // Inicializa las vidas con el valor proporcionado
    }

    // Método para obtener el número de vidas del gato
    public int getVidas() {
        return vidas;
    }

    // Método para reducir una vida del gato (si tiene vidas restantes)
    public void quitavida() {
        if (vidas > 0) {
            vidas--; // Reduce una vida del gato
        }
    }

    // Método para representar el objeto en forma de cadena de texto
    @Override
    public String toString() {
        // Retornar un mensaje indicando el nombre, la edad y las vidas del gato
        return "Hola, soy un GATO, me llamo " + getNombre() + ", tengo " + getEdad() + " años y me quedan " + getVidas() + " vidas.";
    }
}
