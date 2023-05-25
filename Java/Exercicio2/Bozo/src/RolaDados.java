import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class RolaDados {

    private int dados;
    private Dado[] listaDados;
    private Random random = new Random();

    public RolaDados(int n){
        dados = n;
        listaDados = new Dado[n];
        for(int i=0; i < n; i++){
            listaDados[i] = new Dado();
            try{
                TimeUnit.MILLISECONDS.sleep(random.getIntRand(100)+100);
            }catch(Exception e){
                System.out.println("Erro: RolaDados: Randomização");
                System.exit(-1);
            }
        }
    }

    public int[] rolar() {
        int[] novos_valores = new int[dados];
        for (int i = 0; i < dados; i++) {
            novos_valores[i] = listaDados[i].rolar();
        }
        return novos_valores;
    }


    public int[] rolar(boolean[] quais){
        int[] ladoSorteado = new int[dados];
        for (int i = 0; i < dados; i++) {
            if (quais[i]) {
                ladoSorteado[i] = listaDados[i].rolar();
            } else {
                ladoSorteado[i] = listaDados[i].getLado();
            }
        }
        return ladoSorteado;
    }

    public int[] rolar(java.lang.String s){
        boolean[] b = new boolean[dados];
        String[] r = s.split(" ");

        Arrays.fill(b, false);
        if(s.length() == 0 || !Character.isDigit(s.charAt(0))) return rolar(b);
        for(int i=0; i<s.length() - s.replace(" ", "").length()+1; i++)
            if(Integer.parseInt(r[i])-1 < dados) b[Integer.parseInt(r[i])-1] = true;

        return rolar(b);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        String[] s = new String[dados];
        for (int i = 0; i < dados; i++) {
            s[i] = listaDados[i].toString();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < dados; j++) {
                sb.append(s[j], i * 8, i * 8 + 7);
                if (j < dados - 1) {
                    sb.append("\t");
                } else {
                    sb.append("\n");
                }
            }
        }
        return sb.toString();
    }


    public static void main(java.lang.String[] args) throws java.lang.Exception{
    }
}