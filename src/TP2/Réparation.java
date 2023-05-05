package TP2;
import java.util.Date;
import java.util.Vector;
import java.util.Iterator;
public class Réparation {
	private Date dateRep;
	private int nbHeure;
	private String travaux;
	private Vector<Piéce> listePièceRep = new Vector<Piéce>();
	private Iterator<Piéce> itp;
	
	public Réparation(Date dateRep, int nbHeure, String travaux, Vector<Piéce> listePièceRep) {
		super();
		this.dateRep = dateRep;
		this.nbHeure = nbHeure;
		this.travaux = travaux;
		this.listePièceRep = listePièceRep;
	}
	public double calculerPrixRep(Equipement e){
		return e.getPrix();
	}
	public void ajouterPièce(int ref, String nom, int quantite, double prix) {
		if(!listePièceRep.contains(new Piéce(ref, nom, quantite, prix))) {
		listePièceRep.add(new Piéce(ref, nom, quantite, prix));
		}
	}
	public void ajouterPièce(Piéce p) {
		if(!listePièceRep.contains(p.getRef())) {
		listePièceRep.add(p);
		}
	}
	public void modifierPièce(int ref, String nom, int quantite, double prix) {
		boolean found = false;
		itp=listePièceRep.iterator();
		while (itp.hasNext()) {
			Piéce p = (Piéce) itp.next();
			if (p.getRef()==ref) {
				p.setNom(nom);
				p.setQuantite(quantite);
				p.setPrix(prix);
				found = true;
			}
		}
		if (found==false) {
			listePièceRep.add(new Piéce(ref, nom, quantite, prix));
		}
	}
	public void modifierPièce(Piéce p) {
		boolean found = false;
		itp=listePièceRep.iterator();
		while (itp.hasNext()) {
			Piéce p1 = (Piéce) itp.next();
			if (p1.getRef()==p.getRef()) {
				p1.setNom(p.getNom());
				p1.setQuantite(p.getQuantite());
				p1.setPrix(p.getPrix());
				found = true;
			}
		}
		if (found==false) {
			listePièceRep.add(p);
		}
	}
	public void supprimerPièce(int ref) {
		itp=listePièceRep.iterator();
		while (itp.hasNext()) {
			Piéce p = (Piéce) itp.next();
			if (p.getRef()==ref) {
				listePièceRep.remove(p);
			}
		}
	}
	public void afficherListePièces() {
		itp=listePièceRep.iterator();
		while (itp.hasNext()) {
			Piéce p = (Piéce) itp.next();
			System.out.println("Reference : "+p.getRef()+" Nom : "+p.getNom()+" Quantite : "+p.getQuantite()+" Prix : "+p.getPrix());

		}
	}
}
