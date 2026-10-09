package Operadores;

import java.util.Scanner;

public class exercicioOperadoresRelacionais {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		Double produto = scanner.nextDouble();
		
		Double frete = 15.00;
		if (produto >= 100.00) {
			System.out.println("Sua compra ficou: " + produto);
		} else {
			Double acrescimo = produto + frete;
			System.out.println("sua compra ficou no valor de: " + acrescimo);
		}
		
		
		
	}
}
