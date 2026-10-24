package bibliotecaPropria;

import console.Interacao;

public class exercicioCalcularTroco {

	public static void main(String[] args) {
		
		Interacao interacao = new Interacao();
		
		Double valorProduto = interacao.lerDecimal("Digite o valor do produto: ");
		
		Double valorPassadoPeloCliente = interacao.lerDecimal("Digite a quantidade passada pelo cliente: ");
		
		Double resultado =   valorProduto - valorPassadoPeloCliente;
		
		interacao.imprimir("troco:" + resultado);
		
		interacao.fechar();
	
	}
}
