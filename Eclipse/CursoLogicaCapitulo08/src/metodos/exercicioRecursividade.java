package metodos;

import java.util.Scanner;

public class exercicioRecursividade {
	static final Integer NUMERO_INICIAL = 0;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		Integer numero = scanner.nextInt();
		
		imprimirTabuada(numero, NUMERO_INICIAL);
		
		scanner.close();
		
	}
	
	static void imprimirTabuada(Integer multiplicando, Integer multiplicador) {
		System.out.println(multiplicando + " x " + multiplicador + " = " + (multiplicando * multiplicador));
		
		if (++multiplicador <= 10) {
			imprimirTabuada(multiplicando, multiplicador);
		}
		
	}

}
