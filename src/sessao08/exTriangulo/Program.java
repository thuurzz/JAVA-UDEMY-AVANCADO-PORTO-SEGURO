package sessao08.exTriangulo;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		
		double areaX, areaY;
		
		Triangle x = new Triangle();
		Triangle y = new Triangle();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com as medidas do triânguilo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Entre com as medidas do triânguilo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		areaX = x.Area();
		areaY = y.Area();
		
		System.out.printf("A aŕea do tringulo X é: %.4f \n", areaX);
		System.out.printf("A aŕea do tringulo Y é: %.4f \n", areaY);
		
		System.out.println((areaY > areaX)? "Y é maior" : "X é maior");
		sc.close();

	}

}
