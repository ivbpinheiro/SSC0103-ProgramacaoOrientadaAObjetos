import java.util.Calendar;

public class Random {
    //setPassword(Calendar.getInstance().getTimeInMillis() % number);
    private int semente;

    public int getSemente() {
        return semente;
    }

    public Random(){
        this.semente = (int) Calendar.getInstance().getTimeInMillis() % 7;
    }

    public Random(int k){

    }
    public int getIntRand(int max){
        return 0;
    }

    public double getRand(){
        return 0;
    }

    public void setSemente(int semente){

    }

}
