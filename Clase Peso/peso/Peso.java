package peso;

public class Peso {
    private double peso;
    private String unidad;

    public Peso(double peso, String unidad) {
        this.peso = peso;
        this.unidad = unidad;
    }

    public double getLibras() {
        switch (unidad.toLowerCase()) {
            case "lb":
                return peso;
            case "oz":
                return peso / 16.0;
            case "kg":
                return peso * 2.20462;
            case "gr":
                return peso * 0.00220462;
            default:
                return 0;
        }
    }

    public double getOnzas() {
        switch (unidad.toLowerCase()) {
            case "lb":
                return peso * 16.0;
            case "oz":
                return peso;
            case "kg":
                return peso * 35.27396;
            case "gr":
                return peso * 0.03527396;
            default:
                throw new IllegalArgumentException("Unidad de medida no válida");
        }
    }

    public double getPeso() {
        switch (unidad.toLowerCase()) {
            case "lb":
                return peso * 0.453592;
            case "oz":
                return peso * 0.0283495;
            case "kg":
                return peso;
            case "gr":
                return peso * 0.001;
            default:
                throw new IllegalArgumentException("Unidad de medida no válida");
        }
    }

}
