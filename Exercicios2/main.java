package Exercicios2;
    
import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        boolean controle = true;
        
        escola escola = new escola();
        escola.nome = "Escola do Paulo";
        escola.endereco = "Rua do Paulo";
        escola.email = "escola@email.com";	
        escola.numTelefone = 123456789;

        while(controle){
            System.out.println("Menu de cadastro de estudantes");
            System.out.println("1 - Cadastrar Estudante");
            System.out.println("2 - Mostrar Informações da Escola");
            System.out.println("3 - Mostrar numero de estudantes por ano");
            System.out.println("4 - Sair");

            int opcao = sc.nextInt();
            sc.nextLine();
            
            switch(opcao){
                case 1:
                    estudante estudante = new estudante();
                    System.out.println("Digite o nome do estudante: ");
                    estudante.nome = sc.next();
                    System.out.println("Digite a idade do estudante: ");
                    estudante.idade = sc.nextInt();
                    System.out.println("Digite o ano letivo do estudante: ");
                    estudante.anoLetivo = sc.next();
                    escola.addEstudante(estudante);
                    break;
                case 2:
                    escola.mostrarInfos();
                    break;
                case 3:
                    escola.qtdEstudantePorAno();
                    break;
                case 4:
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