package TP2;

public class Piéce {
	private int ref;
	private String nom;
	private int quantite;
	private static int quantiteStock=0;
	private double prix;
	
	
	public int getRef() {
		return ref;
	}
	public void setRef(int ref) {
		this.ref = ref;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public static int getQuantiteStock() {
		return quantiteStock;
	}
	public static void setQuantiteStock(int quantiteStock) {
		Piéce.quantiteStock = quantiteStock;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public Piéce(int ref, String nom, int quantite, double prix) {
		this.ref = ref;
		this.nom = nom;
		this.quantite = quantite;
		this.prix = prix;
	}
	public boolean isDispo() {
		return(this.quantite>0);
	}
	public void entrerStock(int quantite) {
		quantiteStock+=quantite;
		this.quantite+=quantite;
	}
	public double calculerMontantPiece() {
		return(this.prix*this.quantite);
	}
}
