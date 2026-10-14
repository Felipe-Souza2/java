package metodos;

import java.util.Scanner;

public class recebendoParametros {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		imprimirTraco();
		
		String[] cursos = new String[] {"Java EE", "Spring" , "Java OO Avançado"};
		System.out.println("Escolha dentre os cursos abaixo: ");
		
		iterarEExebirPosicaoVetor(cursos);
		
		System.out.print("O curso que voce quer é: ");
		Integer posicaoCursoEscolhido = scanner.nextInt();
		
		Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;
		
		if (!posicaoValida) {
			tratativaErro();
		}
		
		imprimirTraco();
		
		String[] formasPagamento = new String[] {"Cartão", "Boleto"};
		
		System.out.println("Escolha a forma de pagamento abaixo:");
		
		iterarEExebirPosicaoVetor(formasPagamento);
		
		System.out.print("A forma de pagamento que voce vai usar é: ");
		Integer posicaoPagamentoEscolhido = scanner.nextInt();
		
		posicaoValida = posicaoPagamentoEscolhido >= 0 &&posicaoPagamentoEscolhido < formasPagamento.length;
		
		if (!posicaoValida) {
			tratativaErro();
		}
		
		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String pagamentoEscolhido = formasPagamento[posicaoPagamentoEscolhido];
		
		imprimirTraco();
		
		System.out.println("O curso escolhido foi  " + cursoEscolhido + " e a forma de pagamento vai ser " + pagamentoEscolhido);
		
		scanner.close();
		
	}
	
	static void imprimirTraco() {
		System.out.println("________________________________");
	}
	
	static void tratativaErro() {
		System.err.println("Posiçåo Inválida!");
		System.exit(1);
		
	}
	
	static void iterarEExebirPosicaoVetor(String[] vetor) {
		for (int i = 0 ; i < vetor.length ; i++) {
			System.out.println("[" + i + "]" + vetor[i]);
		}


	}

}
