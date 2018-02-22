package cours1_exercice;

public class Warrior extends Character {

	// � completer
	Weapon weapon;
	
	
	public Warrior(String nom,int vie,Weapon weapon) {
		super(nom, vie);
		this.weapon = weapon;
		
	}

	@Override
	public String attack(Character enemy) {
		return super.attack(enemy) + weapon ;
		
	}

	@Override
	public String toString() {
		return super.toString() + " warrior";
	}
}
