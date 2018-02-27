package garageP;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
public class Vehicule implements Serializable{
	
	private double prix;
	private String nom;
	private List<Option> option;
	private Marque marque; 
	private Moteur moteur;
	
	public Vehicule(Marque marque, String nom) {
		this.nom = nom;
		this.marque=  marque;
		
		option = new ArrayList<>();
	}
		
		
	public void addOption (Option option) {
		this.option.add(option);
		calculPrix();
	}
	
	
	public void setMoteur (Moteur moteur) {
		this.moteur = moteur;
		calculPrix();
		}
	
	
	@Override
	public String toString() {
		String resulta;
		resulta = "+ Voiture " + marque + " : " + nom + " " + moteur.toString() + option + " D'une valeur totale de " + prix + " €";
		
			
			
		return resulta;
	}
	
	private void calculPrix() {
		
		prix = 0d;
		
		if (moteur != null) {
			prix += moteur.getPrix();
			}
		
		for (int i = 0; i < option.size(); i++) {
			
			prix += option.get(i).getPrix();
		}
		
		
	}


	public double getPrix() {
		return prix;
	}


	public List<Option> getOption() {
		return option;
	}


	public Marque getMarque() {
		return marque;
	}
	
}
