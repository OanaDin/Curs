package C10.MementoDocument;

public class Memento {
	private String continut;
	private int nrSemnaturi;
	
	public Memento(String continut, int nrSemnaturi) {
		this.continut = continut;
		this.nrSemnaturi = nrSemnaturi;
	}

	public String getContinut() {
		return continut;
	}

	public int getNrSemnaturi() {
		return nrSemnaturi;
	}

	@Override
	public String toString() {
		return "Memento [continut=" + continut + ", nrSemnaturi=" + nrSemnaturi + "]";
	}
	
	
}
