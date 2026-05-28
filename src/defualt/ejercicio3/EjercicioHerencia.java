package defualt.ejercicio3;

import java.util.Scanner;

/** Ejercicio 3: Herencia Mamifero, Perro y Gato */
public class EjercicioHerencia {

    public static void ejecutar(Scanner sc) {
        System.out.println("--- EJERCICIO 3: Herencia (ejercicio3) ---");

        System.out.println("\n=== Datos del PERRO ===");
        System.out.print("Nombre: ");
        String nombrePerro = sc.nextLine();

        System.out.print("Raza: ");
        String razaPerro = sc.nextLine();

        System.out.print("Fecha de nacimiento (dd/mm/aaaa): ");
        String fechaPerro = sc.nextLine();

        System.out.print("Peso: ");
        float pesoPerro = sc.nextFloat();
        sc.nextLine();

        System.out.print("Lugar de entrenamiento: ");
        String lugarEntrenamiento = sc.nextLine();

        Perro perro = new Perro(nombrePerro, razaPerro, fechaPerro, pesoPerro, lugarEntrenamiento);

        System.out.println("\n=== Datos del GATO ===");
        System.out.print("Nombre: ");
        String nombreGato = sc.nextLine();

        System.out.print("Raza: ");
        String razaGato = sc.nextLine();

        System.out.print("Fecha de nacimiento (dd/mm/aaaa): ");
        String fechaGato = sc.nextLine();

        System.out.print("Peso: ");
        float pesoGato = sc.nextFloat();
        sc.nextLine();

        System.out.print("Altura de salto: ");
        double alturaSalto = sc.nextDouble();
        sc.nextLine();

        Gato gato = new Gato(nombreGato, razaGato, fechaGato, pesoGato, alturaSalto);

        System.out.println("\n=== Resultados ===");
        System.out.println("Perro: " + perro.getNombre() + " | Raza: " + perro.getRaza()
                + " | Fecha: " + perro.getFechaNacimiento() + " | Peso: " + perro.getPeso()
                + " | Entrenamiento: " + perro.getLugarEntrenamiento());

        System.out.print("Comunicarse (perro): ");
        perro.comunicarse();
        perro.comer();

        System.out.println("\nGato: " + gato.getNombre() + " | Raza: " + gato.getRaza()
                + " | Fecha: " + gato.getFechaNacimiento() + " | Peso: " + gato.getPeso()
                + " | Altura salto: " + gato.getAlturaSalto());

        System.out.print("Comunicarse (gato): ");
        gato.comunicarse();
        gato.comer();
    }
}
