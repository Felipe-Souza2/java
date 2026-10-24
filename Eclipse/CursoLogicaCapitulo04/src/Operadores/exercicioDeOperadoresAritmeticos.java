package Operadores;

import java.util.Scanner;

public class exercicioDeOperadoresAritmeticos {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite um numero:  ");
		Integer primeiroNumeroDaOperacao = scanner.nextInt();
		
		System.out.print("Digite um numero da operaçåo [1 = Adição, 2 = Subtração, 3 = Multiplicação, 4 = Divisão]: ");
		Integer operacao = scanner.nextInt();
		
		System.out.print("Digite um segundo numero:  ");
		Integer segundoNumeroDaOperacao = scanner.nextInt();
		
		Integer resultado = null;
		
		if (operacao.equals(1)) {
			resultado = primeiroNumeroDaOperacao + segundoNumeroDaOperacao;
			System.out.println("O resultado da operação é: " + resultado);
		}
		if (operacao.equals(2)) {
			resultado = primeiroNumeroDaOperacao - segundoNumeroDaOperacao;
			System.out.println("O resultado da operação é: " + resultado);
		}
		if (operacao.equals(3)) {
			resultado = primeiroNumeroDaOperacao * segundoNumeroDaOperacao;
			System.out.println("O resultado da operação é: " + resultado);
		}
		if (operacao.equals(4)) {
			resultado = primeiroNumeroDaOperacao / segundoNumeroDaOperacao;
			System.out.println("O resultado da operação é: " + resultado);
		}
		
		
	}
}
