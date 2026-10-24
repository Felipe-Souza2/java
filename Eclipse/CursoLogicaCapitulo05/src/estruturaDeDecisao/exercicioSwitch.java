package estruturaDeDecisao;

import java.util.Scanner;

public class exercicioSwitch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um dia da semana: ");
		Integer diaDaSemana = scanner.nextInt();
		
		switch (diaDaSemana) {
		case 1 : System.out.println("Hoje é Domingo");
			break;
		case 2 : System.out.println("Hoje é Segunda-feira");
			break;
		case 3 : System.out.println(" Hoje é Terça-feira");
			break;
		case 4 : System.out.println("Hoje é Quarta-feira");
			break;
		case 5 : System.out.println("Hoje é Quinta-feira");
			break;
		case 6 : System.out.println("Hoje é Sexta-feira");
			break;
		case 7 : System.out.println("Hoje é Sabado");
			break;
		default : System.err.println("Digite um dia da semana válido!");
			System.exit(1);
		}
		
		
		scanner.close();
	}

}
