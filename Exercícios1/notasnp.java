import java.util.Scanner;

public class notasnp{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota NP1: ");
        double np1 = scanner.nextDouble();

        System.out.print("Digite a nota NP2: ");
        double np2 = scanner.nextDouble();

        double media = (np1 + np2) / 2;
        int mediaInteira = (int) media;

        System.out.println("A média final é: " + mediaInteira);

        scanner.close();
    }
}
