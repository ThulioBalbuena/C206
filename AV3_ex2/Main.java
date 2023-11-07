package AV3_ex2;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        //criando um arquivo
        Arquivo arq = new Arquivo();
        //criando um scanner(entrada de dados)
        Scanner sc = new Scanner(System.in);
        //criando um veiculo
        Veiculo veiculo = new Veiculo();
        Motor motor = new Motor();

        boolean flag=true;

        while(flag){

            ArrayList<Veiculo> listaveiculos = arq.ler();
            
        if(listaveiculos.size() == 0){
            System.out.println("Não há veiculos cadastrados");
        }

        System.out.println("BEM VINDO AO MENU");
        System.out.println("1 - Cadastrar veiculo");
        System.out.println("2 - Listar veiculos");
        System.out.println("3 - Listar veiculos por ordem decrescente de ano"); 
        System.out.println("4 - Listar a quantidade de veiculos por marca"); 
        System.out.println("5 - Sair");
        System.out.println("Digite a opção desejada: ");
        int opcao = sc.nextInt();
        sc.nextLine();
        switch(opcao){
            case 1:
            //atribuindo valores ao veiculo(objeto)
            System.out.println("Digite a marca do veiculo: ");
            try{
                veiculo.setmarca(sc.nextLine());
                if(!veiculo.getmarca().equals("RollsRoyce") && !veiculo.getmarca().equals("Bentley")){
                    throw new ValorInvalidoException();
                }
            }catch(ValorInvalidoException invalidValue){
                System.out.println(invalidValue);
                break;
            }
            System.out.println("Digite o modelo do veiculo: ");
            veiculo.setmodelo(sc.nextLine());
            System.out.println("Digite o ano do veiculo: ");
            //tratameto para verificar o ano
            try{
                veiculo.setano(sc.nextInt());
                if(veiculo.getano() < 1960 || veiculo.getano() > 2024){
                    throw new ValorInvalidoException();
                }
            }catch(ValorInvalidoException invalidValue){
                System.out.println(invalidValue);
                break;
            }
            System.out.println("Digite a quilometragem do veiculo: ");
            //tratameto para verificar se a km é menor que 0
            try{
                veiculo.setkmRodados(sc.nextDouble());
                if(veiculo.getkmRodados() < 0){
                    throw new ValorInvalidoException();
                }
            }catch(ValorInvalidoException invalidValue){
                System.out.println(invalidValue);
                break;
            }
            System.out.println("Digite a potencia do motor do veiculo: ");
            //tratameto para verificar se a potencia é menor ou igual a 0
            try{
               motor.setpotencia(sc.nextDouble());
                if(motor.getpotencia() < 0){
                    throw new ValorInvalidoException();
                }
            }catch(ValorInvalidoException invalidValue){
                System.out.println(invalidValue);
                break;
            }
            System.out.println("Digite a cilindrada do motor do veiculo: ");
            //tratameto para verificar se a cilindrada é menor ou igual a 0
            try{
                motor.setcilindrada(sc.nextInt());
                if(motor.getcilindrada() < 0){
                    throw new ValorInvalidoException();
                }
            }catch(ValorInvalidoException invalidValue){
                System.out.println(invalidValue);
                break;
            }
            veiculo.motor = motor;
            arq.escrever(veiculo);
            break;
            case 2:
            for(int i=0; i<listaveiculos.size(); i++){
                System.out.println("Informações do veiculo:\n");
                System.out.println("Marca do veiculo: "+listaveiculos.get(i).getmarca());
                System.out.println("Modelo do veiculo: "+listaveiculos.get(i).getmodelo());
                System.out.println("Ano do veiculo: "+listaveiculos.get(i).getano());  
                System.out.println("Quilometragem do veiculo: "+listaveiculos.get(i).getkmRodados());
                System.out.println("Potencia do motor do veiculo: "+listaveiculos.get(i).motor.getpotencia());
                System.out.println("Cilindrada do motor do veiculo: "+listaveiculos.get(i).motor.getcilindrada());
            }
            break;
            case 3:
            //ordernar o arraylist por ordem decrescente de ano
            Collections.sort(listaveiculos,Collections.reverseOrder());

            System.out.println("Lista de filmes em ordem decrescente de ano:\n");
            for(int i=0;i<listaveiculos.size();i++){
                System.out.println("Informações do veiculo:\n");
                System.out.println("Marca do veiculo: "+listaveiculos.get(i).getmarca());
                System.out.println("Modelo do veiculo: "+listaveiculos.get(i).getmodelo());
                System.out.println("Ano do veiculo: "+listaveiculos.get(i).getano());
                System.out.println("Quilometragem do veiculo: "+listaveiculos.get(i).getkmRodados());
                System.out.println("Potencia do motor do veiculo: "+listaveiculos.get(i).motor.getpotencia());
                System.out.println("Cilindrada do motor do veiculo: "+listaveiculos.get(i).motor.getcilindrada());
            }
            break;
            case 4:
            System.out.println("Lista de veiculos de cada marca:\n");
            int rolls = 0;
            int bentley = 0;
            for(int i=0;i<listaveiculos.size();i++){
                if(listaveiculos.get(i).getmarca().equals("Bentley")){
                    bentley++;
                }
                if(listaveiculos.get(i).getmarca().equals("RollsRoyce")){
                    rolls++;
                }
            }
            System.out.println("Quantidade de Veiculos BENTLEY:");
            System.out.println(bentley + "\n");
            System.out.println("Quantidade de Veiculos ROLLSROYCE:");
            System.out.println(rolls + "\n");
            break;
            case 5:
            flag=false;
            break;
        }
    }
    sc.close();
}
}
