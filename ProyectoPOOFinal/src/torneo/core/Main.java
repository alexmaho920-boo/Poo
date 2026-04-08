package torneo.core;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuántos equipos participan? (2, 4, 8 o 16)");
        int numEquipos = scanner.nextInt();

        if (numEquipos < 2 || (numEquipos & (numEquipos - 1)) != 0) {
            System.out.println("Error: debe ser potencia de 2");
        } else {
            BracketTorneo bracket = new BracketTorneo();
            bracket.construir(numEquipos);
            System.out.println("Árbol creado correctamente con " + numEquipos + " equipos");
        }
    }
}