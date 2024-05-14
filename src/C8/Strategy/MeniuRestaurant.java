package C8.Strategy;

import java.util.ArrayList;

//clasa context
public class MeniuRestaurant {
	private ArrayList<OfertaMeniu> listaMeniuri = new ArrayList();
	private IProcesabil strategieAlegere;
	
	public void addOfertaMeniu(OfertaMeniu ofertaMeniu){
		this.listaMeniuri.add(ofertaMeniu);
	}
	
	public void setStrategieAlegere(IProcesabil strategieAlegere){
		this.strategieAlegere = strategieAlegere;
	}
	
	public OfertaMeniu alegereOferta(){
		if(strategieAlegere != null){
			return strategieAlegere.alegereMeniu(listaMeniuri);
		}
		else
			throw new UnsupportedOperationException();
	}
}
