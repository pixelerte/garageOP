package garageP;

public class MoteurElectrique extends Moteur{

	public MoteurElectrique(String cylindre, double prix) {
		super(cylindre, prix);
		this.type = TypeMoteur.ELECTRIQUE;
	}

}
