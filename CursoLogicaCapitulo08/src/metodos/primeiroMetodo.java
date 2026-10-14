package metodos;

import java.util.Scanner;

public class primeiroMetodo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		imprimirTraco();
		
		String[] cursos = new String[] {"Java EE", "Spring" , "Java OO Avançado"};
		System.out.println("Escolha dentre os cursos abaixo: ");
		
		for (int i = 0; i < cursos.length; i++) {
			System.out.println("[" + i + "]" + cursos[i]);
		}
		
		System.out.print("O curso que voce quer é: ");
		Integer posicaoCursoEscolhido = scanner.nextInt();
		
		Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;
		
		if (!posicaoValida) {
			System.err.println("Posiçåo Inválida!");
			System.exit(1);
		}
		
		imprimirTraco();
		
		String[] formasPagamento = new String[] {"Cartão", "Boleto"};
		
		System.out.println("Escolha a forma de pagamento abaixo:");
		for (int i = 0 ; i < formasPagamento.length ; i++) {
			System.out.println("[" + i + "]" + formasPagamento[i]);
		}
		
		System.out.print("A forma de pagamento que voce vai usar é: ");
		Integer posicaoPagamentoEscolhido = scanner.nextInt();
		
		posicaoValida = posicaoPagamentoEscolhido >= 0 &&posicaoPagamentoEscolhido < formasPagamento.length;
		
		if (!posicaoValida) {
			System.err.println("Posiçåo Inválida!");
			System.exit(1);
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

}
