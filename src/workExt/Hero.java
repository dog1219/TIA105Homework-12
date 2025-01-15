package workExt;

@SuppressWarnings("unused")
public class Hero {
	// 省略 getter/setter...
	
	private String name;
	private int level;
	private double exp;
	private Movetype move;
	private Attacktype attack;
	private Defendtype defend;
	
	public Hero() {
		this("David", 1, 0);
	}
	
	public Hero(String name, int level, double exp) {
		this.name = name;
		this.level = level;
		this.exp = exp;
	}
	
	public Hero(String name, int level, double exp, Movetype move, Attacktype attack, Defendtype defend) {
		this.name = name;
		this.level = level;
		this.exp = exp;
		this.move = move;
		this.attack = attack;
		this.defend = defend;
	}
	
	public void attack() {
		attack.attack();
	};
	
	public void move() {
		move.move();
	};
	
	public void defend() {
		defend.defend();
	};
}

class ArrowMan extends Hero {
	
	public ArrowMan() {
		super();
	}

	public ArrowMan(String name, int level, double exp) {
		super(name, level, exp, new MoveRun(), new AttackArrow(), new DefendShield());
	}

}

class SwordMan extends Hero {
	
	public SwordMan() {
		super();
	}
	
	public SwordMan(String name, int level, double exp) {
		super(name, level, exp, new MoveRun(), new AttackSwordMan(), new DefendShield());
	}
	
}