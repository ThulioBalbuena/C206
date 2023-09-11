package PCMania;

import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
            
        Scanner sc = new Scanner(System.in);

        Computador pc1 = new Computador();
        Computador pc2 = new Computador();
        Computador pc3 = new Computador();

        Cliente cliente = new Cliente();

        MemoriaUSB memoria1 = new MemoriaUSB();
        memoria1.nome = "Pendrive";
        memoria1.capacidade = 16;

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

        pc1.addMemoriaUSB(memoria1);

        MemoriaUSB memoria2 = new MemoriaUSB();
        memoria2.nome = "Pendrive";
        memoria2.capacidade = 32;

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

        pc2.addMemoriaUSB(memoria2);

        MemoriaUSB memoria3 = new MemoriaUSB();
        memoria3.nome = "HD Externo";
        memoria3.capacidade = 1000;


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

        pc3.addMemoriaUSB(memoria3);

        cliente.nome = "Kiara";
        cliente.cpf = 123456789;
        cliente.compras = new Computador[8];

        int e = 0;  
        boolean controle = true;

        System.out.println("#### LOJA PC MANIA, computadores disponíveis para compra:");
        System.out.println("#### Computador 1:");
        pc1.mostraPCConfigs();
        System.out.println("#### Computador 2:");
        pc2.mostraPCConfigs();
        System.out.println("#### Computador 3:");
        pc3.mostraPCConfigs();


        while(controle){
        System.out.println("Digite o número do computador que deseja comprar ou digite 0 caso deseje sair do menu: ");

        int escolha = sc.nextInt();

        switch (escolha) {
            case 1:
            System.out.println("Computador 1 adicionado na sacola de compras: ");
            cliente.compras[e] = pc1;
            e++;
                break;
            case 2:
            System.out.println("Computador 2 adicionado na sacola de compras: ");
            cliente.compras[e] = pc2;
            e++;
                break;
            case 3:
            System.out.println("Computador 3 adicionado na sacola de compras: ");
            cliente.compras[e] = pc3;
            e++;
                break;
            case 0:
                System.out.println("#### Obrigado por comprar conosco!");
                cliente.mostraCliente();
                System.out.println();
                System.out.println("Computadores comprados: ");
                for(int i = 0; i < e; i++){
                        if(cliente.compras[i] != null){
                            cliente.compras[i].mostraPCConfigs();
                        }
                            System.out.println();
                    }
                    System.out.println("Total da compra: " + cliente.calculaTotalCompra());
                controle = false;
                break;
        }
    }
    sc.close();
    }
}


