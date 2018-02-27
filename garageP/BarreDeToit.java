package garageP;

import java.io.Serializable;

public class BarreDeToit implements Option, Serializable{

	@Override
	public double getPrix() {
		return 29.9;
	}

	@Override
	public String toString() {
		return "BarreDeToit " + getPrix();
	}

}
