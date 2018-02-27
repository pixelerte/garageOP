package garageP;

import java.io.Serializable;

public class SiegeChauffant implements Option, Serializable{
	

	@Override
	public double getPrix() {
		return 562.9;
	}

	@Override
	public String toString() {
		return "SiegeChauffant " + getPrix();
	}
	
	

}
