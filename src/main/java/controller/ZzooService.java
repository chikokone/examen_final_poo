package controller;

import java.sql.SQLException;
import java.util.List;

import data.IZooDataAccess;
import data.ZooDataBaseManager;
import model.Animal;



public class ZzooService {
	 private final IZooDataAccess izooDataAccess;

	    public ZzooService() throws SQLException {
	        this.izooDataAccess = ZooDataBaseManager.getInstance();
	    }

	    public void ajouterAnimal(String Nom, String espece, int age, String regimaAlimentaire) {
	        Animal animal = new Animal(0, Nom, espece, age, regimaAlimentaire);
	        izooDataAccess.ajouter(animal);
	    }
	    public List<Animal> getAllLivres() {
	        return izooDataAccess.getAnimal();
	    }

}
