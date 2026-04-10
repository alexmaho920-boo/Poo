package torneo.core;

public class EquiposInsuficientesException extends Exception {
    public EquiposInsuficientesException(String mensaje) {
        super(mensaje);
    }
}