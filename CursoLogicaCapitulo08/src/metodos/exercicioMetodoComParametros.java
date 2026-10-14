package metodos;

import java.util.Scanner;

public class exercicioMetodoComParametros {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		imprimirTraco();
		
		String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avançado"};
		
		imprimir("Escolha dentre os cursos abaixo: ");
		
		iterarEExibirPosicoesDoVetor(cursos);

		imprimirNaLinha("O curso que você deseja é o: ");
		Integer posicaoCursoEscolhido = scanner.nextInt();
		
		Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;  
//		tratativaComBoolean(posicaoCursoEscolhido, cursos);

		
		if (!posicaoValida) {
			tratativaErro();
		}
		
		imprimirTraco();
		
		String[] formasPagamento = new String[] {"Cartão", "Boleto"};
		
		imprimir("Escolha dentre as formas de pagamento abaixo: ");
		
		iterarEExibirPosicoesDoVetor(formasPagamento);

		imprimirNaLinha("Sua forma de pagamento escolhida é: ");
		Integer posicaoFormaPagamentoEscolhida = scanner.nextInt();
		
		posicaoValida = posicaoFormaPagamentoEscolhida >= 0 
				&& posicaoFormaPagamentoEscolhida < formasPagamento.length;  
//		tratativaComBoolean(posicaoCursoEscolhido, cursos);
		
		if (!posicaoValida) {
			tratativaErro();
		}
		
		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];
		
		imprimirTraco();
		
		imprimir("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida);
		
		scanner.close();
	}
	
	static void iterarEExibirPosicoesDoVetor(String[] vetor) {
		for(int i = 0; i < vetor.length; i++) {
			imprimir("[" + i + "] " + vetor[i]);
		}
	}
	
	static void imprimirTraco() {
		imprimir("----------------------------------------------");
	}
	
	static void tratativaErro() {
		imprimir("Posição inválida!");
		System.exit(1);
	}
	
	static void imprimir(String texto) {
		System.out.println(texto);
	}
	
	static void imprimirNaLinha(String texto) {
		System.out.print(texto);
	}
	
//	static void tratativaComBoolean(Integer tipo, String[] vetor) {
//		Boolean posicaoValida = tipo >= 0 && tipo < vetor.length;
//	}
	
	

}
