package sessao08.exProduto.entities;

public class Product {
	
	public String nome;
	public double preco;
	public int quantidade;
	
	public Product() {
		
	}
	
	public Product(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public Double ValorTotalEmEstoque() {
		return preco * quantidade;
	}
	
	public void AddProdutos(int qtd) {
		quantidade += qtd;
	}
	
	public void RemoveProdutos(int qtd) {
		quantidade -= qtd;
	}

	@Override
	public String toString() {
		return nome + 
				", BRL"
				+ String.format("%.2f", preco) 
				+ ", Quantidade = "
				+ quantidade
				+ " unidades, Total em valor: BRL: "
				+ String.format("%.2f", ValorTotalEmEstoque());
	}
}

