package NP1;

public class Cliente {
    String nome = "João";
    long cpf = 123456789; 
    float totalCompra;

    void mostraCliente(){
        System.out.println("Cliente: ");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
    }
    
    float calculaTotalCompra(float preco){
        totalCompra = totalCompra + preco;
        return totalCompra;
    }

}
