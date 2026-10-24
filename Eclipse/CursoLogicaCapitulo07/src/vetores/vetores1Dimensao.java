package vetores;

import java.util.Scanner;

public class vetores1Dimensao {

	public static void main(String[] args) {
		String[] cardapio = new String[] {"calabresa", "Frango", "Queijo", "Presunto", "Floresta Negra"};
		
		System.out.println("Escolha o sabor: ");
		
		for (int i = 0; i < cardapio.length; i++) {
			System.out.println("[" + i +  "]" + cardapio[i]);
		}
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o númeo referente ao sabor: ");
		Integer saborEscolhido = scanner.nextInt();
		
		System.out.println("Sabor escolhido: " + cardapio[saborEscolhido]);
		
		
		
		scanner.close();
		
//		
//		
//		String[] cardapio2 = new String[] {"calabresa", "Frango", "Queijo", "Presunto", "Floresta Negra"};
//		cardapio[0] = "Strogonoff de carne";
//		
//		for (int i = 0; i < cardapio2.length; i++) {
//			System.out.println( cardapio2[i]);
//		}
//		
//		
//		String[] cardapio3 = new String[5];
//		cardapio3[0] = "Calabresa";
//		cardapio3[1] = "Frango";
//		cardapio3[2] = "Queijo";
//		cardapio3[3] = "Presunto";
//		cardapio3[4] = "Floresta Negra";
//		
//		for (int i = 0; i < cardapio3.length; i++) {
//			System.out.println( cardapio3[i]);
//		}
	
	}

}
