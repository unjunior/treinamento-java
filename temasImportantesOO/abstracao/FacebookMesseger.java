package temasBasicos.abstracao;

public class FacebookMesseger extends ServicoMensagemInstantanea{
	
	@Override
	public void enviarMensagem() {
		System.out.println("Enviando mensagem pelo Facebook Messeger");
		
	}
	
	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook Messeger");
		
	}
}
