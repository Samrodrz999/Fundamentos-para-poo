package animal;
public class Perro extends Animal {
    private String raza;
    // Constructor vacio
    public Perro() {
        super();
    }
    // Constructor solo con raza
    public Perro(String raza) {
        this.raza = raza;
    }
    // Constructor nombre y edad
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }
    // Constructor nombre,edad y raza
    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        // Si la raza se proporciona, se establece, de lo contrario, se deja como está
        this.raza = raza != null ? raza : "Desconocido";
    }
    // Método para conseguir la raza del perro
    public String getRaza() {
        return raza;
    }
    // Método para colocar la raza del perro
    public void setRaza(String raza) {
        this.raza = raza;
    }
    // Método para clonar clase perro
    public Perro clonar() {
        Perro perroClon = new Perro(this.getNombre(), this.getEdad(), this.getRaza());
        return perroClon;
    }
    //toString para imprimir la información del perro
    @Override
    public String toString() {
        // Retornar un mensaje indicando el nombre, la edad y la raza del perro
        return "Hola, soy un PERRO, me llamo " + getNombre() + ", tengo " + getEdad() + " años y soy un " + getRaza() + ".";
    }
}