package torneo.core;
import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private List<Jugador> integrantes;
    private double mmrPromedio;

    // Constante para el límite de 3v3
    public static final int MAX_JUGADORES = 3;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.integrantes = new ArrayList<>();
        this.mmrPromedio = 0.0;
    }
    public class EquipoLlenoException extends Exception {
        public EquipoLlenoException(String mensaje) {
            super(mensaje);
        }
    }
    public void inscribirJugador(Jugador j) throws EquipoLlenoException {
        if (integrantes.size() >= MAX_JUGADORES) {
            throw new EquipoLlenoException("Error: El equipo '" + nombre + "' ya tiene 3 jugadores.");
        }

        integrantes.add(j);
        System.out.println("Jugador " + j.getNickname() + " unido a " + nombre);


        calcularMMRPromedio();
    }

    private void calcularMMRPromedio() {
        if (integrantes.isEmpty()) {
            this.mmrPromedio = 0;
            return;
        }

        double suma = 0;
        for (Jugador j : integrantes) {
            suma += j.getMmr();
        }
        this.mmrPromedio = suma / integrantes.size();
    }


    public String getNombre() { return nombre; }
    public double getMmrPromedio() { return mmrPromedio; }
    public List<Jugador> getIntegrantes() { return integrantes; }

    @Override
    public String toString() {
        return "Equipo: " + nombre + " | MMR Promedio: " + String.format("%.2f", mmrPromedio);
    }
}