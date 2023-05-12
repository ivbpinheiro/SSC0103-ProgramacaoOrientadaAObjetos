import java.util.Calendar;
public class Senha {
    private long password;

    private int number;

    public Senha (int number){
        this.number = number + 1;
        generatePassword(this.number);
    }

    public long getPassword() {
        return this.password;
    }

    private void setPassword(long password) {
        this.password = password;
    }

    private void generatePassword(int number){
        setPassword(Calendar.getInstance().getTimeInMillis() % number);
    }

    @Override
    public String toString() {
        return getPassword() + "";
    }
}
