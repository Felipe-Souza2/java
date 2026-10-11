package estruturaDeDecisao;

import java.util.Scanner;

public class exercicioEstruturaDecisao {
	static final Double NOTA_MINIMA = 60.0;
	static final Double NOTA_MEDIA = 150.0;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite sua nota da Prova de Portugues: ");
		Double resultadoProvaDePortugues = scanner.nextDouble();
		
		System.out.print("Digite sua nota da Prova de Matematica: ");
		Double resultadoProvaDeMatematica = scanner.nextDouble();
		
		if ((resultadoProvaDePortugues>= NOTA_MINIMA) && (resultadoProvaDeMatematica >= NOTA_MINIMA) && 
				(resultadoProvaDeMatematica + resultadoProvaDePortugues) == NOTA_MEDIA) {
			System.out.println("Parabéns voce passou!");
		} else {
			System.out.println("Sinto muito mas tem q se esforçar mais nas proximas!");
		}
		scanner.close();
	}

}
