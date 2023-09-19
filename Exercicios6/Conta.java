package Exercicios6;

public class Conta {
    private double saldo;
    private Cliente [] cliente;

    public Conta(){
        setClientes(new Cliente[3]);
    }

    public Cliente[] getClientes() {
        return cliente;
    }

    public void setClientes(Cliente[] cliente) {
        this.cliente = cliente;
    }


    public double getSaldo(){
        return saldo;
    }

    public void sacar(double valorDep){
        if (valorDep <= getSaldo()){
            this.saldo -= valorDep;
            System.out.println("Saque realizado com sucesso");
        }
    }

    public void deposita(double valorDep){
        this.saldo += valorDep;
        System.out.println("Depósito realizado com sucesso");
    }
    
    public void extrato(){
        System.out.println("Saldo atual: " + getSaldo());
    }
}