package garageP;

public class SiegeChauffant implements Option{
	

	@Override
	public double getPrix() {
		return 562.9;
	}

	@Override
	public String toString() {
		return "SiegeChauffant " + getPrix();
	}
	
	

}
