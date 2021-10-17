package sessao09.banco;

import java.util.Scanner;

public class BancoAccount {

	public static void main(String[] args) {

		Conta conta;

		// Aprenta menu para entrada de cadastro
		System.out.println("### BANCO JAVANEIXON ###");
		System.out.println("Cadastro de novos clientes");

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite número de conta, com 4 digitos: ");
		int numConta = sc.nextInt();

		System.out.print("Digite seu nome: ");
		sc.nextLine();
		String nome = sc.nextLine();

		System.out.print("Deseja fazer um depósito inicial? [S/N] ");
		char resp = sc.nextLine().charAt(0);
		double valor;
		if (resp == 'S') {
			System.out.print("Digite valor para depósito inicial: ");
			valor = sc.nextDouble();
			conta = new Conta(nome, numConta, valor);
		} else {
			conta = new Conta(nome, numConta);
		}

		// Mostra atributos da conta
		System.out.println();
		System.out.println("Atributos da conta:");
		System.out.println(conta);
		
		// Realiza depósito
		System.out.println();
		System.out.print("Entre com valor para depósito: ");
		double valorDeposito = sc.nextDouble();
		conta.deposito(valorDeposito);
		System.out.println();
		System.out.println("Valor de saldo atualizado!");
		System.out.println();
		System.out.println(conta);
		
		// Realiza saque
		System.out.println();
		System.out.print("Entre com valor para saque: ");
		valorDeposito = sc.nextDouble();
		conta.saque(valorDeposito);
		System.out.println();
		System.out.println("Valor de saldo atualizado!");
		System.out.println();
		System.out.println(conta);
		
		
		sc.close();
	}

}
