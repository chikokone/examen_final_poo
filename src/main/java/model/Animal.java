package model;

public class Animal {

	private int id_animal;
	private String Nom;
	private String espece;
	private int age; 
	private String regimaAlimentaire ;
	
	
	public Animal(int id_animal, String Nom, String espece, int age, String regimaAlimentaire) {
		this.id_animal = id_animal;
		this.Nom = Nom;
		this.espece = espece ;
		this.age = age ;
		this.regimaAlimentaire = regimaAlimentaire;
	} 
	public int getId_animal() {
		return id_animal;
	}
	public void setId_animal(int id_animal) {
		this.id_animal = id_animal;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getEspece() {
		return espece;
	}
	public void setEspece(String espece) {
		this.espece = espece;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getRegimaAlimentaire() {
		return regimaAlimentaire;
	}
	public void setRegimaAlimentaire(String regimaAlimentaire) {
		this.regimaAlimentaire = regimaAlimentaire;
	}
}
