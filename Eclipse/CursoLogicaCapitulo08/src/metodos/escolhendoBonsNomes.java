package metodos;

import java.util.Scanner;

public class escolhendoBonsNomes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		imprimirTraco();
		
		String cursoEscolhido = receberInfoUsuario(scanner);
		
		imprimirTraco();
				
		String formaPagamentoEscolhida = receberInfoPagamentoUsuario(scanner);
		
		imprimirTraco();
		
		imprimir("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida);
		
		scanner.close();
	}
	
	static String receberInfoUsuario(Scanner scanner) {
		
		String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avançado"};
		
		imprimir("Escolha dentre os cursos abaixo: ");
		
		iterarEExibirPosicoesDoVetor(cursos);

		
		Integer posicaoCursoEscolhido = receberIndiceUsuario(cursos, "O curso que voce quer é: ", scanner);
		
		return cursos[posicaoCursoEscolhido];
	}
	
	static Integer receberIndiceUsuario(String[] vetor, String texto, Scanner scanner) {
		Integer posicaoEscolhida = receberNumeroUsuario(texto, scanner);
		
		Boolean posicaoValida =  verificarPosicaoEscolhida(posicaoEscolhida, vetor);

		if (!posicaoValida) {
			tratativaErro();
		}
		
		return posicaoEscolhida;
	}
	
	static String receberInfoPagamentoUsuario(Scanner scanner) {
		String[] formasPagamento = new String[] {"Cartão", "Boleto"};
		
		imprimir("Escolha dentre as formas de pagamento abaixo: ");
		
		iterarEExibirPosicoesDoVetor(formasPagamento);
		
		Integer posicaoFormaPagamentoEscolhida = receberIndiceUsuario(formasPagamento, "Sua forma de pagamento escolhida é: ", scanner);
		
		return formasPagamento[posicaoFormaPagamentoEscolhida];
		
	}
	
	static void iterarEExibirPosicoesDoVetor(String[] vetor) {
		iterarEExibirPosicoesDoVetorcom2Parametros(vetor, 0);
	}
	
	static void iterarEExibirPosicoesDoVetorcom2Parametros(String[] vetor, Integer i) {
		imprimir("[" + i + "] " + vetor[i]);
		
		if (++i < vetor.length) {
			iterarEExibirPosicoesDoVetorcom2Parametros(vetor, i);
		}
	}
	
	static void imprimirTraco() {
		imprimir("----------------------------------------------");
	}
	
	static Integer receberNumeroUsuario(String texto, Scanner scanner) {
		imprimirNaLinha(texto);
		Integer numeroEscolhida = scanner.nextInt();
		return numeroEscolhida;
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

	static Boolean verificarPosicaoEscolhida(Integer tipo, String[] vetor) {
		Boolean valida = tipo >= 0 && tipo < vetor.length;
		return valida;
	}
	
	

}
