package Operadores;

public class operadoresDeAtribuicao {
	public static void main(String[] args) {
		Integer numero = 8;
		
		numero += 4;
		System.out.println("numero += 4: " + numero);  //nesta sequecia ele atribui valor e segue para proxima com o valor atribuido  ex: 12 -> 10 assim consecutivamete ate o fim.
		
		numero -= 2;
		System.out.println("numero -= 4: " + numero);
		
		numero *= 4;
		System.out.println("numero *= 4: " + numero);
		
		numero /= 4;
		System.out.println("numero /= 4: " + numero);
		
		numero %= 4;
		System.out.println("numero %= 4: " + numero);
	}
}
