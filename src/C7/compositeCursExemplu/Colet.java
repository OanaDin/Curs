package C7.compositeCursExemplu;

public class Colet implements INod{
	private boolean fragil;
	private int greutate;
	

	public Colet(boolean fragil, int greutate) {
		super();
		this.fragil = fragil;
		this.greutate = greutate;
	}

	@Override
	public boolean esteFragil() {
		// TODO Auto-generated method stub
		return this.fragil;
	}

	@Override
	public int getGreutate() {
		// TODO Auto-generated method stub
		return this.greutate;
	}

	@Override
	public void addNod(INod nod) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
		
	}

	@Override
	public void removeNod(int index) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
		
	}

	@Override
	public INod getNod(int index) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}
	
	
	

}
