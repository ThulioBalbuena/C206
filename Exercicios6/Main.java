package Exercicios6;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Conta conta = new Conta();

        conta.getClientes()[0] = new Cliente();
        conta.getClientes()[0].setNome("Kiara");
        conta.getClientes()[0].setCpf(123456789);

        conta.getClientes()[1] = new Cliente();
        conta.getClientes()[1].setNome("Kiki");
        conta.getClientes()[1].setCpf(987654321);

        conta.getClientes()[2] = new Cliente();
        conta.getClientes()[2].setNome("thulio");
        conta.getClientes()[2].setCpf(123123123);

        System.out.println("Quanto você deseja depositar?: ");
        conta.deposita(sc.nextDouble());
        System.out.println("Quanto você deseja sacar?: ");
        conta.sacar(sc.nextDouble());
        conta.extrato();
        
        sc.close();
    }
}