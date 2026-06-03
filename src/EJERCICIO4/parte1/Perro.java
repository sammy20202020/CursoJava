package EJERCICIO4.parte1;

public class Perro extends Mamiferos {
    private String lugarEntrenamiento;

    public Perro(String nombre, String raza, String tipoAnimal, String fechaNacimiento, float peso, String lugarEntrenamiento) {
        super(nombre, raza, tipoAnimal, fechaNacimiento, peso);
        this.lugarEntrenamiento = lugarEntrenamiento;
    }

    @Override
    public void comunicarse() {
        System.out.println(getNombre() + " dice: guau guau");
    }

    public String getLugarEntrenamiento() {
        return lugarEntrenamiento;
    }
}
