package C9.Memento;

import java.util.ArrayList;
import java.util.HashMap;

//clasa care taker din diagrama gof
public class ManagerContracte {
	private ArrayList<VersiuneContract> listaVersiuni = new ArrayList();
	//private HashMap<String, ArrayList<VersiuneContract>> listaVersiuniContracteMultiple;
	
	public void adaugaVersiune(VersiuneContract versiuneContract){
		this.listaVersiuni.add(versiuneContract);
	}
	
	public VersiuneContract recuperareVersiune(int i){
		return listaVersiuni.get(i);
	}
}
