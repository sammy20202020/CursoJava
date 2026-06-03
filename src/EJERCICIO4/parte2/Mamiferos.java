package EJERCICIO4.parte2;

public abstract class Mamiferos {
    private String nombre;
    private String raza;
    private String tipoAnimal;
    private String fechaNacimiento;
    private float peso;

    public Mamiferos(String nombre, String raza, String tipoAnimal, String fechaNacimiento, float peso) {
        this.nombre = nombre;
        this.raza = raza;
        this.tipoAnimal = tipoAnimal;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
    }

    public void Comer() {
        System.out.println(nombre + " está comiendo");
    }

    public void TipoAnimal() {
        System.out.println("Tipo de animal: " + tipoAnimal);
    }

    public abstract void comunicarse();

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public float getPeso() {
        return peso;
    }
}
