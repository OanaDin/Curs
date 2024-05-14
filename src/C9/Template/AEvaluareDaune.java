package C9.Template;

public abstract class AEvaluareDaune {
	abstract void identificareDauna();
	abstract void evaluareInitialaDauna();
	
	final void  trimitereEvaluareManager() {
		System.out.println("Trimitere evaluare daune spre manager");
	}
	
	//metoda FINAL ce implica succesiunea de pasi
	public final void proceduraEvaluareDaune(){
		identificareDauna();
		evaluareInitialaDauna();
		trimitereEvaluareManager();
	}
}
