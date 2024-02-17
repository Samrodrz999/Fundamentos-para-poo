package figurageom;

public class Circulo extends Figura {
    private double radio;

    public Circulo() {
        super();
        this.radio = 1.0;
    }

    public Circulo(String color, boolean relleno, double radio) {
        super(color, relleno);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Métodos para área y perímetro
    public double getArea() {
        return Math.PI * radio * radio;
    }

    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }

    // toString()
    @Override
    public String toString() {
        return "\nSoy un circulo con radio = " + radio + ", esta es mi superclase: " + super.toString();
    }
}
