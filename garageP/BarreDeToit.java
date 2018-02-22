package garageP;

public class BarreDeToit implements Option{

	@Override
	public double getPrix() {
		return 29.9;
	}

	@Override
	public String toString() {
		return "BarreDeToit " + getPrix();
	}

}
