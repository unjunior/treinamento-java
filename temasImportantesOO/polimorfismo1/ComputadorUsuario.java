package temasBasicos.polimorfismo1;

import temasBasicos.polimorfismo1.apps.FacebookMesseger;
import temasBasicos.polimorfismo1.apps.MsnMesseger;
import temasBasicos.polimorfismo1.apps.ServicoMensagemInstantanea;
import temasBasicos.polimorfismo1.apps.Telegram;

public class ComputadorUsuario {

	public static void main(String[] args) {
		
		ServicoMensagemInstantanea srv = null;  
		/* 
		 Não se sabe qual app - o mais generico recebe null
		 Mas qualquer um deverá enviar e receber mensagem
		*/
		
		String appEscolhido = "telegram";
		
		if(appEscolhido.equals("msn")) {
			srv = new MsnMesseger();
		}
		else if (appEscolhido.equals("face")) {
			srv = new FacebookMesseger();
		}
		
		else if(appEscolhido.equals("telegram")) {
			srv = new Telegram();
		}
		
		srv.enviarMensagem();
		srv.receberMensagem();
		
	
		
	}
}