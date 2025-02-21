package data;

import java.util.List;

import model.Animal;



public interface IZooDataAccess {
	// methode CRUD pour Animal 
		void ajouter(Animal animal);
	    Animal getAnimal(int id_animal);
		List<Animal> getAnimal();
		void modifier(Animal animal);
		void supprimer(Animal animal);
		;
		
}
