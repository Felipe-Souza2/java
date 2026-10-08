package TiposDeVariaveis;

import java.util.Scanner;

public class exercicioDeConstantes {
	static final Integer NOTA_MINIMA = 70;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a nota do aluno:");
		int notaAluno = scanner.nextInt();
		
		Boolean resultado = notaAluno >= NOTA_MINIMA;
		
		if (resultado) {
			System.out.println("passou!");
		} else {
			System.out.println("Não passou!");
		}
		
		scanner.close();
	}
}
