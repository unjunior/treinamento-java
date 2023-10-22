package temasBasicos.encapusulamento.mensagens;

public class ComputadorJose {

	public static void main(String[] args) {

		// abrindo o MSN Messeger
		MsnMensager msn = new MsnMensager();
		
		msn.enviarMensagem();
		msn.receberMensagem();
	}

}
