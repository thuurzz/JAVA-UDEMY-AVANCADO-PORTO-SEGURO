package sessao08.exProduto.application;

import java.util.Scanner;

import sessao08.exProduto.entities.Product;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Product p1 = new Product();
		
		System.out.println("Entre com os dados do produto:");
		
		System.out.print("Nome:");
		p1.nome = sc.nextLine();
		
		System.out.print("Preço:");
		p1.preco = sc.nextDouble();
		
		System.out.print("Quantidade:");
		p1.quantidade = sc.nextInt();
		
		System.out.println("Dados do produto: " + p1);
		
		System.out.print("Entre com o número de produtos a serem adicionados ao estoque: ");
		int n = sc.nextInt();
		p1.AddProdutos(n);
		System.out.println("Estoque atual:" + p1);
		
		System.out.print("Entre com o número de produtos a retirados do estoque: ");
		n = sc.nextInt();
		p1.RemoveProdutos(n);
		System.out.println("Estoque atual:" + p1);
		
		sc.close();
	}
}
