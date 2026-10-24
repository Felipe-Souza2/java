package metodoIntancia;

public class ProdutoInstancia {
static final Integer QUANTIDADE_MINIMA = 10;
	
	String nome;
	
	Double precoUnitario;
	
	Integer quantidade;
	
	Boolean reporEstoque() {
		if (quantidade < QUANTIDADE_MINIMA) return true;
		
		return false;
	}

}
