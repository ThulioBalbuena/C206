import java.util.Scanner;

public class posto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tipo de combustível (A - Álcool / G - Gasolina): ");
        char tipoCombustivel = scanner.next().charAt(0);

        System.out.print("Digite a quantidade de litros vendidos: ");
        double litros = scanner.nextDouble();

        double precoGasolina = 6.00;
        double precoAlcool = 4.90;
        double valorTotal;

        if (tipoCombustivel == 'G' || tipoCombustivel == 'g') {
            if (litros <= 20) {
                valorTotal = litros * (precoGasolina - precoGasolina * 0.04);
            } else {
                valorTotal = litros * (precoGasolina - precoGasolina * 0.06);
            }
        } else if (tipoCombustivel == 'A' || tipoCombustivel == 'a') {
            if (litros <= 20) {
                valorTotal = litros * (precoAlcool - precoAlcool * 0.03);
            } else {
                valorTotal = litros * (precoAlcool - precoAlcool * 0.05);
            }
        } else {
            System.out.println("Tipo de combustível inválido.");
            return;
        }
        
        System.out.println("Valor a ser pago: R$ " + (int) valorTotal);

        scanner.close();
    }
}
