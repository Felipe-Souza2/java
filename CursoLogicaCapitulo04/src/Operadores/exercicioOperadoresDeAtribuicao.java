package Operadores;

import java.util.Scanner;

public class exercicioOperadoresDeAtribuicao {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Double totalDeGastosMes = 0.0;
		
		System.out.print("Digite o valor da conta de luz: ");
		totalDeGastosMes += scanner.nextDouble();
		
		System.out.print("Digite o valor da conta de água: ");
		totalDeGastosMes += scanner.nextDouble();
		
		System.out.print("Digite o valor da conta de telefone: ");
		totalDeGastosMes += scanner.nextDouble();
		
		System.out.print("Digite o valor da escola do filho: ");
		totalDeGastosMes += scanner.nextDouble();
		
		System.out.print("Digite o valor da conta do cartão: ");
		totalDeGastosMes += scanner.nextDouble();
		
		System.out.print("Digite o valor do supermercado: ");
		totalDeGastosMes += scanner.nextDouble();
		
		System.out.println("Gasto do mes foi de : " + totalDeGastosMes);
		
		scanner.close();
		
		
	}
}
