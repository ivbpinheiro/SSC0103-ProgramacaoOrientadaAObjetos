import java.util.ArrayList;

public class Dado {
    ArrayList<String> lados;

    private int numLados;

    private int ladoSelecionado;

    public Dado(){
        this.numLados = 6;
    }
    public Dado(int n){
        this.numLados = n;
    }

    public int getLado(){
        return this.ladoSelecionado;
    }

    public int rolar(){
        Random rd = new Random();
        ladoSelecionado = rd.getRandomNumber();
        return this.ladoSelecionado;
    }

    public java.lang.String toString(){
        lados = new ArrayList<>();
        lados.add("");
        lados.add("  1  \n+-----+\n|     |\n|  *  |\n|     |\n+-----+");
        lados.add("  2  \n+-----+\n|*    |\n|     |\n|    *|\n+-----+");
        lados.add("  3  \n+-----+\n|*    |\n|  *  |\n|    *|\n+-----+");
        lados.add("  4  \n+-----+\n|*   *|\n|     |\n|*   *|\n+-----+");
        lados.add("  5  \n+-----+\n|*   *|\n|  *  |\n|*   *|\n+-----+");
        lados.add("  6  \n+-----+\n|*   *|\n|*   *|\n|*   *|\n+-----+");
        return lados.get(this.ladoSelecionado);
    }

    public static void main(java.lang.String[] args){

    }

}
