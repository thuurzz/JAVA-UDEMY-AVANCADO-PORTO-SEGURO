package sessao09.banco;

public class Conta {
	private String nome;
	private int numconta;
	private double saldo;

	public Conta(String nome, int numconta, double depositoInicial) {
		this.nome = nome;
		this.numconta = numconta;
		deposito(depositoInicial);
	}

	public Conta(String nome, int numconta) {
		this.nome = nome;
		this.numconta = numconta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double valor) {
		this.saldo += valor;
	}
	
	// Retira valor da conta, cobra taxa de 5U$ por saque.
	public void saque(double valor) {
		this.saldo -= valor + 5;
	}


	public int getNumconta() {
		return numconta;
	}

	public String toString() {
		return "### Detalhes da Conta ### \n"
				+"Nome: "
				+ nome + "\n"
				+ "Numero da conta: " 
				+ numconta + "\n"
				+ "Saldo = R$"
				+ String.format("%.2f", saldo);
	}
}
