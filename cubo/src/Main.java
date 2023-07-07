import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int N1, cubo;
        System.out.println("Digite um número inteiro: ");
        N1 = ler.nextInt();
        cubo = N1 * N1 * N1;
        System.out.println("O número elevado ao cubo é " + cubo);
    }
}