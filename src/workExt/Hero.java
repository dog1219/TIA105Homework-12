package workExt;

public class Hero {
	// 省略 getter/setter...
	
	private String name;
	private int level;
	private double exp;
	private Move move;
	private Attack attack;
	private Defend defend;
	
	public Hero() {
		this("David", 1, 0);
	}
	
	public Hero(String name, int level, double exp) {
		this.name = name;
		this.level = level;
		this.exp = exp;
	}
	
	public Hero(String name, int level, double exp, Move move, Attack attack, Defend defend) {
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

interface Attack {
	 void attack();
}

interface Defend {
	void defend();
}

interface Move {
	void move();
}
