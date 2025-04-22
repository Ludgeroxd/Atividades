package Atividade;

public class Extra02 {

	public static void main(String[] args) {
		import java.util.Scanner;

public class BancoSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria conta = null;

        System.out.println("Bem-vindo ao Banco Simples!");
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Digite o saldo inicial: ");
        double saldoInicial = scanner.nextDouble();

        conta = new ContaBancaria(nome, cpf, saldoInicial);

        int opcao;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Ver saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    conta.verSaldo();
                    break;
                case 2:
                    System.out.print("Digite o valor para depósito: ");
                    double deposito = scanner.nextDouble();
                    conta.depositar(deposito);
                    break;
                case 3:
                    System.out.print("Digite o valor para saque: ");
                    double saque = scanner.nextDouble();
                    conta.sacar(saque);
                    break;
                case 4:
                    System.out.println("Obrigado por usar o Banco Simples. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 4);

        scanner.close();
    }
}

class ContaBancaria {
    private String nomeCliente;
    private String cpf;
    private double saldo;

    public ContaBancaria(String nomeCliente, String cpf, double saldoInicial) {
        this.nomeCliente = nomeCliente;
        this.cpf = cpf;
        this.saldo = saldoInicial;
        System.out.println("Conta criada com sucesso para " + nomeCliente + "!");
    }

    public void verSaldo() {
        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso.%n", valor);
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso.%n", valor);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }
}


	}

}
