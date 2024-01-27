import temp.temperatura;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        temperatura temperatura1 = new temperatura();

        int opc;

        do {
            System.out.println("Seleccione la manera de convertir la temperatura: ");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Salir");

            System.out.print("Ingrese el número de la opción: ");
            opc = scanner.nextInt();

            double valor;

            switch (opc) {
                case 1:
                    System.out.println("Seleccionaste la Opción 1");
                    System.out.print("Ingrese el valor en grados Celsius: ");
                    valor = scanner.nextDouble();
                    System.out.println("El resultado es: " + temperatura1.celsiusToFahrenheit(valor));
                    break;
                case 2:
                    System.out.println("Seleccionaste la Opción 2");
                    System.out.print("Ingrese el valor en grados Fahrenheit: ");
                    valor = scanner.nextDouble();
                    System.out.println("El resultado es: " + temperatura1.fahrenheitToCelsius(valor));
                    break;
                case 3:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese un número válido.");
            }
        } while (opc != 3);
    }
}
