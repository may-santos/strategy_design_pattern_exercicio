package strategy_design_pattern_exercicio;

public class Troll extends Character {
	public Troll (WeaponBehavior wb){
		weaponBehavior = wb;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("i'm a queen");
	}

}
