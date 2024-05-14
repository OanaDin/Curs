package C8.ChainOfResponsability;

public class Bucatar2 extends AHandler{

	@Override
	void procesareComanda(Comanda comanda) {
		if(comanda.getGrad()>5 && comanda.getGrad()<=50) {
			System.out.println("Bucatar a preparat "+comanda.getProdus());
		} else {
			if(comanda.getGrad()<=5) {
				System.out.println("Bucatar nu se ocupa de ce face ospatarul");
			} else {
				System.out.println("Bucatarul nu poate prepara");
				if(this.getNextHandler()!=null) {
					this.getNextHandler().procesareComanda(comanda);
				} else {
				System.out.println("Este responsabilitate prea mare pentru bucatar "+comanda.getProdus());
				}
			}
		}
	}

}
