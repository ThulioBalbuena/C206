package NP1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            
        Scanner sc = new Scanner(System.in);

        Computador pc1 = new Computador();
        Computador pc2 = new Computador();
        Computador pc3 = new Computador();

        Cliente cliente = new Cliente();

        pc1.marca = "Positivo";
        pc1.preco = 2300;
        pc1.so.nome = "Linux Ubuntu";
        pc1.so.tipo = 32;
        pc1.RAM.nome = "Memória RAM";
        pc1.RAM.capacidade = 8;
        pc1.HD.nome = "HD";
        pc1.HD.capacidade = 500;
        pc1.CPU.nome = "Pentium Core i3";
        pc1.CPU.capacidade = 2200;


        pc2.marca = "Acer";
        pc2.preco = 5800;
        pc2.so.nome = "Windows 8";
        pc2.so.tipo = 64;
        pc2.RAM.nome = "Memória RAM";
        pc2.RAM.capacidade = 16;
        pc2.HD.nome = "HD";
        pc2.HD.capacidade = 1000;
        pc2.CPU.nome = "Pentium Core i5";
        pc2.CPU.capacidade = 3370;


        pc3.marca = "Vaio";
        pc3.preco = 1800;
        pc3.so.nome = "Windows 10";
        pc3.so.tipo = 64;
        pc3.RAM.nome = "Memória RAM";
        pc3.RAM.capacidade = 32;
        pc3.HD.nome = "HD";
        pc3.HD.capacidade = 2000;
        pc3.CPU.nome = "Pentium Core i7";
        pc3.CPU.capacidade = 4500;


        boolean controle = true;

        int comprouPC1 = 0;
        int comprouPC2 = 0;
        int comprouPC3 = 0;
        int escolhaUSB1 = 0;
        int escolhaUSB2 = 0;
        int escolhaUSB3 = 0;

        while(controle){
        System.out.println("#### LOJA PC MANIA, computadores disponíveis para compra:");
        System.out.println("#### Computador 1:");
        pc1.mostraPCConfigs();
        System.out.println("#### Computador 2:");
        pc2.mostraPCConfigs();
        System.out.println("#### Computador 3:");
        pc3.mostraPCConfigs();
        System.out.println("Digite o número do computador que deseja comprar ou digite 0 caso deseje sair do menu: ");

        int escolha = sc.nextInt();

        switch (escolha) {
            case 1:
            System.out.println("Deseja inserir memoria USB? Digite 1 para sim e 0 para não: ");
            escolhaUSB1 = sc.nextInt();
            cliente.calculaTotalCompra(pc1.preco);
            comprouPC1++;
                break;
            case 2:
            System.out.println("Deseja inserir memoria USB? Digite 1 para sim e 0 para não: ");
            escolhaUSB2 = sc.nextInt();
               cliente.calculaTotalCompra(pc2.preco);
                comprouPC2++;
                break;
            case 3:
            System.out.println("Deseja inserir memoria USB? Digite 1 para sim e 0 para não: ");
            escolhaUSB3 = sc.nextInt();
             cliente.calculaTotalCompra(pc3.preco);
                comprouPC3++;
                break;
            case 0:
                System.out.println("#### Obrigado por comprar conosco! Você comprou:");
                if(comprouPC1 > 0){
                    System.out.println("#### Você comprou "+ comprouPC1 + " computador(es) 1: " );
                    pc1.mostraPCConfigs();
                    if(escolhaUSB1 == 1){
                        pc1.addMemoriaUSB("Pen Drive", 16);
                    }
                }
                if(comprouPC2 > 0){
                    System.out.println("#### Você comprou " + comprouPC2 + " computador(es) 2: ");
                    pc2.mostraPCConfigs();
                    if(escolhaUSB2 == 1){
                        pc2.addMemoriaUSB("Pen Drive", 32);
                    }
                }
                if(comprouPC3 > 0){
                    System.out.println("#### Você comprou " + comprouPC3 + " computador(es) 3: ");
                    pc3.mostraPCConfigs();
                    if(escolhaUSB3 == 1){
                        pc3.addMemoriaUSB("HD Externo", 1000);
                    }
                }
                float total = cliente.calculaTotalCompra(0);
                cliente.mostraCliente();
                System.out.println("O total da compra foi de: " + total);
                controle = false;
                break;
        }
    }
    sc.close();
    }
}
