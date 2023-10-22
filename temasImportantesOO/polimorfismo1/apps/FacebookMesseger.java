package temasBasicos.polimorfismo1.apps;

public class FacebookMesseger extends ServicoMensagemInstantanea{
	
	@Override
	public void enviarMensagem() {
		validarConexaoInternet();
		System.out.println("Enviando mensagem pelo Facebook Messeger");
		
	}
	
	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook Messeger");
		
	}
}
