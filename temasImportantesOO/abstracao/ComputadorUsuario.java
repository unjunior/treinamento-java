package temasBasicos.abstracao;

public class ComputadorUsuario {

	public static void main(String[] args) {

		MsnMesseger msn = new MsnMesseger();
		System.out.println("MSN");
		msn.enviarMensagem();
		msn.receberMensagem();
		System.out.println();
		
		System.out.println("FACEBOOK");
		FacebookMesseger face = new FacebookMesseger();
		face.enviarMensagem();
		face.receberMensagem();
		System.out.println();
		
		System.out.println("TELEGRAM");
		Telegram telegram = new Telegram();
		telegram.enviarMensagem();
		telegram.receberMensagem();

	}

}
