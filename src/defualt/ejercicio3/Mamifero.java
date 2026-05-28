package defualt.ejercicio3;

public class Mamifero {

    protected String nombre;           // string (30)
    protected String raza;             // string (20)
    protected String fechaNacimiento;  // string (10)
    protected float peso;              // float

    public Mamifero() {
    }

    public Mamifero(String nombre, String raza, String fechaNacimiento, float peso) {
        this.nombre = nombre;
        this.raza = raza;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
    }

    public void comer() {
        System.out.println(nombre + " esta comiendo.");
    }

    public void comunicarse() {
        System.out.println(nombre + " emite un sonido.");
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public float getPeso() {
        return peso;
    }
}
