package defualt;

import java.util.Scanner;

import defualt.ejercicio1.profesorQ;
import defualt.ejercicio2.Practicas;

public class firstStep {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("===== PRACTICAS JAVA =====");
            System.out.println("1. Conversiones (profesorQ.conversiones)");
            System.out.println("2. Suma y promedio de 10 numeros");
            System.out.println("3. Menor y mayor de 10 numeros");
            System.out.println("4. Multiplos de un divisor en 10 numeros");
            System.out.println("5. Buscar un numero en un arreglo de 10");
            System.out.println("6. Operaciones con dos matrices 3x3");
            System.out.println("0. Salir");
            System.out.print("Elige una opcion: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1: {
                    profesorQ p = new profesorQ();
                    p.conversiones();
                    break;
                }
                case 2:
                    Practicas.ejercicio1(sc);
                    break;
                case 3:
                    Practicas.ejercicio2(sc);
                    break;
                case 4:
                    Practicas.ejercicio3(sc);
                    break;
                case 5:
                    Practicas.ejercicio4(sc);
                    break;
                case 6:
                    Practicas.ejercicio5(sc);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

            System.out.println();
        } while (opcion != 0);

        sc.close();
    }
}
