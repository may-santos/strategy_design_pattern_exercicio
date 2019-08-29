package strategy_design_pattern_exercicio;

public class King extends Character{
	
	public King (WeaponBehavior wb){
		weaponBehavior = wb;
	}
	@Override
	public void display() {
		System.out.println("i'm a king");
		
	}

}
