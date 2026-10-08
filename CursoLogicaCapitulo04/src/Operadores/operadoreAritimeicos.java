package Operadores;

public class operadoreAritimeicos {
	public static void main(String[] args) {
		Integer adicao = 1 + 1;
		System.out.println("Adição:  " + adicao);
		
		Integer subtracao = 1 - 1;
		System.out.println("Subtração:  " + subtracao);
		
		Integer multiplicacao = 2 * 2;
		System.out.println("Multiplicação:  " + multiplicacao);
		
		Integer divisao = 4 / 2;
		System.out.println("Divisão:  " + divisao);
		
		Integer modulo = 57% 4;
		System.out.println("Modulo:  " + modulo);
		
		// Precedencia sera *(multiplicação) -> /(divisão) -> %(modulo) -> +(adição) -> -(subtração), caso nao aja (_)parenteses
		
		Integer procedecia01  = 1 + 1 * 5;
		System.out.println("Procedencia 01: " +  procedecia01);
		
		Integer procedecia02 = (1 + 1) * 5;
		System.out.println("Procedencia 02: " + procedecia02 );
		
		Integer procedecia03 =  5 * (1 + 1);
		System.out.println("Procedencia 03: " + procedecia03);
		
		Integer procedecia04 = 5 * ((1 + 1) + 2);
		System.out.println("Procedencia 04: " + procedecia04);
		
		Integer procedecia05 = 5 * (1 + 1) + 2;
		System.out.println("Procedencia 05: " + procedecia05);
		
		Integer dedos = 5;
		Integer mao = 1;
		
		Integer procedeciaComVariaveis  = dedos * (mao + mao );
		System.out.println("Procedencia com Variaveis: " + procedeciaComVariaveis);
		
	}
}
