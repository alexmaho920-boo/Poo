package torneo.core;

public class Jugador {
    private String nickname;
    private int mmr;

    public Jugador(String nickname, int mmr) {
        if (mmr < 0) throw new JugadorInvalidoException("El MMR no puede ser negativo.");
        this.nickname = nickname;
        this.mmr = mmr;
    }
    public class JugadorInvalidoException extends RuntimeException {
        public JugadorInvalidoException(String mensaje) {
            super(mensaje);
        }

        // Getters
        public String getNickname() {
            return nickname;
        }

        public int getMmr() {
            return mmr;
        }

        @Override
        public String toString() {
            return String.format("[%s | MMR: %d]", nickname, mmr);
        }

    }
}