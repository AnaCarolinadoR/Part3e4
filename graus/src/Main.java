import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double celcios,faren;
        System.out.println("Digite a temperatura em graus celcios: ");
        celcios = ler.nextDouble();
        faren = celcios/1.8 + 32;
        System.out.println("A temperatura convertida para Fahrenheit é "+faren);

    }
}