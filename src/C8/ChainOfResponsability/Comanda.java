package C8.ChainOfResponsability;

public class Comanda {
	private String produs;
	private int cantitate;
	//grad-ul il folosim pentru a decide care handler rezolva problema
	private int grad;
	
	public Comanda(String produs, int cantitate, int grad) {
		this.produs = produs;
		this.cantitate = cantitate;
		this.grad = grad;
	}

	public String getProdus() {
		return produs;
	}

	public int getCantitate() {
		return cantitate;
	}

	public int getGrad() {
		return grad;
	}
}
