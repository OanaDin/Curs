package C6.Decorator;

public class PizzaVegetariana extends APizza{

	@Override
	String getComponente() {
		return "blat, sos rosii, ciuperci, ceapa";
	}

	@Override
	int getPret() {
		return 27;
	}

}
