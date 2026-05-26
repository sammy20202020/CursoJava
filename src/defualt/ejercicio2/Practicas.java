package defualt.ejercicio2;

import java.util.Scanner;

/** Ejercicio 2: Arreglos y matrices del libro */
public class Practicas {

    public static void menu(Scanner sc) {
        int opcion;

        do {
            System.out.println("--- EJERCICIO 2: Practicas.java ---");
            System.out.println("1. Suma y promedio de 10 numeros");
            System.out.println("2. Menor y mayor de 10 numeros");
            System.out.println("3. Multiplos de un divisor en 10 numeros");
            System.out.println("4. Buscar un numero en un arreglo de 10");
            System.out.println("5. Operaciones con dos matrices 3x3");
            System.out.println("0. Volver al menu principal");
            System.out.print("Elige una opcion: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    ejercicio1(sc);
                    break;
                case 2:
                    ejercicio2(sc);
                    break;
                case 3:
                    ejercicio3(sc);
                    break;
                case 4:
                    ejercicio4(sc);
                    break;
                case 5:
                    ejercicio5(sc);
                    break;
                case 0:
                    System.out.println("Volviendo al menu principal...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

            System.out.println();
        } while (opcion != 0);
    }

    // 2.1 Suma y promedio de 10 numeros
    public static void ejercicio1(Scanner sc) {
        double suma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingresa el numero " + i + ": ");
            double n = sc.nextDouble();
            suma += n;
        }

        double promedio = suma / 10;
        System.out.println("Suma = " + suma);
        System.out.println("Promedio = " + promedio);
    }

    // 2.2 Menor y mayor de 10 numeros
    public static void ejercicio2(Scanner sc) {
        double menor = 0;
        double mayor = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingresa el numero " + i + ": ");
            double n = sc.nextDouble();

            if (i == 1) {
                menor = n;
                mayor = n;
            } else {
                if (n < menor) {
                    menor = n;
                }
                if (n > mayor) {
                    mayor = n;
                }
            }
        }

        System.out.println("Menor = " + menor);
        System.out.println("Mayor = " + mayor);
    }

    // 2.3 Multiplos de un divisor en 10 numeros
    public static void ejercicio3(Scanner sc) {
        System.out.print("Ingresa el divisor: ");
        int divisor = sc.nextInt();

        System.out.println("Ingresa 10 numeros:");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Numero " + i + ": ");
            int n = sc.nextInt();

            if (n % divisor == 0) {
                System.out.println(n + " es multiplo de " + divisor);
            } else {
                System.out.println(n + " NO es multiplo de " + divisor);
            }
        }
    }

    // 2.4 Buscar un numero en un arreglo de 10
    public static void ejercicio4(Scanner sc) {
        int[] datos = new int[10];

        System.out.println("Ingresa 10 numeros para el arreglo:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Posicion " + i + ": ");
            datos[i] = sc.nextInt();
        }

        System.out.print("Ingresa el numero a buscar: ");
        int buscado = sc.nextInt();

        boolean encontrado = false;
        int posicion = -1;

        for (int i = 0; i < 10; i++) {
            if (datos[i] == buscado) {
                encontrado = true;
                posicion = i;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Numero encontrado en la posicion " + posicion + " del arreglo.");
        } else {
            System.out.println("El numero no se encuentra en el arreglo.");
        }
    }

    // 2.5 Operaciones con dos matrices 3x3
    public static void ejercicio5(Scanner sc) {
        int[][] A = new int[3][3];
        int[][] B = new int[3][3];

        System.out.println("Ingresa los elementos de la matriz A (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Ingresa los elementos de la matriz B (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                B[i][j] = sc.nextInt();
            }
        }

        System.out.print("Ingresa un numero para multiplicar cada matriz: ");
        int k = sc.nextInt();

        System.out.println("Matriz A * " + k + ":");
        imprimirMatriz(multiplicarPorEscalar(A, k));

        System.out.println("Matriz B * " + k + ":");
        imprimirMatriz(multiplicarPorEscalar(B, k));

        System.out.println("A + B:");
        imprimirMatriz(sumarMatrices(A, B));

        System.out.println("A * B:");
        imprimirMatriz(multiplicarMatrices(A, B));
    }

    private static int[][] multiplicarPorEscalar(int[][] M, int k) {
        int[][] R = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                R[i][j] = M[i][j] * k;
            }
        }
        return R;
    }

    private static int[][] sumarMatrices(int[][] A, int[][] B) {
        int[][] R = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                R[i][j] = A[i][j] + B[i][j];
            }
        }
        return R;
    }

    private static int[][] multiplicarMatrices(int[][] A, int[][] B) {
        int[][] R = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int suma = 0;
                for (int k = 0; k < 3; k++) {
                    suma += A[i][k] * B[k][j];
                }
                R[i][j] = suma;
            }
        }
        return R;
    }

    private static void imprimirMatriz(int[][] M) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(M[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
