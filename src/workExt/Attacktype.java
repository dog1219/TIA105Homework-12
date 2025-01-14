package workExt;

public interface Attacktype {

	void attack();
	
}

class AttackArrow implements Attacktype {

	@Override
	public void attack() {

		System.out.println("放弓箭");

	}

}

class AttackSwordMan implements Attacktype {

	@Override
	public void attack() {
		
		System.out.println("揮劍");

	}

}