package bibliotecaPropria;

import console.Interacao;

public class bibliotecaPropriaMain {

	public static void main(String[] args) {
		Interacao interacao = new Interacao();
		
		Integer numero = interacao.lerNumero("Digite um número: ");
		interacao.imprimir("Número: " + numero);
		
		Double decimal = interacao.lerDecimal("Digite um número decimal: ");
		interacao.imprimir("Número decimal: " + decimal);
		
		interacao.erro("Essa é uma msg de Erro");
		
		interacao.fechar();
		
		
	}

}
