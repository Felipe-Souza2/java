package metodos;

import java.util.Scanner;

public class retornandoValores {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
		
		imprimirTraco();
		
		String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avançado"};
		
		imprimir("Escolha dentre os cursos abaixo: ");
		
		iterarEExibirPosicoesDoVetor(cursos);

		
		Integer posicaoCursoEscolhido = receberNumeroUsuario(null, scanner);
		
		Boolean posicaoValida =  tratativaComBoolean(posicaoCursoEscolhido, cursos);

		if (!posicaoValida) {
			tratativaErro();
		}
		
		imprimirTraco();
		
		String[] formasPagamento = new String[] {"Cartão", "Boleto"};
		
		imprimir("Escolha dentre as formas de pagamento abaixo: ");
		
		iterarEExibirPosicoesDoVetor(formasPagamento);

		
		Integer posicaoFormaPagamentoEscolhida = receberNumeroUsuario("Sua forma de pagamento escolhida é: ", scanner);
		
		posicaoValida = tratativaComBoolean(posicaoFormaPagamentoEscolhida, formasPagamento);  

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

	static Boolean tratativaComBoolean(Integer tipo, String[] vetor) {
		Boolean valida = tipo >= 0 && tipo < vetor.length;
		return valida;
	}
	
	static Integer receberNumeroUsuario(String texto, Scanner scanner) {
		imprimirNaLinha(texto);
		Integer numeroEscolhida = scanner.nextInt();
		return numeroEscolhida;
	}
}
