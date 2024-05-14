package C9.Memento;


//originator din diagrama
public class Contract {
	private String clauzeContractuale;//se modifica de-a lungul procesului de negociere
	
	private String numeClient;//nu se modifica
	
	public Contract(String numeClient) {
		this.numeClient = numeClient;
		this.clauzeContractuale = "";
	}
	
	public void adaugaClauzeContractuale(String clauza){
		this.clauzeContractuale += ", " + clauza;
	}
	
	@Override
	public String toString() {
		return "Contract [clauzeContractuale=" + clauzeContractuale
				+ ", numeClient=" + numeClient + "]";
	}
	
	//restore from a Memento
	public void refacereVersiuneContractAnterior
	(VersiuneContract versiuneContract){
		this.clauzeContractuale = versiuneContract.getClauzeContractuale();
	}
	
	//store into a Memento
	public VersiuneContract salvare(){
		System.out.println("Salvare versiune contract");
		return new VersiuneContract(clauzeContractuale);
	}
}
