package iteracao;

public class iteracaoFor {
	public static void main(String[] args) {
//		for (int i = 0; i < 5 ; i++ ) {
//			System.out.println(i + " :Uma frase qualqueer");
//		}
		
//		Double[] carrinhoDeCompras = new Double[] {50.0, 51.0, 52.0};
//		Double total = 0.0;
//		for(int i = 0; i < carrinhoDeCompras.length; i++) {
//			System.out.println("Interação: " + i + ", total: " + total );
//			total += carrinhoDeCompras[i];
//		}
//		System.out.println("Total: " + total);
		
		
//		for (int i = 0; i < 10; i++) {
//			if (i == 5) {
//				System.out.println("vai parar!");
//				break;
//			}
//			System.out.println("Interação: " + i);
//		}

//		for (int i = 0; i < 10; i++) {
//			if (i == 5) {
//				System.out.println("vai continuar!");
//				continue;
//			}
//			System.out.println("Interação: " + i);
//		}
		
		//ESSE FOR  USA-SE PARA PROCURAR ALGO ESPECIFICO DENTRO DO ARRAY!
		
		Integer[] produtos = new Integer[]{100, 225, 300};
		
		for (int i = 0; i < produtos.length; i++) {
			Integer produto = produtos[i];
			
			System.out.println("Produto de código: " + produto);
			
			if (produto.equals(225)) {
				System.out.println("Produto encontrado!");
				break;
			}
		}
	}
}
