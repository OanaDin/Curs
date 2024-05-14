package C8.ChainOfResponsability;

public class Program {

	public static void main(String[] args) {
		AHandler ospatar = new Ospatar();
		AHandler bucatar = new Bucatar2();
		AHandler bucatarSef = new BucatarSef();
		
		//lant de responsabili
		ospatar.setNextHandler(bucatar);
		bucatar.setNextHandler(bucatarSef);
		
		Comanda comanda1 = new Comanda("Pizza", 2, 15);
		Comanda comanda2 = new Comanda("Bautura", 1, 3);
		Comanda comanda3 = new Comanda("Pizza trufe", 1, 400);
		
		System.out.println("COMANDA 1");
		ospatar.procesareComanda(comanda1);
		
		System.out.println("\nCOMANDA 2");
		ospatar.procesareComanda(comanda2);
		
		System.out.println("\nCOMANDA 3");
		ospatar.procesareComanda(comanda3);
		
		System.out.println("\nCOMANDA 2 TRIMISA LA BUCATAR SEF");
		//aceasta implementare permite, din pacate, si urmatorul context
		bucatarSef.procesareComanda(comanda2);
		
		System.out.println("\nCOMANDA 2 TRIMISA LA BUCATAR");
		//avem restrictii care nu permit ca bucatar sa realizeze treaba ospatar
		bucatar.procesareComanda(comanda2);
	}

}
