import java.util.Scanner;

public class Objeto {
    public static void main(String[] args) {
        // Creamos un objeto Scanner para capturar la entrada del teclado
        Scanner leer = new Scanner(System.in);

        // Declaración de variables
        int numero1, numero2, resultado;

        // Entrada de datos
        System.out.print("Ingresa el primer número: ");
        numero1 = leer.nextInt();

        System.out.print("Ingresa el segundo número: ");
        numero2 = leer.nextInt();

        // Operación matemática
        resultado = numero1 + numero2;

        // Salida del resultado
        System.out.println("La suma de " + numero1 + " + " + numero2 + " es: " + resultado);

        leer.close(); // Cerramos el scanner por buena práctica
    };

}
