package metodoIntancia;


public class exercicioPOOComInstancia {

	public static void main(String[] args) {
		ProdutoInstancia produto = new ProdutoInstancia();
		produto.nome = "TV LCD 70'";
		produto.quantidade = 10;
		

		System.out.println("Necessario repor Estoque " + produto.nome + produto.reporEstoque());
	}
	

}
