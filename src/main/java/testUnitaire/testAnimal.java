package testUnitaire;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

import model.Animal;



public class testAnimal {
	 @Test
	    public void testAnimal() {
	        Animal animal = new Animal(1, "cold", "chien", 4,"regime");
	        assertEquals("cold", animal.getNom());
	        assertEquals("chien", animal.getEspece());
	        assertEquals("4", animal.getAge());
	        assertEquals("regime", animal.getRegimaAlimentaire());

}

}
