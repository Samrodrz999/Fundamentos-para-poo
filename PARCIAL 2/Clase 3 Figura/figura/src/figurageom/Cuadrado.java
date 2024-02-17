package figurageom;

public class Cuadrado extends Rectangulo {
    // Constructor
    public Cuadrado(double lado) {
        super();
        setLargo(lado);
        setAncho(lado);
    }

    // Método toString() sobrescrito
    @Override
    public String toString() {
        return "\n cuadrado con lados = " + getLargo() + ", esta es mi superclase: " + super.toString();
    }
}