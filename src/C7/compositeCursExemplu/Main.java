package C7.compositeCursExemplu;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		INod nodContainer=new NodStructura(100);
		INod nodCutie1=new NodStructura(10);
		INod nodCutie2=new NodStructura(20);
		//INod nodCutie3=new NodStructura(15);
		
		nodContainer.addNod(nodCutie1);
		nodContainer.addNod(nodCutie2);
		//nodContainer.addNod(nodCutie3);
		
		nodCutie1.addNod(new Colet(true,4));
		nodCutie1.addNod(new Colet(false,3));
		nodCutie2.addNod(new Colet(false,6));
		
		System.out.println(nodContainer.esteFragil());
		System.out.println(nodContainer.getGreutate());

	}

}
