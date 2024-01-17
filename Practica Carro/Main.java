/*
// Universidad Politecnica de Tlaxcala - TI
// Fundamentos de POO
// Practica
// Objetivo: Aplicacion para llevar el registro de un coche para tener los datos de mantenimiento
// y consumo de gasolina
// Integrantes: Cristhian Brandon Moreno Sanchez, Christian Leonardo Hernandez Nava,
// Samuel Rodriguez Xochitemo.
 */
import Mantenimiento.Carro;
import Mantenimiento.Carro2;
import Mantenimiento.Carro3;

public class Main {
    public static void main(String[] args) {
        //Documentar
        Carro carro = new Carro();
        //Documentar
        carro.setMarca("Nissan");
        System.out.println(carro.getMarca());

        carro.setModelo("\nTsuru");
        System.out.println(carro.getModelo());

        carro.setColor("\nBlanco");
        System.out.println((carro.getColor()));

        Carro2 carro2 = new Carro2();
        //Documentar
        carro.setMarca("\nToyota");
        System.out.println(carro.getMarca());

        carro.setModelo("\nSupra");
        System.out.println(carro.getModelo());

        carro.setColor("\nMorado");
        System.out.println((carro.getColor()));

        Carro3 carro3 = new Carro3();
        //Documentar
        carro.setMarca("\nChevrolet");
        System.out.println(carro.getMarca());

        carro3.setModelo("\nCorvette");
        System.out.println(carro3.getModelo());

        carro3.setColor("\nGris");
        System.out.println((carro3.getColor()));
    }
}