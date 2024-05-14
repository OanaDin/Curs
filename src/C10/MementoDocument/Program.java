package C10.MementoDocument;

public class Program {

	public static void main(String[] args) {
		Document document = new Document("test.txt");
		Document document2 = new Document("cts.txt");
		document.setNrSemnaturi(2);
		document.setContinut("continut nou");
		document.setNrSemnaturi(2);
		document2.setContinut("inceput");
		document2.setContinut("al doilea continut");
		document2.setContinut("inceput");
		document2.setNrSemnaturi(3);
		
		CareTaker.showMementos();
		System.out.println(document);
		document.ctrlZ();
		System.out.println(document);
		CareTaker.showMementos();
		
	}

}
