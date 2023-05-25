public class Bozo {
    public static void main(String[] args) {
        int[] dados;
        String entrada;
        RolaDados r = new RolaDados(5);
        Placar p = new Placar();
        System.out.println("Bem-vindx ao Bozó!!! ");
        System.out.println("Siga as instruções abaixo:");
        System.out.println();
        for (int i = 0; i < 10; i++) {
            while (true) {
                try {
                    System.out.println("Pressione ENTER para iniciar a rodada: ");
                    entrada = EntradaTeclado.leString();
                    if (entrada.isEmpty()) break;
                } catch (Exception eIn) {
                    System.out.println("Entrada inválida. Digite novamente.");
                }
            }

            dados = r.rolar();
            System.out.println(r.toString());

            for (int j = 0; j < 2; j++) {
                try {
                    System.out.println("Escolha os dados que serão rolados (coloque os números espaçados)");
                    System.out.println("ou aperte ENTER para permanecer com os dados atuais: ");
                    entrada = EntradaTeclado.leString();
                    if (!entrada.isEmpty()) dados = r.rolar(entrada);
                } catch (Exception eIn) {
                    System.out.println("Inválido! Digite novamente.");
                    j--;
                }
                System.out.println(r.toString());
            }

            System.out.println(p.toString());

            while (true) {
                try {
                    System.out.print("Digite a posição que você quer ocupar: ");
                    int posIn = EntradaTeclado.leInt();
                    if (posIn > 0) {
                        p.add(posIn, dados);
                        break;
                    }
                    System.out.println("Inválido! Digite novamente.");
                } catch (Exception eIn) {
                    System.out.println("Inválido! Digite novamente.");
                }
            }

            System.out.println(p.toString());
        }

        System.out.println("Placar final: " + p.getScore());
    }
}
