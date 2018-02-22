package garageP;

public class VitreElectrique implements Option{

	@Override
	public double getPrix() {
		return 212.35;
	}

	@Override
	public String toString() {
		return "VitreElectrique " + getPrix();
	}
	
	
	
	
	
	

}
