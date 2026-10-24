package bibliotecaEmail;

import org.apache.commons.mail2.core.EmailException;

public class usandoBibliotecaDeEmail {
	public static void main(String[] args) throws EmailException {
		Carteiro.enviar("fejobs9@gmail.com",
				"Aula sobre biblioteca de terceiros",
				"Se estiver vendo isso é que esta funcionando");
		
		System.out.println("Fim...");
		
	}
}
 