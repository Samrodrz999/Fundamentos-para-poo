package figurageom;

public class Figura {
    private String color;
    private boolean relleno;

    // Constructor sin argumentos
    public Figura() {
        this.color = "rojo";
        this.relleno = true;
    }

    // Constructor con argumentos
    public Figura(String color, boolean relleno) {
        this.color = color;
        this.relleno = relleno;
    }

    // Getters y setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }

    // Método toString() sobrescrito
    @Override
    public String toString() {
        String estadoRelleno = relleno ? "rellena" : "no rellena";
        return "Soy una figura de color " + color + " y " + estadoRelleno;
    }
}
