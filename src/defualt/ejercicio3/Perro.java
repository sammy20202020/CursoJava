package defualt.ejercicio3;

public class Perro extends Mamifero {

    private String lugarEntrenamiento; // string (30)

    public Perro() {
    }

    public Perro(String nombre, String raza, String fechaNacimiento, float peso,
            String lugarEntrenamiento) {
        super(nombre, raza, fechaNacimiento, peso);
        this.lugarEntrenamiento = lugarEntrenamiento;
    }

    @Override
    public void comer() {
        System.out.println("El perro " + nombre + " esta comiendo.");
    }

    @Override
    public void comunicarse() {
        System.out.println("guau guau");
    }

    public String getLugarEntrenamiento() {
        return lugarEntrenamiento;
    }
}
