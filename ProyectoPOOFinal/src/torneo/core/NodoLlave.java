package torneo.core;

public class NodoLlave {

    private Encuentro encuentro;
    private NodoLlave izquierda;
    private NodoLlave derecha;

    public NodoLlave() {
        this.derecha = null;
        this.izquierda = null;
        this.encuentro = null;
    }
    public NodoLlave getIzquierda(){
        return izquierda;
    }
    public NodoLlave getDerecha(){
        return derecha;
    }
    public Encuentro getEncuentro(){
        return encuentro;
    }
    public void setIzquierda(NodoLlave izquierda) {
        this.izquierda = izquierda;
    }
    public void setDerecha(NodoLlave derecha) {
        this.derecha = derecha;
    }
    public void setEncuentro(Encuentro encuentro) {
        this.encuentro = encuentro;
    }
}
