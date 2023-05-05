package TP2;

public class Perssone {
	private String nom;
	private String prenom;
	private String email;
	private String login;
	private String password;
	public Perssone() {
	}
	public Perssone(String nom, String prenom, String email, String login, String password) {
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.login = login;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Perssone [nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", login=" + login + ", password="
				+ password + "]";
	}
	public void afficher() {
		System.out.println(toString());
	}
	public Boolean sauthentofier1(String password,String email) {
		if (password==this.password && email==this.email) {
			return true;
		}else {
			return false;
		}
	}
	int i=0;
	public boolean sauthentofier2(){
	    while(sauthentofier1(password, login)==false && i<3){
	       i++;
	    }
	    if (i==3) {
	        return false;
	    }
	    return true;
	}
}
