/*
// Universidad Politecnica de Tlaxcala - TI
// Fundamentos de POO
// Practica 5
// Integrantes: Cristhian Brandon Moreno Sanchez, Christian Leonardo Hernandez Nava,
// Samuel Rodriguez Xochitemo.
 */
import Coche.Carro;
public class Main {
    public static void main(String[] args) {
        Carro Coche = new Carro();
        Carro coche2 = new Carro("v8", "GOL", 2007,1000);
        System.out.println(coche2.getMarca());
        System.out.println(coche2.getModelo());
        System.out.println(coche2.getAnio());
        System.out.println(Carro.getNumCoche());
    }
}