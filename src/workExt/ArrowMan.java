package workExt;

public class ArrowMan extends Hero {
	
	public ArrowMan() {
		super();
	}

	public ArrowMan(String name, int level, double exp) {
		super(name, level, exp, new MoveRun(), new AttackArrow(), new DefendShield());
	}

}
