package C7.Adapter;

public class EvaluareClientFirmaB implements IEvaluareClientFirmaB{

	@Override
	public void analizaClientFirmaB(Client client) {
		System.out.println("Metoda analiza client Firma B");
		double procentDiscount = (client.getNrEvenimente()*0.01);
		System.out.println("S-a oferit un discount de "+ 
				procentDiscount);
		
	}

}
