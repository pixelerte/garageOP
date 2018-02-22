package garageP;

public class Moteur {
	protected TypeMoteur type;
	private String cylindre;
	private double prix;
	
	
	public Moteur(String cylindre, double prix) {
		this.prix = prix;
		this.cylindre = cylindre;
		
		
		
	}
	
	public String toString(){
		return "Moteur " + type + " " + cylindre + " " + prix + "€";
		
	}

	
	
	
	public double getPrix() {
		return prix;
	}
	

}
