import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num,quadrado;
        System.out.println("Digite um número inteiro: ");
        num = ler.nextInt();
        quadrado=num*num;
        System.out.println("O quadrado do número é "+quadrado);
    }
}