package torneo.core;

public class Encuentro {
    private Equipo equipoA;
    private Equipo equipoB;
    private int marcadorA;
    private int marcadorB;
    private boolean haFinalizado;

    public Encuentro(Equipo equipoA, Equipo equipoB) {
        this.equipoA = equipoA;
        this.equipoB = equipoB;
        this.marcadorA = 0;
        this.marcadorB = 0;
        this.haFinalizado = false;
    }

    public void registrarResultado(int marcadorA, int marcadorB) {
        this.marcadorA = marcadorA;
        this.marcadorB = marcadorB;
        this.haFinalizado = true;
    }

    public Equipo obtenerGanador() throws EncuentroNoFinalizadoException {
        if (!haFinalizado) {
            throw new EncuentroNoFinalizadoException("El encuentro aún no ha finalizado.");
        }
        return marcadorA > marcadorB ? equipoA : equipoB;
    }

    public Equipo getEquipoA() { return equipoA; }
    public Equipo getEquipoB() { return equipoB; }
    public int getMarcadorA() { return marcadorA; }
    public int getMarcadorB() { return marcadorB; }
    public boolean isHaFinalizado() { return haFinalizado; }

    @Override
    public String toString() {
        return equipoA.getNombre() + " vs " + equipoB.getNombre();
    }
}