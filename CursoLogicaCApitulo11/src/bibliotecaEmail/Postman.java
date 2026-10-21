package bibliotecaEmail;

import org.apache.commons.mail2.core.EmailException;
import org.apache.commons.mail2.javax.DefaultAuthenticator;
import org.apache.commons.mail2.javax.Email;
import org.apache.commons.mail2.javax.SimpleEmail;

public class Postman {
	
	static void listaTarefas(String para, String assunto, String mensagem) throws EmailException {
		String usuario = "seu gmaa@gmail.com";
		String senhaDeApp = "sua senha app";
		
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator(usuario, senhaDeApp));
		email.setSSLOnConnect(true);
		email.setFrom(usuario);
		email.setSubject(assunto);
		email.setMsg(mensagem);
		email.addTo(para);
		email.send();
		
	}
		

}
