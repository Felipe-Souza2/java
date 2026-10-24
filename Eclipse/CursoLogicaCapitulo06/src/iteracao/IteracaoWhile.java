package iteracao;

public class IteracaoWhile {

	public static void main(String[] args) {
//		int i = 0;
//		while (i < 10) {
//			System.out.println(i + " :texto qualquer");
//			i++;
//		}
		
//		int i = 0;
//		while (i < 10) {
//			
//			if (i == 5) {
//				System.out.println("vai parar!");
//				break;
//			}
//			System.out.println(i + " :texto qualquer");
//			i++;
//		}

		int i = 0;
		while (i < 10) {
			
			if (i == 5) {
				System.out.println("vai continuar!");
				i++;                        //sempre por um encremento dentro do if para evitar loops infinitos
				continue;
			}
			System.out.println(i + " :texto qualquer");
			i++;
		}

	}

}
