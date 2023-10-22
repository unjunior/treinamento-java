package temasBasicos.interfaces.estabelecimento;

import temasBasicos.interfaces.equipamentos.copiadora.Copiadora;
import temasBasicos.interfaces.equipamentos.digitalizadora.Digitalizadora;
import temasBasicos.interfaces.equipamentos.impressora.Deskjet;
import temasBasicos.interfaces.equipamentos.impressora.Impressora;
import temasBasicos.interfaces.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {

	public static void main(String[] args) {

		/*
		Impressora impDesk = new Deskjet();
		Impressora impLaser = new Laserjet();
		Impressora multifuncional = new EquipamentoMultifuncional();
		impDesk.imprimir();
		impLaser.imprimir();
		multifuncional.imprimir();
		
		*/
		
		/*
		EquipamentoMultifuncional em = new EquipamentoMultifuncional();
		
		Impressora imp = em;
		Digitalizadora digi = em;
		Copiadora copi = em;
		
		imp.imprimir();
		digi.digitalizar();
		copi.copiar();
		*/
		
		
		EquipamentoMultifuncional em = new EquipamentoMultifuncional();
		Deskjet desk = new Deskjet();
		
		Impressora imp = desk;
		//Copiadora copi = desk; // erro porque deskjet só é impressora
	}

}
