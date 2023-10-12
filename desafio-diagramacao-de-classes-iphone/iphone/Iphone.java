package listas;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

	@Override
	public void tocarMusica() {
		System.out.println("tocou a musica");
	}
	
	@Override
	public void pausarMusica() {
		System.out.println("pausou a musica");
	}
	
	@Override
	public void selecionarMusica() {
		System.out.println("escolheu a musica");
	}

	@Override
	public void exibirPagina() {
		System.out.println("exibindo a pagina do navegador");
	}
	
	@Override
	public void adicionarNovaAba() {
		System.out.println("adicionando nova aba do navegador");
	}
	
	@Override
	public void atualizarPagina() {
		System.out.println("atualizando a pagina");
	}

	@Override
	public void ligar() {
		System.out.println("ligando para o contato x");
	}
	
	@Override
	public void atender() {
		System.out.println("atendeu o telefone");
	}
	
	@Override
	public void iniciarCorreioVoz() {
		System.out.println("iniciou o correio de voz");
	}

}
