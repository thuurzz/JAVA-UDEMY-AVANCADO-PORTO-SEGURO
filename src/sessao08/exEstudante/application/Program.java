package sessao08.exEstudante.application;

import java.util.Scanner;

import sessao08.exEstudante.entities.Estudante;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com os dados do aluno: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();

		System.out.print("Nota 1: ");
		Double n1 = sc.nextDouble();
		System.out.print("Nota 2: ");
		Double n2 = sc.nextDouble();
		System.out.print("Nota 3: ");
		Double n3 = sc.nextDouble();

		Estudante e1 = new Estudante(nome, n1, n2, n3);

		String result = (e1.getMedia() >= 60.0) ? "Aprovado" : "Reprovado";

		if (result.equals("Reprovado")) {
			Double mf;
			mf = 60 - e1.getMedia();
			System.out.printf("Situação: %s, Nota: %.2f \n", result, e1.getMedia());
			System.out.printf("Para aprovação faltam: %.2f.", mf);
		}
		else {
			System.out.printf("Situação: %s, Nota: %.2f \n", result, e1.getMedia());
		}
		sc.close();

	}

}
