package primeiraClasse;


public class exercicioPOO {

	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.nome = "TV LCD 70'";
		produto.quantidade = 10;
		

		System.out.println("Necessario repor Estoque " + produto.nome + reporEstoque(produto));
	}
	
	static Boolean reporEstoque(Produto produto) {
		if (produto.quantidade < produto.QUANTIDADE_MINIMA) return true;
		
		return false;
	
		
	}

}
