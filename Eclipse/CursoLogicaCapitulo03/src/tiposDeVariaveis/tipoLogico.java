package tiposDeVariaveis;

public class tipoLogico {
	public static void main(String[] args) {
		Boolean variavelVerdadeira = true;
		System.out.println("Variavel verdadeira:" + variavelVerdadeira);
		
		Boolean variavelFalsa = false;
		System.out.println("Variavel falsa:" + variavelFalsa);
		
		
		System.out.println("------------------------------");
		
		
		int idade = 17;
		Boolean podeDirigir = idade>= 18;
		
		
		if (podeDirigir) {
			System.out.println("Sim! Ele(a) pode .");
		} else {
			System.out.println("Não Ele(a) Não pode. ");
		}
		
		
	}
}
