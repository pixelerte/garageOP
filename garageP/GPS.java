package garageP;

import java.io.Serializable;

public class GPS implements Option, Serializable{

	@Override
	public double getPrix() {
		return 113.5;
	}

	@Override
	public String toString() {
		return "GPS " + getPrix();
	}

}
