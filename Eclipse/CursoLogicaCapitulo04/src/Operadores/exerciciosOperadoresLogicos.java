package Operadores;

import java.util.Scanner;


public class exerciciosOperadoresLogicos {
	static final  Integer IDADE_MINIMA_APOSENTADORIA = 55;
	static final  Integer TEMPO_DE_CONTRIBUICAO_MINIMA_PARA_APOSENTADORIA = 55;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Qual sua idade: ");
		Integer idade  =  scanner.nextInt();
		
		System.out.print("Qual seu tempo de contribuição com a previdencia: ");
		Integer tempoDeContribuicaoPrevidencia =  scanner.nextInt();
		
		if (idade >= IDADE_MINIMA_APOSENTADORIA && tempoDeContribuicaoPrevidencia >= TEMPO_DE_CONTRIBUICAO_MINIMA_PARA_APOSENTADORIA) {
			System.out.println("Voçe pode se aposentar");
		} else {
			System.out.println("Sinto muito mas não esta na hora de se aposentar");
		}
		
		scanner.close();
		
	}

}
