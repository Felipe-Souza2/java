package TiposDeVariaveis;
import java.util.Scanner;


public class ExerciciosVariaveisNumericas {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("digite um numero:");
		int quadrado = scanner.nextInt();
		
		int resultado = quadrado * quadrado;
		
		System.out.println(" O quadrado de " +  quadrado  +  "é"  +  resultado + "." );
		
		scanner.close();
	}
}
