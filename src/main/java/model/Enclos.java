package model;

public class Enclos {
	private int id_enclos;
	private String Nom;
	private int capacite; 
	private String typeHabitat ;
	
	
	public Enclos(int id_enclos, String Nom, int capacite, String typeHabitat) {
		this.id_enclos = id_enclos;
		this.Nom = Nom;
		this.capacite = capacite;
		this.typeHabitat = typeHabitat;
		
	}
	
	
	
	public int getId_enclos() {
		return id_enclos;
	}
	public void setId_enclos(int id_enclos) {
		this.id_enclos = id_enclos;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public int getCapacite() {
		return capacite;
	}
	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}
	public String getTypeHabitat() {
		return typeHabitat;
	}
	public void setTypeHabitat(String typeHabitat) {
		this.typeHabitat = typeHabitat;
	}

}
