package garageP;

public class GPS implements Option{

	@Override
	public double getPrix() {
		return 113.5;
	}

	@Override
	public String toString() {
		return "GPS " + getPrix();
	}

}
