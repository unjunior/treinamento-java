package temasBasicos.heranca;

public class ComputadorUsuario {

	public static void main(String[] args) {

		MsnMesseger msn = new MsnMesseger();
		msn.enviarMensagem();
		msn.receberMensagem();
		System.out.println();
		
		FacebookMesseger face = new FacebookMesseger();
		face.enviarMensagem();
		face.receberMensagem();
		System.out.println();
		
		Telegram telegram = new Telegram();
		telegram.enviarMensagem();
		telegram.receberMensagem();
	}

}
