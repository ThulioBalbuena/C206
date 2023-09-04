package Exercicios2;

public class escola {
    
    String nome;
    String email;
    int numTelefone;
    String endereco;
    estudante [] estudantes = new estudante[300];

    void addEstudante(estudante e){
        for(int i = 0; i < estudantes.length; i++){
            if(estudantes[i] == null){
                estudantes[i] = e;
                break;
            }
        }
    }

    void mostrarInfos(){
        System.out.println("#####Informações da Escola#####");
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Número de Telefone: " + numTelefone);
        System.out.println("Endereço: " + endereco);
        System.out.println("#####Informações dos Estudantes#####");
        for(int i = 0; i < estudantes.length; i++){
            if(estudantes[i] != null){
                System.out.println("Nome: " + estudantes[i].nome);
                System.out.println("Idade: " + estudantes[i].idade);
                System.out.println("Ano Letivo: " + estudantes[i].anoLetivo);
            }
        }
    }

    void qtdEstudantePorAno(){
        int primeiroAno = 0;
        int segundoAno = 0;
        int terceiroAno = 0;

        for(int i = 0; i < estudantes.length; i++){
            if(estudantes[i] != null){
                if(estudantes[i].anoLetivo.equals("Primeiro Ano")){
                    primeiroAno++;
                }else if(estudantes[i].anoLetivo.equals("Segundo Ano")){
                    segundoAno++;
                }else if(estudantes[i].anoLetivo.equals("Terceiro Ano")){
                    terceiroAno++;
                }
            }
        }

        System.out.println("#####Quantidade de Estudantes por Ano Letivo#####");
        System.out.println("Primeiro Ano: " + primeiroAno);
        System.out.println("Segundo Ano: " + segundoAno);
        System.out.println("Terceiro Ano: " + terceiroAno);
    }
}