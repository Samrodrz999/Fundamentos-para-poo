import java.util.Scanner;
public class main {
    //Integrantes: Christian Brandon Moreno Sanchez
    // Cristhian Leonardo Hernández Nava
    // Samuel Rodriguez Xochitemo
    public static void main(String[] args){
        int numint;
        double numdbl, res1, res2, res3, res4, res5, res6;
        System.out.println("Bienvenido, favor de seguir las instrucciones\n");
        //Crea un objeto Scanner para leer la entrada.
        Scanner scanner = new Scanner(System.in);
        //nex int solo admite búmeros enteros y evita los datos de otro tipo.
        System.out.println("\nDigite un número entero");
        //similar que nexint, pero ahora con números decimales.
        numint = scanner.nextInt();
        System.out.println("\nDigite un número decimal");
        numdbl = scanner.nextDouble();
        //Realizar varias operaciones con los números introducidos y de
        // ser necesario cambia el tipo de dato para hacer la repetición.
        res1 = numdbl + numint; // Suma.
        res2 = numint / (int) numdbl; // División entera.
        res3 = numint / numdbl; // Division real.
        res4 = numdbl / numint; // Division real.
        res5 = (int)numdbl / numint;
        res6 = (int)numdbl + numint; // Suma
        System.out.println("\n El valor de la operación ="+ res1);
        System.out.println("\n El valor de la operación ="+ res2);
        System.out.println("\n El valor de la operación ="+ res3);
        System.out.println("\n El valor de la operación ="+ res4);
        System.out.println("\n El valor de la operación ="+ res5);
        System.out.println("\n El valor de la operación ="+ res6);
    }
}