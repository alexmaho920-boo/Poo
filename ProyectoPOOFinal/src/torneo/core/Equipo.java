package torneo.core;
import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private List<Jugador> integrantes;
    private double mmrPromedio;
    public static final int MAX_INTEGRANTES = 3;

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
        if (integrantes.size() >= MAX_INTEGRANTES) {
            throw new EquipoLlenoException("El equipo " + nombre + " ya tiene 3 jugadores.");
        }
        integrantes.add(j);
        actualizarMMR();
    }

    private void actualizarMMR() {
        if (integrantes.isEmpty()) return;

        double suma = 0;
        for (Jugador j : integrantes) {

        }

        this.mmrPromedio = suma / integrantes.size();
    }

    public double getMmrPromedio() { return mmrPromedio; }
    public String getNombre() { return nombre; }
    public List<Jugador> getIntegrantes() { return new ArrayList<>(integrantes); }
}