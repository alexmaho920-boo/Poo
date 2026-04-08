package torneo.core;

public class BracketTorneo {

    private NodoLlave raiz;

    public void construir(int numEquipos) {
        this.raiz = construirRecursivo (numEquipos);
    }

    private NodoLlave construirRecursivo(int equipos) {
        if (equipos <= 1) {
            return new NodoLlave();
        }
        NodoLlave nodo = new NodoLlave();
        nodo.setIzquierda(construirRecursivo(equipos / 2));
        nodo.setDerecha(construirRecursivo(equipos / 2));
        return nodo;
    }

    public NodoLlave getRaiz() {
        return raiz;
    }
}
