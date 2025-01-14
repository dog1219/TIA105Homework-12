package workExt;

public interface Defendtype {
	
	void defend();
	
}

class DefendShield implements Defendtype {

	@Override
	public void defend() {

		System.out.println("做防禦動作");

	}

}