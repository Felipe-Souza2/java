package classeInstancia;

public class classeInstanciaMain {

	public static void main(String[] args) {
		System.out.println("Quantidade minima estoque: " + Produto.quantidade_minima_estoque);
		
		Produto produto = new Produto();
		produto.nome = "caneca";
		
//		Produto.quantidade_minima_estoque = 11;
//		System.out.println("Quantidade minima estoque: " + Produto.quantidade_minima_estoque);
		
		Produto produto2 = new Produto();
		produto2.nome = "carteira";

		System.out.println("Quantidade minima estoque: " + Produto.quantidade_minima_estoque);
		
		System.out.println("Produto 1: " + produto.nome);
		System.out.println("Produto 2: " + produto2.nome);
		
		Impressao.informacao("Produto 1: " + produto.nome);
		Impressao.informacao("Produto 2: " + produto2.nome);
	}

}
