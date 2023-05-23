import java.util.ArrayList;
import java.util.Collection;

public class RolaDados {
    protected final Collection<Dado> listaDeDados = new ArrayList<Dado>();

    public Collection<Dado> getListaDeDados() {
        return listaDeDados;
    }

    public RolaDados(int n){
        for (int i = 0; i < n; i++) {
            Dado dado = new Dado();
            this.listaDeDados.add(dado);
        }
    }

    public int[] rolar(){
        return new int[]{0};
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
