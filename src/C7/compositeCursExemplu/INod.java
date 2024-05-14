package C7.compositeCursExemplu;

public interface INod {
	
	//zona comuna
	int getGreutate();
	boolean esteFragil();
	
	//zona structura
	void addNod(INod nod);
	void removeNod(int index);
    INod getNod(int index);
	
	

}
