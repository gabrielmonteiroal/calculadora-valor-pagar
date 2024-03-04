import java.util.Locale;
import java.util.Scanner;

public class CalculadoraValorPagar {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o código, quantidade e preço do primeiro item:");

        int codigo1 = sc.nextInt();
        int quantidade1 = sc.nextInt();
        double preco1 = sc.nextDouble();


        System.out.println("Informe o código, quantidade e preço do segundo item:");

        int codigo2 = sc.nextInt();
        int quantidade2 = sc.nextInt();
        double preco2 = sc.nextDouble();

        double totalPagar = (double) quantidade1 * preco1 + (double) quantidade2 * preco2;

        System.out.printf("VALOR A PAGAR = R$ %.2f%n", totalPagar);

        sc.close();
    }
}
