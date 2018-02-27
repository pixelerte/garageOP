package garageP;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Garage {

	private List<Vehicule> voitures;

	public Garage() {

		voitures = new ArrayList<>();
		load();
	}

	public void addVoiture(Vehicule vehicule) {
		voitures.add(vehicule);
		save();
	}

	@Override
	public String toString() {
		String resulta;
		resulta = "\n*************************\n* Garage Openclassrooms *\n\n*                       *\n*************************\n\n";

		for (int i = 0; i < voitures.size(); i++) {

			resulta += voitures.get(i) + "\n";

		}
		return resulta;
	}

	private void save() {
		ObjectOutputStream oos;

		try {

			oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File("garage.txt"))));

			for (Vehicule vehicule2 : voitures) {
				oos.writeObject(vehicule2);
				
			}

			oos.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private void load() {
		ObjectInputStream ois = null;

		try {
			ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File("garage.txt"))));

			Vehicule v = (Vehicule) ois.readObject();

			while (true) {
				voitures.add(v);
				v = (Vehicule) ois.readObject();
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (EOFException e) {
			try {
				ois.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			System.err.println("\n pas de garage sauvegarder !");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
