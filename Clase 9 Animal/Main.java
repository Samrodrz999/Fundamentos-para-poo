import animal.Animal;
import animal.Gato;
import animal.Perro;

public class Main {
    public static void main(String[] args) {
        System.out.println("Integrantes: Cristhian Brandon Moreno Sanchez,");
        System.out.println("Samuel Rodriguez Xochitemo");
        System.out.println("Cristihian Leonardo Hernandez Nava");

        System.out.println("\n\tANIMAL");
        Animal animal1 = new Animal();
        String animal = animal1.toString();
        System.out.println(animal1);
        Animal animal2 = new Animal("Perrito", 3);
        String animal2Info = animal2.toString();
        System.out.println(animal2Info);


        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("\n\tGATO");
        Gato gato1 = new Gato();
        String gato1Info = gato1.toString();
        System.out.println(gato1Info);
        String gato2Info = gato1Info.toString();
        System.out.println(gato2Info);
        Gato gato3 = new Gato("Pelusa", 1, 7);
        String gato3Info = gato3.toString();
        System.out.println(gato3Info);

        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("\n\tPERRO");
        Perro perro1 = new Perro();
        String perro1Info = perro1.toString();
        System.out.println(perro1Info);
        Perro perro2 = new Perro("Firulais", 12);
        String perro2Info = perro2.toString();
        System.out.println(perro2Info);
        Perro perro3 = new Perro("Max", 7, "Pastor Aleman\n");
        String perro3Info = perro3.toString();
        System.out.println(perro3Info);

        Perro perroClonado = perro1.clonar();
        if(perro1.equals(perro2)) {
            System.out.println("Los perros 1 y 2 son iguales");
        } else {
            System.out.println("Los perros 1 y 2 son diferentes\n");
        }

        if(perro1.equals(perroClonado)) {
            System.out.println("Los perros, 1 y el clonado son iguales");
        } else {
            System.out.println("Los perros, 1 y el clonado son iguales");
        }
    }
}