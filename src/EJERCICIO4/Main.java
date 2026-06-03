package EJERCICIO4;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== PARTE 1: Implementación con Interface ===");
        System.out.println();
        
        // Parte 1: Con Interface
        EJERCICIO4.Perro perro1 = new EJERCICIO4.Perro(
            "Firulais", 
            "Pastor Alemán", 
            "Perro", 
            "2020-05-15", 
            25.5f, 
            "Centro de entrenamiento canino"
        );
        
        EJERCICIO4.Gato gato1 = new EJERCICIO4.Gato(
            "Michi", 
            "Siamés", 
            "Gato", 
            "2021-08-20", 
            4.2f, 
            1.5
        );
        
        System.out.println("--- Datos del Perro ---");
        System.out.println("Nombre: " + perro1.getNombre());
        System.out.println("Raza: " + perro1.getRaza());
        System.out.println("Tipo: " + perro1.getTipoAnimal());
        System.out.println("Fecha Nacimiento: " + perro1.getFechaNacimiento());
        System.out.println("Peso: " + perro1.getPeso() + " kg");
        System.out.println("Lugar de Entrenamiento: " + perro1.getLugarEntrenamiento());
        perro1.Comer();
        perro1.TipoAnimal();
        perro1.comunicarse();
        
        System.out.println();
        System.out.println("--- Datos del Gato ---");
        System.out.println("Nombre: " + gato1.getNombre());
        System.out.println("Raza: " + gato1.getRaza());
        System.out.println("Tipo: " + gato1.getTipoAnimal());
        System.out.println("Fecha Nacimiento: " + gato1.getFechaNacimiento());
        System.out.println("Peso: " + gato1.getPeso() + " kg");
        System.out.println("Altura de Salto: " + gato1.getAlturaSalto() + " m");
        gato1.Comer();
        gato1.TipoAnimal();
        gato1.comunicarse();
        
        System.out.println();
        System.out.println("=== PARTE 2: Implementación con Clase Abstracta ===");
        System.out.println();
        
        // Parte 2: Con Clase Abstracta
        EJERCICIO4.parte2.Perro perro2 = new EJERCICIO4.parte2.Perro(
            "Rex", 
            "Golden Retriever", 
            "Perro", 
            "2019-03-10", 
            30.0f, 
            "Escuela de perros"
        );
        
        EJERCICIO4.parte2.Gato gato2 = new EJERCICIO4.parte2.Gato(
            "Pelusa", 
            "Persa", 
            "Gato", 
            "2022-01-05", 
            5.0f, 
            2.0
        );
        
        System.out.println("--- Datos del Perro (Abstract) ---");
        System.out.println("Nombre: " + perro2.getNombre());
        System.out.println("Raza: " + perro2.getRaza());
        System.out.println("Tipo: " + perro2.getTipoAnimal());
        System.out.println("Fecha Nacimiento: " + perro2.getFechaNacimiento());
        System.out.println("Peso: " + perro2.getPeso() + " kg");
        System.out.println("Lugar de Entrenamiento: " + perro2.getLugarEntrenamiento());
        perro2.Comer();
        perro2.TipoAnimal();
        perro2.comunicarse();
        
        System.out.println();
        System.out.println("--- Datos del Gato (Abstract) ---");
        System.out.println("Nombre: " + gato2.getNombre());
        System.out.println("Raza: " + gato2.getRaza());
        System.out.println("Tipo: " + gato2.getTipoAnimal());
        System.out.println("Fecha Nacimiento: " + gato2.getFechaNacimiento());
        System.out.println("Peso: " + gato2.getPeso() + " kg");
        System.out.println("Altura de Salto: " + gato2.getAlturaSalto() + " m");
        gato2.Comer();
        gato2.TipoAnimal();
        gato2.comunicarse();
    }
}
