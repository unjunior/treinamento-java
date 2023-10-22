package temasBasicos.interfaces.equipamentos.multifuncional;

import temasBasicos.interfaces.equipamentos.copiadora.Copiadora;
import temasBasicos.interfaces.equipamentos.digitalizadora.Digitalizadora;
import temasBasicos.interfaces.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora{

	@Override
	public void copiar() {
		System.out.println("COPIANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
		
	}
	
	@Override
	public void imprimir() {
		System.out.println("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCIONAL");
		
	}

	@Override
	public void digitalizar() {
		System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
		
	}
}
