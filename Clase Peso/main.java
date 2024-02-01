//examen intento 2
//integrantes: samuel rodriguez, cristhian brandon moreno, christhian leonardo
//clase peso
import peso.Peso;

public class main {
    public static void main(String[] args) {
        Peso p1 = new Peso(10, "oz");    // 10 onzas
        Peso p2 = new Peso(10, "lb");    // 10 libras
        Peso p3 = new Peso(10, "kg");    // 10 kilogramos
        Peso p4 = new Peso(10, "gr");    // 10 gramos

        System.out.println("PROBANDO EL METODO getPeso():");
        System.out.println("Diez onzas son " + p1.getPeso() + " kg");
        System.out.println("Diez libras son " + p2.getPeso() + " kg");
        System.out.println("Diez kilogramos son " + p3.getPeso() + " kg");
        System.out.println("Diez gramos son " + p4.getPeso() + " kg");

        System.out.println("PROBANDO EL RESTO DE GETTERS:");
        System.out.println("Diez kg son " + p3.getOnzas() + " oz");
        System.out.println("Diez kg son " + p3.getLibras() + " lb");
        System.out.println("Diez kg son " + p3.getPeso() + " gr");
    }
}
