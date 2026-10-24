package metodos;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Double numeroDireito = infomarNumero(scanner);
		
		imprimirTraco();
		
		Integer operacao = escolhaOperacao(scanner);
		
		imprimirTraco();
		
		Double numeroEsquerda = infomarNumero(scanner);
		
		imprimirTraco();
		
		Double resultado = fazerOperacao(operacao, numeroEsquerda, numeroDireito);
		
		System.out.println("O resultado é: " + resultado);
		
		scanner.close();
		
		
	}
	
	static Double fazerOperacao(Integer operacao, Double esquerda, Double direita) {
		Double resultado = null;
		
		switch (operacao) {
		
		case 0: resultado = adicao(esquerda, direita);
		break;
		
		case 1: resultado = subtracao(esquerda, direita);
		break;
		
		case 2: resultado = divisao(esquerda, direita);
		break;

		case 3: resultado = multiplicacao(esquerda, direita);
		break;
		
		default: 
			System.err.println("Escolha uma operação");
			System.exit(1);
		}
		
		return resultado;
	}
	
	
	static Double adicao(Double direita, Double esquerda) {
		return (esquerda + direita);
	}
	
	static Double subtracao(Double direita, Double esquerda) {
		return (esquerda- direita);
	}
	
	static Double multiplicacao(Double direita, Double esquerda) {
		return (esquerda * direita);
	}
	
	static Double divisao(Double direita, Double esquerda) {
		return (esquerda / direita);
	}
		
	static Integer escolhaOperacao(Scanner scanner) {
		System.out.println("Escolha uma operação");
		
		String[] operacoes = new String[] {"Adição", "Subtração", "Divisão", "Multiplicação"};
		
		for (int i = 0 ; i < operacoes.length ; i++) {
			System.out.println("[" + i + "]" + operacoes[i]);
		}
		
		System.out.print("Digite a operação: ");
		return scanner.nextInt();
	}
	
	static Double infomarNumero(Scanner scanner) {
		System.out.print("Informe um número: ");
		return scanner.nextDouble();
	}
	static void imprimirTraco() {
		System.out.println("----------------------------------------------");
	}
	

}
