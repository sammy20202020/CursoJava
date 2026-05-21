package defualt;

public class firstStep {
	
	public static void main(String[] args) {

       
        int a;

        int x, y;

        double x1;

        double x2, y2;

        int a1 = 5, b = 6, c = 7;

        boolean sw = false;

        String cad = null;

        final double PI = 3.14;


        // 2. Convertir cadena  a entero en variable E
        String cadena = "200";
        int E = Integer.parseInt(cadena);

        // 3. Convertir cadeina "20" a entero en variable E1
        String cadena2 = "200";
        int E1 = Integer.valueOf(cadena2);


        // 4. Convertir cadena "200" a float en variable f1
        String cadena3 = "200";
        float f1 = Float.parseFloat(cadena3);


        // 5. Convertir float 23.84f a cadena en variable nomb
        float numero = 23.84f;
        String nomb = String.valueOf(numero);


        
        System.out.println("E = " + E);
        System.out.println("E1 = " + E1);
        System.out.println("f1 = " + f1);
        System.out.println("nomb = " + nomb);
        System.out.println("PI = " + PI);
        
        
        
        /*No es parte del ejercicio*/
        profesorQ s = new profesorQ();

        s.decirHola();

    }
}

