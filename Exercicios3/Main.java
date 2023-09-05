package Exercicios3;
    
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Supermercado supermercado = new Supermercado();
        supermercado.nome = "Supermercado da Kiara";
        supermercado.endereco = "Rua dos Bobos, 0";
        supermercado.numTelefone = 123456789;
        supermercado.cnpj = "12345678912345";


        boolean controle = true;

        while(controle){
            System.out.println("Menu do supermercado");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Mostrar Informações do supermercado");
            System.out.println("3 - Mostrar quantidade de produtos por categoria");
            System.out.println("4 - Mostrar produto mais caro e mais barato");
            System.out.println("5 - Sair");

            int opcao = sc.nextInt();
            sc.nextLine();
            
            switch(opcao){
                case 1:
                    Produto produto = new Produto();
                    System.out.println("Digite o nome do produto: ");
                    produto.nome = sc.next();
                    System.out.println("Digite o valor do produto: ");
                    produto.valor = sc.nextInt();
                    System.out.println("Digite o codigo do produto: ");
                    produto.codigoSerie = sc.nextInt();
                    System.out.println("Digite a categoria do produto: ");
                    produto.categoria = sc.next();
                    System.out.println("Digite a quantidade do produto: ");
                    produto.quantidade = sc.nextInt();
                    supermercado.addProduto(produto);
                    break;
                case 2:
                    supermercado.mostrarInfos();
                    break;
                case 3:
                    supermercado.contarCategorias();
                    break;
                case 4:
                    supermercado.mostrarMaisCaroBarato();
                    break;
                case 5:
                    controle = false;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
        sc.close();
    }
}