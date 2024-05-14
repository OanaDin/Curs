package C8.ChainOfResponsability;

public class BucatarSef extends AHandler{

	@Override
	void procesareComanda(Comanda comanda) {
		System.out.println("Bucatarul sef a preparat "+comanda.getProdus());
	}

}
