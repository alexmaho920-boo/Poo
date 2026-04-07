package prueba12;

// Clase principal
public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Firulais", "Labrador");
        Gato gato = new Gato("Michi");

        System.out.println(perro.nombre + " - " + perro.raza);
        perro.hacerSonido();

        System.out.println(gato.nombre);
        gato.hacerSonido();
    }
}