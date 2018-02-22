package garageP;

public class Climatisation implements Option{

	@Override
	public double getPrix() {
		return 347.3;
	}

	@Override
	public String toString() {
		return "Climatisation " + getPrix();
	}
	
	

}
