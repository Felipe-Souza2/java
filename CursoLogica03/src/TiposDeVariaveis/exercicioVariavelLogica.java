package TiposDeVariaveis;

import java.util.Scanner;


public class exercicioVariavelLogica {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a nota do aluno:");
		int notaAluno = scanner.nextInt();
		
		Boolean resultado = notaAluno >= 70;
		
		if (resultado) {
			System.out.println("passou!");
		} else {
			System.out.println("Não passou!");
		}
		
		scanner.close();
	}
}
