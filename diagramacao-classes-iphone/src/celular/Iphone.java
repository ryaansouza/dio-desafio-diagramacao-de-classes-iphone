package celular;

import funcionalidades.Internet;
import funcionalidades.Ipod;
import funcionalidades.Phone;

public class Iphone implements Ipod, Phone, Internet{

	public void tocar() {
		System.out.println("Tocando");
	}

	public void pausar() {
		System.out.println("Em Pause");
	}

	public void selecionarMusica() {	
		System.out.println("Selecionando Musica");
	}

	public void ligar() {
		System.out.println("Ligando");
	}

	public void atender() {
		System.out.println("Atendeu");
	}

	public void iniciarCorreioVoz() {
		System.out.println("Iniciando Correio de Voz");
	}

	public void exibirPagina() {
		System.out.println("Exibindo Pagina");
	}

	public void adicionarNovaAba() {
		System.out.println("Adicionando nova  Aba");
	}

	public void atualizarPagina() {
		System.out.println("Pagina Atualizando");
	}
	
}