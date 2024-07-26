package conta;
/*O programa deve permitir o cadastro de contas bancárias, solicitando o número da conta, o nome do titular e,
opcionalmente, o valor de depósito inicial. Após o cadastro, o usuário pode realizar depósitos e saques na conta, 
com o saldo atualizado após cada operação. O número da conta é fixo e não pode ser alterado, 
enquanto o nome do titular pode ser modificado. 
O saldo só pode ser aumentado por depósitos e diminuído por saques, com uma taxa de 
$5.00 cobrada para cada saque realizado. */

public class App{
    private String nomeTitular;
    private int numeroConta;
    private double saldo;

    public App(String nomeTitular, int numeroConta) {
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
}



