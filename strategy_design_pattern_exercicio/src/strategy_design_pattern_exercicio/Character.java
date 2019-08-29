package strategy_design_pattern_exercicio;

public abstract class Character {
	
	WeaponBehavior weaponBehavior;
	
	public void setWeaponBehavior(WeaponBehavior wb) {
		this.weaponBehavior = wb;
	}
	
	public abstract void display();
}