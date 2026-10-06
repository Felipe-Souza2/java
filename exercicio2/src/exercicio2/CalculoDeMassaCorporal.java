package exercicio2;

import java.util.Scanner;

public class CalculoDeMassaCorporal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Digite seu peso:");
		Double peso = scanner.nextDouble();
		
		System.out.print("Digite sua altura:");
		Double altura = scanner.nextDouble();
		
		Double resultado = peso / (altura * altura);
		
		System.out.println("IMC:" + resultado);
		
		scanner.close();
	
	}
}
