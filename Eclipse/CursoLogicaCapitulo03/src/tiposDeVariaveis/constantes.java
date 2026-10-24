package tiposDeVariaveis;

import java.util.Scanner;

public class constantes {
	static final Integer IDADE_MINIMA = 18;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//final Integer idadeMinima = 18; // (não pode mais ser alterada) com a palavra final antes do tipo indica que é uma constante
		
		System.out.print("Idade: ");
		Integer idade = scanner.nextInt();
		
		Boolean podeTirarCarteira = idade >= IDADE_MINIMA;
		
		if  (podeTirarCarteira) {
			System.out.println("Sim ! Ele(a) pode tirar a carteira!");
		} else {
			System.out.println("Não! Ele(a) não pode tirar a carteira!");
		}
		scanner.close();
	}
}
