package torneo.core;

public class Jugador {
    private String nickname;
    private int mmr;

    public Jugador(String nickname, int mmr) {
        if (mmr < 0) {
            throw new JugadorInvalidoException("El MMR no puede ser menor a 0.");
        }
        this.nickname = nickname;
        this.mmr = mmr;
    }

    public String getNickname() { return nickname; }
    public int getMmr() { return mmr; }

    @Override
    public String toString() {
        return nickname + " (MMR: " + mmr + ")";
    }
}