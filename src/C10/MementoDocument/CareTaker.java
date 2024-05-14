package C10.MementoDocument;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CareTaker {
	private static Map<String, List<Memento>> versiuni = new HashMap<>();
	
	static void addMemento(String denumireFisier, Memento memento) {
		if(!versiuni.containsKey(denumireFisier)) {
			versiuni.put(denumireFisier, new ArrayList<>());
		}
		versiuni.get(denumireFisier).add(memento);
	}
	
	static Memento getMemento(String denumireFisier) {
		if(versiuni.containsKey(denumireFisier)) {
			int index = versiuni.get(denumireFisier).size();
			String continut=versiuni.get(denumireFisier).get(index-1).getContinut();
			int nrSemnaturi=versiuni.get(denumireFisier).get(index-1).getNrSemnaturi();
			Memento m = new Memento(continut,nrSemnaturi);
			versiuni.get(denumireFisier).remove(index-1);
			return m;
		}
		else
			return null;
	}

	public static void showMementos() {
		for(String denumireDocument: versiuni.keySet()) {
			System.out.println("-----"+denumireDocument+"-------");
			for(Memento memento:versiuni.get(denumireDocument)) {
				System.out.println(memento);
			}
		}
	}
	
}
