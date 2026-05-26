package defualt;

public class profesorQ {

    public void decirHola() {
        System.out.println("Hola");
    }

    public void conversiones() {


        int a;

        int x, y;

        double x1 = 1.5;

        double x2 = 2.5, y2 = 3.5;

        int a1 = 5, b = 6, c = 7;

        boolean sw = false;

        String cad = null;

        final double PI = 3.14;

        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
        System.out.println("y2 = " + y2);
        System.out.println("PI = " + PI);
        // 2. Convertir cadena a entero en variable E
        String cadena = "200";
        int E = Integer.parseInt(cadena) + 100;

        // 3. Convertir cadena "20" a entero en variable E1
        String cadena2 = "200";
        int E1 = Integer.valueOf(cadena2) + 100;

        // 4. Convertir cadena "200" a float en variable f1
        String cadena3 = "200";
        float f1 = Float.parseFloat(cadena3) + 100;

        // 5. Convertir float 23.84f a cadena en variable nomb
        float numero = 23.84f + 100;
        String nomb = String.valueOf(numero);

        System.out.println("E = " + E);
        System.out.println("E1 = " + E1);
        System.out.println("f1 = " + f1);
        System.out.println("numero = " + numero);
        System.out.println("nomb = " + nomb);
    }
}
