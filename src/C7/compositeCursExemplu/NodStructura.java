package C7.compositeCursExemplu;

import java.util.ArrayList;
import java.util.List;

public class NodStructura implements INod{
	private int greutateStructura;
	private List<INod> listaFii;
	
	
	

	public NodStructura(int greutateStructura) {
		super();
		this.greutateStructura = greutateStructura;
		this.listaFii=new ArrayList<INod>();
	}

	@Override
	public boolean esteFragil() {
		// TODO Auto-generated method stub
		for(INod nod:this.listaFii) {
			if(nod.esteFragil()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int getGreutate() {
		// TODO Auto-generated method stub
		int greutate=this.greutateStructura;
		
		for(INod nod:this.listaFii) {
			greutate+=nod.getGreutate();
		}
		
		return greutate;
	}

	@Override
	public void addNod(INod nod) {
		// TODO Auto-generated method stub
		if(nod!=null) {
			this.listaFii.add(nod);
		}
		
	}

	@Override
	public void removeNod(int index) {
		// TODO Auto-generated method stub
		if(index>=0&&index<this.listaFii.size()) {
			this.listaFii.remove(index);
		}
		
	}

	@Override
	public INod getNod(int index) {
		// TODO Auto-generated method stub
		if(index>=0&&index<this.listaFii.size()) {
			return this.listaFii.get(index);
		}
		return null;
	}

}
