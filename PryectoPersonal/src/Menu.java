import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir= false;
        int opcion;
        while (!salir){
            System.out.println("---Bienvenido al cine---");
            System.out.println("1. Ver cartelera");
            System.out.println("2. Comprar boletos");
            System.out.println("3. Salir");

            System.out.println("Selecciona una opción: ");
            opcion=sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Mostrando cartelera...");
                    break;
                case 2:
                    System.out.println("Entrando al sistema de compra...");
                    break;
                case 3:
                    salir = true; // Aquí cambiamos la condición para romper el bucle
                    System.out.println("Gracias por visitarnos.");
                    break;
                default:
                    System.out.println("Opción no válida, intenta de nuevo.");


            }
            System.out.println();
        }
    }
}
