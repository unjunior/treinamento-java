package temasBasicos.abstracao;

public class MsnMesseger extends ServicoMensagemInstantanea{

	@Override
	public void enviarMensagem() {
		System.out.println("Enviando mensagem pelo MSN Messeger");
		
	}
	
	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo MSN Messeger");
		
	}
}
