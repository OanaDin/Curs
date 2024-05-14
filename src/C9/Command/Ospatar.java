package C9.Command;

import java.util.ArrayList;
import java.util.List;

public class Ospatar {
	private List<IComanda> listaComenzi;
	
	public Ospatar() {
		this.listaComenzi = new ArrayList<>();
	}
	
	//interactiune ospatar cu clientii
	public void preiaComanda(IComanda comanda) {
		this.listaComenzi.add(comanda);//comanda NU se trimite catre executie direct
	}
	
	//toate comenzile se trimit catre executie
	public void transmiteComenzile() {
		for(IComanda c: this.listaComenzi)
			c.prelucreaza();
		this.listaComenzi.clear();//de golit lista dupa aceea
	}
}
