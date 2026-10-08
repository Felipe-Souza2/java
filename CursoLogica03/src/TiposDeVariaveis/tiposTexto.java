package TiposDeVariaveis;

import java.util.Scanner;

public class tiposTexto {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String nome = scanner.nextLine();
		
		System.out.println("Óla " + nome + "!");
		
		scanner.close();
	}
}
