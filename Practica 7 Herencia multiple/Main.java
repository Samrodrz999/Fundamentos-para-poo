//Universidad Politecnica de Tlaxcala
//Practica 7 Herencia Multinivel y Jerarquica
//Integrantes: Cristhian Brandon Moreno Sanchez, Samuel Rodriguez Xochitemo
//Christian Hernandez Nava
import Herencia.Alumno;
import Herencia.Persona;
import Herencia.Practicante;
import Herencia.Profesor;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nCLASE PROFESOR");
        Profesor p1 = new Profesor("Saúl Olaf\n","Loaiza Melendez\n",45,"131\n");
        System.out.println(p1.toString());

        System.out.println("\nCLASE PERSONA");
        Persona perso1 = new Persona("Cristobal\n","Esquivel Sanchez\n",21);
        System.out.println(perso1.toString());

        System.out.println("\nCLASE ALUMNO");
        Alumno alum1 = new Alumno("Leonardo\n","Zarate Medina\n",35, "439\n");
        System.out.println(alum1.toString());

        System.out.println("\nCLASE PRACTICANTE");
        Practicante pract1 = new Practicante("Sergio\n","Negrete Gutierrez\n",90,"350");
        System.out.println(pract1.toString());
    }
}