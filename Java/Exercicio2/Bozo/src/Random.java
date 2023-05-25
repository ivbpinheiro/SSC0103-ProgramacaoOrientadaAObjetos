import java.util.Calendar;
public class Random {
    private static final long LIMITE_SUPERIOR = 9223372036854775807L;
    private long estado;

    public double getRand() {
        long multiplicador = 134456456;
        long incremento = 8121533;
        estado = (incremento + multiplicador * estado) % LIMITE_SUPERIOR;
        return (double) estado / LIMITE_SUPERIOR;
    }

    public int getIntRand(int max) {
        return (int) (getRand() * max);
    }

    public void setSemente(int semente) {
        this.estado = semente;
    }

    public Random(int semente){
        this.estado = semente;
    }

    public Random() {
        this.estado = Calendar.getInstance().getTimeInMillis() % LIMITE_SUPERIOR;
    }

}