package AV3_ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        //criando um arquivo
        Arquivo arq = new Arquivo();
        //criando um scanner(entrada de dados)1
        Scanner sc = new Scanner(System.in);
        //criando um filme
        Filme filme = new Filme();
        boolean flag=true;

        while(flag){

            ArrayList<Filme> listaFilmes = arq.ler();
            
        if(listaFilmes.size() == 0){
            System.out.println("Não há filmes cadastrados");
        }

        System.out.println("BEM VINDO AO MENU");
        System.out.println("1 - Cadastrar Filme");
        System.out.println("2 - Listar Filmes");
        System.out.println("3 - Listar Filmes de A-Z");
        System.out.println("4 - Listar Filmes de Z-A");
        System.out.println("5 - Sair");
        System.out.println("Digite a opção desejada: ");
        int opcao = sc.nextInt();
        sc.nextLine();
        switch(opcao){
            case 1:
            //atribuindo valores ao filme(objeto)
            System.out.println("Digite o nome do filme: ");
            filme.setNomeFilme(sc.nextLine());
            System.out.println("Digite o gênero do filme: ");
            filme.setGeneroFilme(sc.nextLine());
            System.out.println("Digite a duração do filme: ");
            //tratameto para verificar se a duração é negativa ou 0
            try{
                filme.setDuracaoMin(sc.nextInt());
                if(filme.getDuracaoMin() <= 0){
                    throw new DuracaoNegativaReception();//excecão lançada para a duracao ser negativa ou 0
                }
            }catch(DuracaoNegativaReception duracaooNeg){
                System.out.println(duracaooNeg);
                break;
            }
            arq.escrever(filme);
            break;
            case 2:
            for(int i=0; i<listaFilmes.size(); i++){
                System.out.println("Informações do filme:\n");
                System.out.println("Nome do filme: "+listaFilmes.get(i).getNomeFilme());
                System.out.println("Gênero do filme: "+listaFilmes.get(i).getGeneroFilme());
                System.out.println("Duração do filme: "+listaFilmes.get(i).getDuracaoMin());
            }
            break;
            case 3:
            //ordernar o arraylist por ordem alfabética (A-Z)
            Collections.sort(listaFilmes);

            System.out.println("Lista de filmes em ordem alfabética (A-Z):\n");
            for(int i=0;i<listaFilmes.size();i++){
                System.out.println("Informações do filme:\n");
                System.out.println("Nome do filme: "+listaFilmes.get(i).getNomeFilme());
                System.out.println("Gênero do filme: "+listaFilmes.get(i).getGeneroFilme());
                System.out.println("Duração do filme: "+listaFilmes.get(i).getDuracaoMin());
            }
            break;
            case 4:
            Collections.sort(listaFilmes, Collections.reverseOrder()); //ordena o arrayList de forma reversa
            
            System.out.println("Lista de filmes de Z-A:\n");
            for(int i=0;i<listaFilmes.size();i++){
                System.out.println("Informações do filme:\n");
                System.out.println("Nome do filme: "+listaFilmes.get(i).getNomeFilme());
                System.out.println("Gênero do filme: "+listaFilmes.get(i).getGeneroFilme());
                System.out.println("Duração do filme: "+listaFilmes.get(i).getDuracaoMin());
            }
            break;
            case 5:
            flag=false;
            break;
        }
    }
    sc.close();
}
}
