package Coche;
public class Carro {
    private String marca;
    private String modelo;
    private int anio;
    private int velocidadActual;
    private static int numCoche;
    //Constructor
    public Carro(){
        marca="";
        modelo="";
        anio=0;
        velocidadActual=0;
        contarCoche();
    }
    public Carro(String marca, String modelo, int anio, int velocidadActual){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.velocidadActual = velocidadActual;
        contarCoche();
    }
    static void contarCoche(){
        numCoche++;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public static int getNumCoche() {
        return numCoche;
    }
}