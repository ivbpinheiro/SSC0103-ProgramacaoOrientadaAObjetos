import java.io.IOException;

public class Bozo {
    public static void main(String[] args) throws IOException {
        int[] dados = new int[5];
        String entrada;
        RolaDados r = new RolaDados(5);
        Placar p = new Placar();

        for (int i = 0; i < 10; i++) {
            while (true) {
                System.out.println("Pressione ENTER para iniciar uma rodada: ");
                entrada = EntradaTeclado.leString();
                if (entrada.length() != 0) {
                    System.out.println("Entrada inválida. Digite novamente.");
                    continue;
                }
                break;
            }

            dados = r.rolar();
            System.out.printf("%s", r.toString());

            while (true) {
                System.out.println("Escolha os dados que serão sorteados" +
                        "ou aperte ENTER para permanecer com os dados atuais: ");
                entrada = EntradaTeclado.leString();
                if (entrada.length() != 0) {
                    dados = r.rolar(entrada);
                    System.out.printf("%s", r.toString());
                }
                break;
            }

            while (true) {
                System.out.println("Escolha os dados que serão sorteados" +
                        "ou aperte ENTER para permanecer com os dados atuais: ");
                entrada = EntradaTeclado.leString();
                if (entrada.length() != 0) {
                    dados = r.rolar(entrada);
                    System.out.printf("%s\n", r.toString());
                    System.out.printf("%s\n", p.toString());
                    break;
                }
            }

            int posIn;
            while (true) {
                System.out.print("Digite a posição que você quer ocupar: ");
                posIn = EntradaTeclado.leInt();
                if (posIn <= 0) {
                    System.out.println("Valor inválido. Digite novamente.");
                    continue;
                }
                break;
            }

            p.add(posIn, dados);
            System.out.printf("%s\n", p.toString());
        }

        System.out.println("Placar final: " + p.getScore());
    }
}
