import java.util.ArrayList;
import java.util.Collection;

public class RolaDados {
    protected final ArrayList<Dado> listaDeDados = new ArrayList<Dado>();

    public ArrayList<Dado> getListaDeDados() {
        return listaDeDados;
    }

    public RolaDados(int n){
        for (int i = 0; i < n; i++) {
            this.listaDeDados.add(new Dado());
        }
    }

    public int[] rolar() {
        int[] valoresDados = new int[listaDeDados.size()];
        int valorAuxiliar;
        for (int i = 0; i < listaDeDados.size(); i++) {
            Dado dado = listaDeDados.get(i);
            dado.rolar();
            valorAuxiliar = dado.getLado();
            valoresDados[i] = valorAuxiliar;
        }
        return valoresDados;
    }

    public int[] rolar(boolean[] quais){
        return new int[]{0};
    }

    public int[] rolar(java.lang.String s){
        return new int[]{0};
    }

    public static void main(java.lang.String[] args)
            throws java.lang.Exception{

    }
}
