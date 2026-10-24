package estruturaDeDecisao;

import java.util.Scanner;

public class utilizandoIfEncadeado {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o peso: ");
		Double peso = scanner.nextDouble();
		
		Boolean pesoLeve = (peso <= 60) && (peso > 30);
		Boolean pesoMedio = (peso >= 60) && (peso < 90);
		Boolean pesoPesado = peso >= 90;
		
		if (pesoLeve) {
			System.out.println("A categoria doo lutador(a) é peso Leve ");
		} else if (pesoMedio) {
			System.out.println("A categoria doo lutador(a) é peso Médio ");
		} else if (pesoPesado) {
			System.out.println("A categoria doo lutador(a) é peso Pesado ");	
		} else {
			System.out.println("Olutador(a) não esta em nenhuma categoria!");
		}
		scanner.close();

	}

}
