package TP2;

import java.util.Date;
import java.util.Vector;
import java.util.Iterator;

public class Planning {
	private int numP;
	private Vector<Planning.Maintenance> listeMaintenance = new Vector<Planning.Maintenance>();
	private Iterator<Planning.Maintenance> itm;

	public class Maintenance {
		private Date dateMaint;
		private int nbHeure;
		private String travaux;
		private Vector<Piéce> listePièceMaint = new Vector<Piéce>();
		private Iterator<Piéce> itp;

		public Date getDateMaint() {
			return dateMaint;
		}

		public void setDateMaint(Date dateMaint) {
			this.dateMaint = dateMaint;
		}

		public int getNbHeure() {
			return nbHeure;
		}

		public void setNbHeure(int nbHeure) {
			this.nbHeure = nbHeure;
		}

		public String getTravaux() {
			return travaux;
		}

		public void setTravaux(String travaux) {
			this.travaux = travaux;
		}

		public Maintenance(Date dateMaint, int nbHeure, String travaux) {
			super();
			this.dateMaint = dateMaint;
			this.nbHeure = nbHeure;
			this.travaux = travaux;
		}

		public void ajouterPiece(int ref, String nom, int quantite, double prix) {
			listePièceMaint.add(new Piéce(ref, nom, quantite, prix));
		}

		public void ajouterPiece(Piéce p) {
			listePièceMaint.add(p);
		}

		public void modifierPiece(int ref, String nom, int quantite, double prix) {
			boolean found = false;
			itp = listePièceMaint.iterator();
			while (itp.hasNext()) {
				Piéce p = (Piéce) itp.next();
				if (p.getRef() == ref) {
					p.setNom(nom);
					p.setQuantite(quantite);
					p.setPrix(prix);
					found = true;
				}
			}
			if (found == false) {
				listePièceMaint.add(new Piéce(ref, nom, quantite, prix));
			}
		}

		public void supprimerPièce(int ref) {
			itp = listePièceMaint.iterator();
			while (itp.hasNext()) {
				Piéce p = (Piéce) itp.next();
				if (p.getRef() == ref) {
					listePièceMaint.remove(p);
				}
			}
		}

		public void afficherListePièces() {
			itp = listePièceMaint.iterator();
			while (itp.hasNext()) {
				Piéce p = (Piéce) itp.next();
				System.out.println("Reference :" + p.getRef() + "Nom :" + p.getNom() + "Quantite :" + p.getQuantite()
						+ "Prix :" + p.getPrix());
			}
		}
	}

	public int getNumP() {
		return numP;
	}

	public void setNumP(int numP) {
		this.numP = numP;
	}

	public void ajouterMaint(Date dateMaint, int nbHeure, String travaux) {
		listeMaintenance.add(new Maintenance(dateMaint, nbHeure, travaux));
	}

	public void modifierMaint(Date dateMaint, int nbHeure, String travaux) {
		boolean found = false;
		itm = listeMaintenance.iterator();
		while (itm.hasNext()) {
			Planning.Maintenance m = (Planning.Maintenance) itm.next();
			if (m.getDateMaint() == dateMaint) {
				m.setNbHeure(nbHeure);
				m.setTravaux(travaux);
				found = true;
			}
		}
		if (found == false) {
			listeMaintenance.add(new Maintenance(dateMaint, nbHeure, travaux));
		}
	}

	public void supprimerMaint(Date dateMaint) {
		itm = listeMaintenance.iterator();
		while (itm.hasNext()) {
			Planning.Maintenance m = (Planning.Maintenance) itm.next();
			if (m.getDateMaint() == dateMaint) {
				listeMaintenance.remove(m);
			}
		}
	}

	public void afficherListeMaint() {
		itm = listeMaintenance.iterator();
		while (itm.hasNext()) {
			Planning.Maintenance m = (Planning.Maintenance) itm.next();
			System.out.println(
					"DateMaint :" + m.getDateMaint() + "NbHeure :" + m.getNbHeure() + "Travaux :" + m.getTravaux());
		}
	}
}
