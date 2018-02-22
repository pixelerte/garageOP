package garageP;

import java.util.ArrayList;
import java.util.List;


public class Garage {
	
	private List<Vehicule> voitures;

	public Garage() {
		
		voitures = new ArrayList<>();
		
	}
	
	public void addVoiture(Vehicule vehicule) {
		voitures.add(vehicule);
	}
	@Override
	public String toString() {
		String resulta;
		resulta = "";
		
		for (int i = 0; i < voitures.size(); i++) {
			
			resulta += voitures.get(i) + "\n";
		
			
			
		}
		return resulta;
	}
	
	
	
	
	
	
	

}
