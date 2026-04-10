package torneo.core;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TorneoEliminacionDirecta torneo = new TorneoEliminacionDirecta();

        System.out.println("¿Cuántos equipos participan? (2, 4, 8 o 16)");
        int numEquipos = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numEquipos; i++) {
            System.out.println("Nombre del equipo " + i + ":");
            String nombreEquipo = scanner.nextLine();
            Equipo equipo = new Equipo(nombreEquipo);

            for (int j = 1; j <= Equipo.MAX_JUGADORES; j++) {
                System.out.println("Nickname del jugador " + j + ":");
                String nickname = scanner.nextLine();
                System.out.println("MMR del jugador " + j + ":");
                int mmr = scanner.nextInt();
                scanner.nextLine();

                try {
                    equipo.inscribirJugador(new Jugador(nickname, mmr));
                } catch (EquipoLlenoException e) {
                    System.out.println(e.getMessage());
                }
            }

            torneo.inscribirEquipo(equipo);
        }

        try {
            torneo.iniciarTorneo();
        } catch (EquiposInsuficientesException e) {
            System.out.println(e.getMessage());
        }
    }
}