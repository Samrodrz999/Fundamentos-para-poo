//Examen primer parcial
//Integrantes:

//Christian Leonardo Hernandez Nava
//Samuel Rodrigez Xhochitemo
//Cristhian Brandom Moreno Sanchez

import restauran.res;

public class Main {


    public static void main(String[] args) {


        res res = new res(4, 10);

        System.out.println("\n\nRes....\n\n");
        System.out.println("Estado inicial:");
        System.out.println("Huevos = " + res.getHuevos());
        System.out.println("Chorizo = " + res.getChorizo() + " kg");
        System.out.print("Número de platos que se pueden preparar = ");
        System.out.println(res.getNumPlatos());

        res.addHuevos(2);
        res.addChorizo(9);

        System.out.println("Estado después de añadir huevos y chorizo:");
        System.out.println("Huevos = " + res.getHuevos());
        System.out.println("Chorizo = " + res.getChorizo() + " kg");
        System.out.print("Número de platos que se pueden preparar = ");
        System.out.println(res.getNumPlatos());

        res.sirvePlato();

        System.out.println("Estado después de servir un plato:");
        System.out.println("Huevos = " + res.getHuevos());
        System.out.println("Chorizo = " + res.getChorizo() + " kg");
        System.out.print("Número de platos que se pueden preparar = ");
        System.out.println(res.getNumPlatos());

        res.sirvePlato();
        res.sirvePlato();
        res.sirvePlato();
        res.sirvePlato();
        res.sirvePlato();

        System.out.println("Estado después de servir cinco platos más:");
        System.out.println("Huevos = " + res.getHuevos());
        System.out.println("Chorizo = " + res.getChorizo() + " kg");
        System.out.print("Número de platos que se pueden preparar = ");
        System.out.println(res.getNumPlatos());
    }
}
