package torneo.core;

public class JugadorInvalidoException extends RuntimeException {
    public JugadorInvalidoException(String mensaje) {
        super(mensaje);
    }
}