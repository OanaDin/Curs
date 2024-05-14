package C10.Observer;

//Observabil din diagrama
public interface ISubiect {
	void addObserver(IObserver observer);
	void removeObserver(IObserver observer);
	void notifyAll(String mesaj);
}
