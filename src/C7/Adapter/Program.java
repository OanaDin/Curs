package C7.Adapter;

public class Program {

	public static void main(String[] args) {
		
		//FIRMA A
		System.out.println("FIRMA A");
		IEvaluareClientFirmaA evA= new EvaluareClientFirmaA();
		evA.analizaClientFirmaA(2500);
		
		//FIRMA B
		System.out.println("FIRMA B");
		int[] costEvenimente = new int[]{1000,2000,20000,1000,5000};
		Client client = new Client("XYZ", 5, costEvenimente);
		IEvaluareClientFirmaB evB= new EvaluareClientFirmaB();
		evB.analizaClientFirmaB(client);
		
		//FIRMA B ESTE CUMPARATA DE FIRMA A
		System.out.println("FIRMA B DUPA FUZIUNE");
		IEvaluareClientFirmaB evaluareClientB = new AdaptorEvaluareClient();
		evaluareClientB.analizaClientFirmaB(client);

	}

}
