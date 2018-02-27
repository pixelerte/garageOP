package garageP;

import java.io.Serializable;

public class VitreElectrique implements Option, Serializable{

	@Override
	public double getPrix() {
		return 212.35;
	}

	@Override
	public String toString() {
		return "VitreElectrique " + getPrix();
	}
	
	
	
	
	
	

}
