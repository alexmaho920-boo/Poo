package prueba12;

// Clase base (padre)
class Animal {
    String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}

// Clase hija
class Perro extends Animal {
    String raza;

    public Perro(String nombre, String raza) {
        super(nombre); // Llama al constructor del padre
        this.raza = raza;
    }

    @Override
    public void hacerSonido() {
        System.out.println("Guau guau");
    }
}

// Otra clase hija
class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Miau");
        System.out.println("pspspspspsps");
    }
}

