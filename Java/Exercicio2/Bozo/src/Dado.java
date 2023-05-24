import java.util.ArrayList;

public class Dado {
    private Random random;
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

    public int rolar() {
        Random random = new Random(); // Cria uma instância da classe Random
        this.ladoSelecionado = random.getIntRand(6); // Gera um número aleatório de 1 a 6
        return this.ladoSelecionado; // Retorna o número aleatório gerado
    }

    public java.lang.String toString(){
        lados = new ArrayList<>();
        lados.add("");
        lados.add("\n  1  \n+-----+\n|     |\n|  *  |\n|     |\n+-----+");
        lados.add("\n   2  \n+-----+\n|*    |\n|     |\n|    *|\n+-----+");
        lados.add("\n   3  \n+-----+\n|*    |\n|  *  |\n|    *|\n+-----+");
        lados.add("\n   4  \n+-----+\n|*   *|\n|     |\n|*   *|\n+-----+");
        lados.add("\n   5  \n+-----+\n|*   *|\n|  *  |\n|*   *|\n+-----+");
        lados.add("\n   6  \n+-----+\n|*   *|\n|*   *|\n|*   *|\n+-----+");
        return lados.get(this.ladoSelecionado);
    }

    public static void main(java.lang.String[] args){

    }

}
