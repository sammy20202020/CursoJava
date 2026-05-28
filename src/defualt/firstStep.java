package defualt;

import java.util.Scanner;

import defualt.ejercicio1.profesorQ;
import defualt.ejercicio2.Practicas;
import defualt.ejercicio3.Gato;
import defualt.ejercicio3.Perro;

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
            System.out.println("7. Herencia Mamifero, Perro y Gato (ejercicio3)");
            System.out.println("0. Salir");
            System.out.print("Elige una opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();

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
                case 7: {
                    System.out.println("\n--- EJERCICIO 3: Herencia ---");

                    System.out.println("\n=== Datos del PERRO ===");
                    System.out.print("Nombre: ");
                    String nombrePerro = sc.nextLine();
                    System.out.print("Raza: ");
                    String razaPerro = sc.nextLine();
                    System.out.print("Fecha de nacimiento: ");
                    String fechaPerro = sc.nextLine();
                    System.out.print("Peso: ");
                    float pesoPerro = Float.parseFloat(sc.nextLine());
                    System.out.print("Lugar de entrenamiento: ");
                    String lugarEntrenamiento = sc.nextLine();

                    Perro perro = new Perro(nombrePerro, razaPerro, fechaPerro, pesoPerro,
                            lugarEntrenamiento);

                    System.out.println("\n=== Datos del GATO ===");
                    System.out.print("Nombre: ");
                    String nombreGato = sc.nextLine();
                    System.out.print("Raza: ");
                    String razaGato = sc.nextLine();
                    System.out.print("Fecha de nacimiento: ");
                    String fechaGato = sc.nextLine();
                    System.out.print("Peso: ");
                    float pesoGato = Float.parseFloat(sc.nextLine());
                    System.out.print("Altura de salto: ");
                    double alturaSalto = Double.parseDouble(sc.nextLine());

                    Gato gato = new Gato(nombreGato, razaGato, fechaGato, pesoGato, alturaSalto);

                    System.out.println("\n=== Llamando metodos del PERRO ===");
                    perro.comunicarse();
                    perro.comer();

                    System.out.println("\n=== Llamando metodos del GATO ===");
                    gato.comunicarse();
                    gato.comer();
                    break;
                }
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
