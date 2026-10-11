package estruturaDeDecisao;

public class estruturaIf {

	public static void main(String[] args) {
		Double emprestimo = 4000.0;
		Double movimentacaoMedia = 2000.0;
		
		Boolean movimentaPeloMenosMetadeDoValor = (movimentacaoMedia * 2) >= emprestimo;
		Boolean aContaTemTempoSuficienteDeAbertura = true;
		Boolean temNomeLimpo = true;
		
		Boolean liberarEmprestimo = movimentaPeloMenosMetadeDoValor && aContaTemTempoSuficienteDeAbertura && temNomeLimpo;
		
		
		if (liberarEmprestimo) {
			System.out.println("Sim! Pode  liberar o Empréstimo.");
		} else {
			System.out.println("Não pode Liberar o Empréstimo ");
		}
	}

}
