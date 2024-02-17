//calse figura:
//participantes: cristhian brandon moreno sanchez
//christian leonardo
//samuel rodriguez
import figurageom.Figura;
import figurageom.Circulo;
import figurageom.Rectangulo;
import figurageom.Cuadrado;
public class Main {
    public static void main(String[] args) {
        // Figura
        Figura figura2 = new Figura("azul", false);
        System.out.println(figura2);

        //circulo
        Circulo circulo1 = new Circulo("verde",true,5.0);
        System.out.println(circulo1);
        System.out.println("Area del circulo: " + circulo1.getArea());
        System.out.println("Perimetro del circulo: " + circulo1.getPerimetro());

        // Rectangulo
        Rectangulo rectangulo1 = new Rectangulo("amarillo",false,4.0,6.0);
        System.out.println(rectangulo1);
        System.out.println("Área del rectangulo: " + rectangulo1.getArea());
        System.out.println("Perimetro del rectangulo: " + rectangulo1.getPerimetro());

        // Cuadrado
        Cuadrado cuadrado1 = new Cuadrado(3.0);
        System.out.println(cuadrado1);
        cuadrado1.setColor("blanco");
        cuadrado1.setRelleno(true);
        System.out.println("Area del cuadrado: " + cuadrado1.getArea());
        System.out.println("Perimetro del cuadrado: " + cuadrado1.getPerimetro());
    }
}