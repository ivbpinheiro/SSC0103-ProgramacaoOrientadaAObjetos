import java.util.Calendar;

public class Random {
    //setPassword(Calendar.getInstance().getTimeInMillis() % number);
    private int semente = 10;

    private int randomNumber;

    public int getRandomNumber() {
        return randomNumber;
    }

    public int getSemente() {
        return semente;
    }

    public Random(){
        this.randomNumber = ((int) Calendar.getInstance().getTimeInMillis() % 6) + 1;
    }

    public Random(int k){
        this.randomNumber = ((int) Calendar.getInstance().getTimeInMillis() + k) % 6 + 1;
        this.semente = k;
    }
    public int getIntRand(int max) {
        return ((int) Calendar.getInstance().getTimeInMillis() % (max - 1)) + 1;
    }

    public double getRand() {
        long currentTime = Calendar.getInstance().getTimeInMillis();
        double randomValue = (currentTime % 1000) / 1000.0;
        return randomValue;
    }


    public void setSemente(int semente){
        this.semente = semente;
    }

}
