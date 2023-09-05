package Exercicios3;

public class Produto{

    String nome;
    double valor;
    int codigoSerie;
    String categoria;
    int quantidade;

    void mostrarInfos(){
        System.out.println("#####Informações do Produto#####");
        System.out.println("Nome: " + nome);
        System.out.println("Valor: " + valor);
        System.out.println("Codigo de Serie: " + codigoSerie);
        System.out.println("Categoria: " + categoria);
        System.out.println("Quantidade: " + quantidade);
    }
}