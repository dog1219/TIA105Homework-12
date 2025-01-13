package workExt;

public class SwordMan extends Hero {
	
	public SwordMan() {
		super();
	}
	
	public SwordMan(String name, int level, double exp) {
		super(name, level, exp, new MoveRun(), new AttackSwordMan(), new DefendShield());
	}
	
}
