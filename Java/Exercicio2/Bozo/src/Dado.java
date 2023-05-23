import java.util.ArrayList;

public class Dado {
    ArrayList<String> lados;

    private int numLados = 6;

    private Random ladoSelecionado;

    public Dado(){

    }
    public Dado(int n){
        this.numLados = n;
    }

    public int getLado(){
        return ladoSelecionado.getRandomNumber();
    }

    public int rolar(){
        ladoSelecionado = new Random();
        return ladoSelecionado.getRandomNumber();
    }

    public java.lang.String toString(){
        lados = new ArrayList<>();
        lados.add("\n1\n" +
                "+-----+\n" +
                "|     |\n" +
                "|  *  |\n" +
                "|     |\n" +
                "+-----+");
        return lados.get(0);
    }

    public static void main(java.lang.String[] args){

    }

}
