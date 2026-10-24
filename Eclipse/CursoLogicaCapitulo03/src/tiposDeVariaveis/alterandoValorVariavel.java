package tiposDeVariaveis;

import java.util.Scanner;

public class alterandoValorVariavel {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o valor do produto:  ");
		Double valorDoProduto = scanner.nextDouble();
		
		System.out.print("Digite o tipo de pagamento[1 = á vista /  2 = á prazo]:   ");
		Integer tipoDePagamento = scanner.nextInt();
		
		Boolean PagamentoAVista = tipoDePagamento.equals(1);
		
		Double juros = 0.0;
		if (!PagamentoAVista) {
			juros = 10.0;
		} 		
		Double acrescimo = valorDoProduto * juros / 100;
		Double valorTotal = acrescimo + valorDoProduto;
		System.out.println("Valor total: " + valorTotal);
		
		
		
		scanner.close();
	}
}
