package C10.Observer;

public class Program {

	public static void main(String[] args) {
		//observatori
		IObserver client1 = new Client("Florin");
		IObserver client2 = new Client("Florinel");
		IObserver client3 = new Client("Floricica");

		//observabil
		Restaurant restaurant = new Restaurant("Pizzeria ASE");
		//abonare observatori la observabil/subiect
		restaurant.addObserver(client1);
		restaurant.addObserver(client2);
		restaurant.addObserver(client3);
		
		restaurant.addMeniu("Pizza vegetariana. 23 lei");
		restaurant.removeObserver(client1);
		restaurant.reducerePretMeniu("Pizza vegetariana", 20);
	}

}
