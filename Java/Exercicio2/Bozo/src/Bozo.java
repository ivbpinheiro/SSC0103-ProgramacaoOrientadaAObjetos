import java.util.ArrayList;
import java.util.List;

public class Bozo {
    public static void main(String[] args) {
        int[] dados;
        String entrada;
        RolaDados r = new RolaDados(5);
        Placar p = new Placar();
        System.out.println("Bem-vindx ao Bozó!!! ");
        System.out.println("Siga as instruções abaixo:");
        System.out.println();

        List<String> lista2 = new ArrayList<>();

        int rodadas = 10;
        int contador = 0;
        while (contador < rodadas) {
            System.out.println("Pressione ENTER para iniciar a rodada: ");
            entrada = EntradaTeclado.leString();
            if (!entrada.isEmpty()) {
                contador--;
                continue;
            }

            dados = r.rolar();
            System.out.println(r.toString());

            for (int j = 0; j < 2; j++) {
                System.out.println("Escolha os dados que serão rolados (coloque os números espaçados)");
                System.out.println("ou aperte ENTER para permanecer com os dados atuais: ");
                entrada = EntradaTeclado.leString();
                if (!entrada.isEmpty()) {
                    try {
                        dados = r.rolar(entrada);
                    } catch (Exception eIn) {
                        System.out.println("Inválido! Digite novamente.");
                        j--;
                    }
                }
                System.out.println(r.toString());
            }

            System.out.println(p.toString());

            while (true) {
                System.out.print("Digite a posição que você quer ocupar: ");
                int posIn = EntradaTeclado.leInt();
                if (posIn > 0) {
                    p.add(posIn, dados);
                    break;
                }
                System.out.println("Inválido! Digite novamente.");
            }

            System.out.println(p.toString());
            contador++;
        }

        System.out.println("Placar final: " + p.getScore());
    }
}
