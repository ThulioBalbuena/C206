package PCMania;

public class Cliente {
    String nome;
    long cpf;
    Computador[] compras;

    void mostraCliente(){
        System.out.println("Cliente: ");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
    }
    
    float calculaTotalCompra(){
        float total = 0;
        for(int i = 0; i < compras.length; i++){
            if(compras[i] != null){
                total += compras[i].preco;
            }
        }
        return total;
    }

}
