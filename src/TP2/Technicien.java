package TP2;

public class Technicien extends Perssone{
	private int mat;
	Specialite specialite;
	
	public Technicien() {
		super();
	}

	public Technicien(String nom, String prenom, String email, String login, String password, int mat,
			Specialite specialite) {
		super(nom, prenom, email, login, password);
		this.mat = mat;
		this.specialite = specialite;
	}

	@Override
	public String toString() {
		return super.toString()+ "Technicien [mat=" + mat + ", specialite=" + specialite + "]";
	}
	public void afficher() {
		System.out.println(toString());
	}
}
