package TiposDeVariaveis;

import java.util.Scanner;

public class exercicioQuantidadeDeDesconto {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de produtos:  ");
		Double quantidadeProduto = scanner.nextDouble();
		
		System.out.print("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		Double subTotal = valorProduto * quantidadeProduto;
		
		Double total;
		
		if (quantidadeProduto > 10) {
			Double disconto =  subTotal *  0.1;
			total = subTotal - disconto;
		} else {
			total = subTotal; 
		}
		System.out.println("valor é de: " + total);
	}
}
