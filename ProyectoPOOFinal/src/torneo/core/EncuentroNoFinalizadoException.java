package torneo.core;

public class EncuentroNoFinalizadoException extends Exception {
    public EncuentroNoFinalizadoException(String mensaje) {
        super(mensaje);
    }
}