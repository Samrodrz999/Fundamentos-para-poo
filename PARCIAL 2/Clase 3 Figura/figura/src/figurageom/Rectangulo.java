package figurageom;

public class Rectangulo extends Figura {
    private double largo;
    private double ancho;

    // Constructores
    public Rectangulo() {
        super();
        this.largo = 1.0;
        this.ancho = 1.0;
    }

    public Rectangulo(String color, boolean relleno, double largo, double ancho) {
        super(color, relleno);
        this.largo = largo;
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    // Método para calcular el área
    public double getArea() {
        return largo * ancho;
    }

    // Método para calcular el perímetro
    public double getPerimetro() {
        return 2 * (largo + ancho);
    }

    // Método toString()
    @Override
    public String toString() {
        return " \nRectangulo con largo = " + largo + " y ancho = " + ancho + ", esta es mi superclase: " + super.toString();
    }
}