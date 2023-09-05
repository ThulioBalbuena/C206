package Exercicios3;

public class Supermercado {
    String nome;
    String endereco;
    int numTelefone;
    Produto[] produtos = new Produto[30];
    String cnpj;

    void mostrarInfos(){
        System.out.println("#####Informações do Supermercado#####");
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Número de Telefone: " + numTelefone);
        System.out.println("CNPJ: " + cnpj);
        for(int i = 0; i < produtos.length; i++){
            if(produtos[i] == null){
                break;
            }
            produtos[i].mostrarInfos();
        }
    }
    void addProduto(Produto p){
        for(int i = 0; i < produtos.length; i++){
            if(produtos[i] == null){
                produtos[i] = p;
                break;
            }
        }
    }
    void contarCategorias(){
        int higiene = 0;
        int utensilios = 0;
        int alimenticios = 0;

        for(int i = 0; i < produtos.length; i++){
            if(produtos[i] == null){
                break;
            }
            if(produtos[i].categoria.equals("Higiene")){
                higiene += produtos[i].quantidade; 
            }
            if(produtos[i].categoria.equals("Utensilios")){
                utensilios += produtos[i].quantidade; 
            }
            if(produtos[i].categoria.equals("Alimenticios")){
                alimenticios += produtos[i].quantidade; 
            }
        }
        

        System.out.println("Higiene: " + higiene);
        System.out.println("Utensílios: " + utensilios);
        System.out.println("Alimentícios: " + alimenticios);
    }
    void mostrarMaisCaroBarato(){
        Produto maisCaro = null;
        Produto maisBarato = null;

        for(int i = 0; i < produtos.length; i++){
            if(produtos[i] == null){
                break;
            }
            if(i == 0){
                maisCaro = produtos[i];
                maisBarato = produtos[i];
            }
            if(produtos[i].valor > maisCaro.valor){
                maisCaro = produtos[i];
            }
            if(produtos[i].valor < maisBarato.valor){
                maisBarato = produtos[i];
            }
        }

        System.out.println("Mais caro: ");
        maisCaro.mostrarInfos();
        System.out.println("Mais barato: ");
        maisBarato.mostrarInfos();
    }

}
