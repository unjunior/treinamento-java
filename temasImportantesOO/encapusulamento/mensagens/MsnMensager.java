package temasBasicos.encapusulamento.mensagens;

public class MsnMensager {

	public void enviarMensagem() {
		validarConexaoInternet();
		System.out.println("Enviando mensagem");
	}
	
	public void receberMensagem() {
		System.out.println("Recebendo mensagem");
		salvarHistoricoMensagem();
	}
	
	private void validarConexaoInternet() {
		System.out.println("Validando se está conectado com a internet");
	}
	
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando histórico da mensagem");
	}
}
