package TP2;

public class Equipement {
	private int numSerie;
	private String designation;
	private double prix;
	public Equipement(int numSerie, String designation, double prix) {
		super();
		this.numSerie = numSerie;
		this.designation = designation;
		this.prix = prix;
	}
	public int getNumSerie() {
		return numSerie;
	}
	public void setNumSerie(int numSerie) {
		this.numSerie = numSerie;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
}
