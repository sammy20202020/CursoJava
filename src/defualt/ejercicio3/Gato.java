package defualt.ejercicio3;

public class Gato extends Mamifero {

    private double alturaSalto; // double

    public Gato() {
    }

    public Gato(String nombre, String raza, String fechaNacimiento, float peso,
            double alturaSalto) {
        super(nombre, raza, fechaNacimiento, peso);
        this.alturaSalto = alturaSalto;
    }

    @Override
    public void comer() {
        System.out.println("El gato " + nombre + " esta comiendo.");
    }

    @Override
    public void comunicarse() {
        System.out.println("miau miau");
    }

    public double getAlturaSalto() {
        return alturaSalto;
    }
}
