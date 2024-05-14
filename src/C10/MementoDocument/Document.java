package C10.MementoDocument;

public class Document {
	
	private String denumireFisier;
	private String continut;
	private int nrSemnaturi;
	
	public Document(String denumireFisier) {
		this.denumireFisier = denumireFisier;
	}
	
	public void setContinut(String continut) {
		if(continut != this.continut) {
			//generare memento
			Memento memento = new Memento(this.continut, this.nrSemnaturi);
			this.continut = continut;
			CareTaker.addMemento(this.denumireFisier, memento);
		}
	}
	
	public void setNrSemnaturi(int nrSemnaturi) {
		if(nrSemnaturi != this.nrSemnaturi) {
			Memento memento = new Memento(this.continut,this.nrSemnaturi);
			this.nrSemnaturi=nrSemnaturi;
			CareTaker.addMemento(this.denumireFisier, memento);
		}
	}
	
	//preluare memento din careTaker
	public void ctrlZ() {
		Memento memento = CareTaker.getMemento(this.denumireFisier);
		if(memento!=null) {
			//restaurare stare this pe baza de memento
			this.continut = memento.getContinut();
			this.nrSemnaturi=memento.getNrSemnaturi();
		}
	}

	@Override
	public String toString() {
		return "Document [denumireFisier=" + denumireFisier + ", continut=" + continut + ", nrSemnaturi=" + nrSemnaturi
				+ "]";
	}
}
