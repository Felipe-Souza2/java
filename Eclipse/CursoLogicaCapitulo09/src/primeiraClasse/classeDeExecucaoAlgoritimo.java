package primeiraClasse;

public class classeDeExecucaoAlgoritimo {

	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.nome = "Smartphone";
		produto.precoUnitario = 1500.0;
		produto.quantidade = 100;
		
		quantidadeEmEstoque(produto);

	}
	
	static void quantidadeEmEstoque(Produto produto) {
		System.out.println("quantidade de " + produto.nome + " em estoque é " + produto.quantidade);
	}

}
