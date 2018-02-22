package cours1_exercice;

public class Wizard extends Character {

	Spell spell;

	public Wizard(String nom,int vie,Spell spell) {
		super(nom, vie);
		this.spell = spell;
	}

	@Override
	public String attack(Character enemy) {
		return super.attack(enemy) + spell ;
	}

	@Override
	public String toString() {
		return super.toString() + " Wizard";
	}
}
