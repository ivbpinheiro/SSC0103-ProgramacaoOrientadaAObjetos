
import java.util.Scanner;

public class EntradaTeclado {
    private static Scanner scanner = new Scanner(System.in);
    public static String leString() {
        return scanner.nextLine();
    }

    public static int leInt() {
        return scanner.nextInt();
    }

    public static double leDouble() {
        return scanner.nextDouble();
    }

}