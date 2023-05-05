package TP2;
import java.util.Date;
import java.util.Iterator;
import java.util.Vector;
import java.text.SimpleDateFormat;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Piéce> pieceRepare = new Vector<>();
		Iterator<Piéce> m1;
		SimpleDateFormat dateformat = new SimpleDateFormat("dd/mm/yyyy");
		Technicien tech1= new Technicien("Slimane", "Houache", "slimo30@gmail.com", "slimo30", "slimane2003", 212, Specialite.informatique);
		Technicien tech2= new Technicien("Youcef", "Houache", "houache6@gmail.com", "youcef31", "youcefhou", 231, Specialite.electronique);
		tech1.afficher();
		tech2.afficher();
		Piéce p1 = new Piéce(22, "joint cilasse", 35, 225.3);
		Piéce p2 = new Piéce(45, "chemise", 12, 1450.45);
		pieceRepare.add(p1);
		pieceRepare.add(p2);
		System.out.println("La piece : "+p1.getNom());
		if (p1.isDispo()) {
			System.out.println("La quantite disponible = "+p1.getQuantite()+".");
		}else {
			System.out.println("La piece n'est pas disponible");
		}
		System.out.println("La piece : "+p2.getNom());
		if (p2.isDispo()) {
			System.out.println("La quantite disponible = "+p2.getQuantite()+".");
		}else {
			System.out.println("La piece n'est pas disponible");
		}
		p1.entrerStock(p1.getQuantite());
		p2.entrerStock(p2.getQuantite());
		System.out.println("La quantite stock est:"+p1.getQuantiteStock());
		Date dateRepair=new Date(15/02/2023);
		Réparation repair = new Réparation(dateRepair, 22, "changement mouteur", pieceRepare);
		double priceRepair = repair.calculerPrixRep(new Equipement(219, "pieceee", 3500));
		System.out.println("Price ="+priceRepair);
		repair.ajouterPièce(34, "keyboard", 56, 246.3);
		repair.afficherListePièces();
		repair.modifierPièce(34, "modem", 34,4500);
		System.out.println("************************");
		repair.afficherListePièces();
		Planning pl1 =new Planning();
		Planning.Maintenance maint1 = pl1.new Maintenance(dateRepair, 22,"qwerty");
		Planning.Maintenance maint2 = pl1.new Maintenance(dateRepair, 45,"azerty");
		Planning.Maintenance maint3 = pl1.new Maintenance(dateRepair, 62,"qwertz");
		Vector<Planning.Maintenance> listeMaintenance = new Vector<Planning.Maintenance>();
		pl1.setNumP(2);
		//Maintenance m1 = new Maintenance(dateformat.format("15/07/2022"), 25, "reparation mouteur");
	}

}
