import java.util.HashMap;
import java.util.Map;

public class Placar {
    private Map<Integer, Integer> pontos = new HashMap<>();
    private Map<Integer, Boolean> pos = new HashMap<>();

    public Placar() {
        for (int i = 1; i <= 10; i++) {
            pontos.put(i, 0);
            pos.put(i, false);
        }
    }

    public void add(int posicao, int[] dados) throws IllegalArgumentException {
        if (posicao < 1 || posicao > 10) {
            throw new IllegalArgumentException("Posicao invalida.");
        }

        switch (posicao) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                for (int i = 0; i < 5; i++) {
                    if (dados[i] == posicao) {
                        pontos.put(posicao, pontos.get(posicao) + posicao);
                    }
                }
                break;
            case 7:
                int[] hash = new int[6];
                for (int i = 0; i < 5; i++) {
                    hash[dados[i] - 1]++;
                }
                boolean hasTwo = false;
                boolean hasThree = false;
                for (int i = 0; i < 6; i++) {
                    if (hash[i] == 2) {
                        hasTwo = true;
                    } else if (hash[i] == 3) {
                        hasThree = true;
                    }
                }
                if (hasTwo && hasThree) {
                    pontos.put(posicao, 15);
                }
                break;
            case 8:
                int[] straight = new int[]{1, 1, 1, 1, 1};
                for (int i = 0; i < 5; i++) {
                    if (dados[i] == 1 || dados[i] == 6) {
                        straight[dados[i] - 1]--;
                    }
                }
                if (straight[0] == 0 && straight[5] == 0) {
                    pontos.put(posicao, 20);
                }
                break;
            case 9:
                int[] count = new int[6];
                for (int i = 0; i < 5; i++) {
                    count[dados[i] - 1]++;
                }
                for (int i = 0; i < 6; i++) {
                    if (count[i] >= 4) {
                        pontos.put(posicao, 30);
                        break;
                    }
                }
                break;
            case 10:
                for (int i = 0; i < 5; i++) {
                    if (dados[i] == 5) {
                        pontos.put(posicao, 40);
                        break;
                    }
                }
                break;
        }
        pos.put(posicao, true);
    }

    public int getScore() {
        int result = 0;
        for (int value : pontos.values()) {
            result += value;
        }
        return result;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(pos.get(1) ? pontos.get(1) : "(1)").append("    |   ").append(pos.get(7) ? pontos.get(7) : "(7)").append("    |   ").append(pos.get(4) ? pontos.get(4) : "(4)").append("\n");
        sb.append("--------------------------\n");
        sb.append(pos.get(2) ? pontos.get(2) : "(2)").append("    |   ").append(pos.get(8) ? pontos.get(8) : "(8)").append("    |   ").append(pos.get(5) ? pontos.get(5) : "(5)").append("\n");
        sb.append("--------------------------\n");
        sb.append(pos.get(3) ? pontos.get(3) : "(3)").append("    |   ").append(pos.get(9) ? pontos.get(9) : "(9)").append("    |   ").append(pos.get(6) ? pontos.get(6) : "(6)").append("\n");
        sb.append("--------------------------\n");
        sb.append("        |   ").append(pos.get(10) ? pontos.get(10) : "(10)").append("   |\n");
        sb.append("        +----------+\n");
        return sb.toString();
    }

}