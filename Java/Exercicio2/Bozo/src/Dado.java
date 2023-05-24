public class Dado {
    private int ladoAtual = -1;
    private int numLados = 6;
    private Random random = new Random();

    public Dado() {
        ladoAtual = rolar();
    }

    public Dado(int numLados) {
        this.numLados = numLados;
        ladoAtual = rolar();
    }

    public int getLado() {
        return ladoAtual;
    }

    public int rolar() {
        ladoAtual = random.getIntRand(numLados + 1);
        while (ladoAtual <= 0) {
            ladoAtual = random.getIntRand(numLados + 1);
        }
        return ladoAtual;
    }

    @Override
    public String toString() {
        String s = "+-----+\n";
        switch(getLado()){
            case 1: return ("+--1--+\n|     |\n|  *  |\n|     |\n+--1--+");
            case 2: return ("+--2--+\n|*    |\n|     |\n|    *|\n+--2--+");
            case 3: return ("+--3--+\n|*    |\n|  *  |\n|    *|\n+--3--+");
            case 4: return ("+--4--+\n|*   *|\n|     |\n|*   *|\n+--4--+");
            case 5: return ("+--5--+\n|*   *|\n|  *  |\n|*   *|\n+--5--+");
            case 6: return ("+--6--+\n|* * *|\n|     |\n|* * *|\n+--6--+");
        }
        return " ";
    }
}
