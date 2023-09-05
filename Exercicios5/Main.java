package Exercicios5;

import java.util.Scanner;

public class Main {
    
 public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Estante estante = new Estante();
        estante.idEstante = 1;
        estante.letra = 'A';

        int opcao = 0;

        do{
            System.out.println();
            System.out.println("Digite a opção desejada: ");
            System.out.println("1 - Adicionar livro");
            System.out.println("2 - Mostrar informações");
            System.out.println("3 - Porcentagem de livros de cada gênero literário");
            System.out.println("4 - Mostrar informações do livro e do autor do livro com mais e menos páginas");
            System.out.println("5 - Sair");

            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao){
                case 1:
                    Livro l = new Livro();
                    System.out.println("Digite o titulo: ");
                    l.titulo = sc.nextLine();
                    System.out.println("Digite o genero literario: ");
                    l.genLiterario = sc.nextLine();
                    System.out.println("Digite a quantidade de folhas: ");
                    l.qntFolhas = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digite a editora: ");
                    l.editora = sc.nextLine();
                    System.out.println("Digite o nome do autor: ");
                    l.autor.nome = sc.nextLine();
                    estante.addLivros(l);
                    break;
                case 2:
                    estante.mostraInfo();
                    break;
                case 3:
                    estante.porcentagemGen();
                    break;
                case 4:
                    estante.livroMaisEMenosPag();
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
