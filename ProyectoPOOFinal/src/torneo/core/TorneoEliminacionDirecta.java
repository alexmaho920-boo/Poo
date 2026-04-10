package torneo.core;

import java.util.ArrayList;
import java.util.List;

public class TorneoEliminacionDirecta {
    private List<Equipo> equipos;
    private BracketTorneo bracket;

    public TorneoEliminacionDirecta() {
        this.equipos = new ArrayList<>();
        this.bracket = new BracketTorneo();
    }

    public void inscribirEquipo(Equipo e) {
        equipos.add(e);
        System.out.println("Equipo inscrito: " + e.getNombre());
    }

    public void iniciarTorneo() throws EquiposInsuficientesException {
        if (equipos.size() < 2 || (equipos.size() & (equipos.size() - 1)) != 0) {
            throw new EquiposInsuficientesException("Se necesita un número de equipos potencia de 2.");
        }

        bracket.construir(equipos.size());
        llenarPrimeraRonda(bracket.getRaiz(), 0, equipos.size() - 1);
        System.out.println("Torneo iniciado con " + equipos.size() + " equipos");
        bracket.imprimirBracket();
    }

    private void llenarPrimeraRonda(NodoLlave nodo, int izq, int der) {
        if (nodo == null || izq >= der) return;

        if (izq + 1 == der) {
            nodo.setEncuentro(new Encuentro(equipos.get(izq), equipos.get(der)));
            return;
        }

        int mid = (izq + der) / 2;
        llenarPrimeraRonda(nodo.getIzquierda(), izq, mid);
        llenarPrimeraRonda(nodo.getDerecha(), mid + 1, der);
    }

    public void avanzarEquipo(NodoLlave nodo, Equipo ganador) {
        if (nodo == null) return;
        if (nodo.getEncuentro() == null) {
            nodo.setEncuentro(new Encuentro(ganador, null));
        }
    }

    public BracketTorneo getBracket() { return bracket; }
    public List<Equipo> getEquipos() { return equipos; }
}