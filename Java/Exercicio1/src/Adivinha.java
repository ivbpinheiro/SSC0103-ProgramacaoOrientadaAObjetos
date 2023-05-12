import java.util.Scanner;
public class Adivinha {
    private long number;
    private int shot;

    private int numberOfTries = 1;

    private boolean program = true;

    public void setTries() {
        this.numberOfTries++;
    }

    public int getNumberOfTries() {
        return numberOfTries;
    }

    public boolean isProgram() {
        return program;
    }

    public void setProgram(boolean program) {
        this.program = program;
    }

    public int getShot() {
        return shot;
    }

    private void setShot(int shot) {
        this.shot = shot;
    }

    public Adivinha(long number){
        setNumber(number);
    }

    private long getNumber() {
        return number;
    }

    private void setNumber(long number) {
        this.number = number;
    }

    private int getInputNumber(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public void startGame(){
        System.out.println("Adivinhe qual foi o numero gerado!");
        setShot(getInputNumber());
        if(getShot() == getNumber()){
            System.out.println("Acertou!");
            System.out.println("O número de tentativas foi: " + getNumberOfTries());

        } else{
            while(isProgram()){
                if(getShot() > getNumber()){
                    System.out.println("Errou, você digitou um número maior!");
                    System.out.println("Escolha outro número!");
                    setShot(getInputNumber());
                    setTries();
                } else if (getShot() < getNumber()) {
                    System.out.println("Errou, você digitou um número menor!");
                    System.out.println("Escolha outro número!");
                    setShot(getInputNumber());
                    setTries();
                } else {
                    System.out.println("Acertou!!! O número é: " + getNumber());
                    System.out.println("O número de tentativas foi: " + getNumberOfTries());
                    setProgram(false);
                }
            }
        }

    }

    @Override
    public String toString() {
        return getNumber() + "";
    }
}
