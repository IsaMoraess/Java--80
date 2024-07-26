package conta;

import java.util.Scanner;

public class banco {
    private String nomeTitular;
    private int numeroConta;
    private double saldo;

    public banco(String nomeTitular, int numeroConta) {
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0; // Saldo inicial zero
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    public void imprimirDados() {
        System.out.println("Nome do Titular: " + nomeTitular);
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Saldo Atual: " + saldo);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = sc.nextLine();
        System.out.println();

        System.out.println("Informe o número da conta: ");
        int numeroConta = sc.nextInt();
        System.out.println();

        banco conta = new banco(nome, numeroConta);

        System.out.println("Deseja realizar um depósito inicial? (s/n)");
        char opcaoDeposito = sc.next().charAt(0);
        System.out.println();

        if (opcaoDeposito == 's') {
            System.out.println("Informe o valor do depósito inicial: ");
            double valorDeposito = sc.nextDouble();
            conta.depositar(valorDeposito);
            System.out.println();
        }

        System.out.println("Deseja realizar um saque? (s/n)");
        char opcaoSaque = sc.next().charAt(0);
        System.out.println();

        if (opcaoSaque == 's') {
            System.out.println("Informe o valor do saque: ");
            double valorSaque = sc.nextDouble();
            conta.sacar(valorSaque);
            System.out.println();
        }

        System.out.println("Dados da Conta");
        System.out.println();
        conta.imprimirDados();

    }
}




