import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double valor,total;
        int qtd;
        System.out.println("Digite a quantidade do produto: ");
        qtd = ler.nextInt();
        System.out.println("Digite o valor do produto: ");
        valor = ler.nextDouble();
        total = valor * qtd;
        System.out.println("O valor total da compra é de "+total);
    }
}