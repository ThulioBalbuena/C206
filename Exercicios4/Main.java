package Exercicios4;

import java.util.Scanner;

public class Main {
    
 public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Plataforma plataforma = new Plataforma();
        plataforma.nome = "Netflix";

        int opcao = 0;

        do{
            System.out.println();
            System.out.println("Digite a opção desejada: ");
            System.out.println("1 - Adicionar série");
            System.out.println("2 - Mostrar informações");
            System.out.println("3 - Mostrar série mais longa finalizada");
            System.out.println("4 - Mostrar média de porcentagem de séries com mais de 3 temporadas");
            System.out.println("5 - Sair");
            
            opcao = sc.nextInt();
            
            switch(opcao){
                case 1:
                    Serie s = new Serie();
                    System.out.println("Digite o nome: ");
                    s.nome = sc.next();
                    System.out.println("Digite a nota: ");
                    s.nota = sc.nextDouble();
                    System.out.println("Digite o número de temporadas: ");
                    s.temporadas = sc.nextInt();
                    System.out.println("Digite se está finalizada (true/false): ");
                    s.finalizada = sc.nextBoolean();
                    System.out.println("Digite o nome do diretor: ");
                    s.diretor.nome = sc.next();
                    plataforma.addSerie(s);
                    break;
                case 2:
                    plataforma.mostraInfo();
                    break;
                case 3:
                    System.out.println(plataforma.serieMaisLongaFinalizada());
                    break;
                case 4:
                    plataforma.mediaPorcentagem();
                    break;
                case 5:
                    System.out.println("Finalizado");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while(opcao != 5);

        sc.close();
    }
}
