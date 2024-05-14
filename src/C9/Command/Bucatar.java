package C9.Command;

public class Bucatar {
	private String numeBucatar;

	public Bucatar(String numeBucatar) {
		super();
		this.numeBucatar = numeBucatar;
	}
	
	//in functie de nr de tipuri de comenzi, atatea actiuni in bucatar
	public void preparaPizza(String pizza, String tipBlat) {
		System.out.println("Bucatarul " + this.numeBucatar + 
				" a pregatit pizza: " +pizza + " cu blat: " + tipBlat);
	}
	
	public void preparaPaste(String paste) {
		System.out.println("Bucatarul " + this.numeBucatar + 
				" a pregatit paste: " +paste);
	}
}
