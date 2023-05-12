import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        System.out.println("Bem vindx, esse é o Jogo De Senha!\n");
        System.out.println("A máquina vai gerar um número aleatório entre \n" +
                "0 e N (fornecido por você!) e você deve adivinhar, no \n" +
                "menor número de palpites possível, qual foi o número gerado! \n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int number = scanner.nextInt();
        Senha sn = new Senha(number);
        Adivinha ad = new Adivinha(sn.getPassword());
        ad.startGame();
    }
}