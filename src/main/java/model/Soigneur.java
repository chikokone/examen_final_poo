package model;

public class Soigneur {

	private int id_soigneur;
	private String Nom;
	private String specialite ;
	
	
	public Soigneur(int id_soigneur, String Nom, String specialite) {
		this.setId_soigneur(id_soigneur);
		this.setNom(Nom);
		this.setSpecialite(specialite);
		
}


	public int getId_soigneur() {
		return id_soigneur;
	}


	public void setId_soigneur(int id_soigneur) {
		this.id_soigneur = id_soigneur;
	}


	public String getNom() {
		return Nom;
	}


	public void setNom(String nom) {
		Nom = nom;
	}


	public String getSpecialite() {
		return specialite;
	}


	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	




}
