package torneo.core;

import java.util.LinkedList;
import java.util.Queue;

public class BracketTorneo {

    private NodoLlave raiz;

    public void construir(int numEquipos) {
        this.raiz = construirRecursivo(numEquipos);
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

    public void imprimirBracket() {
        if (raiz == null) {
            System.out.println("El bracket está vacío");
            return;
        }

        Queue<NodoLlave> cola = new LinkedList<>();
        cola.add(raiz);
        int ronda = 1;

        while (!cola.isEmpty()) {
            int nodosPorNivel = cola.size();
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < nodosPorNivel; i++) {
                NodoLlave nodo = cola.poll();

                if (nodo.getIzquierda() != null && nodo.getDerecha() != null) {
                    if (nodo.getEncuentro() != null) {
                        sb.append(nodo.getEncuentro().toString() + "  ");
                    } else {
                        sb.append("[?] vs [?]  ");
                    }
                    cola.add(nodo.getIzquierda());
                    cola.add(nodo.getDerecha());
                }
            }

            if (sb.length() > 0) {
                System.out.println("Ronda " + ronda + ": " + sb);
                ronda++;
            }
        }
    }

    public NodoLlave getRaiz() {
        return raiz;
    }
}