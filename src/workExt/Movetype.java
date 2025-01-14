package workExt;

public interface Movetype {
	
	void move();
	
}

class MoveRun implements Movetype {

	@Override
	public void move() {

		System.out.println("跑步");

	}

}
