package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Animal;


public class ZooDataBaseManager implements  IZooDataAccess{
	
	private static ZooDataBaseManager instance;
	private Connection connection;
	 
	 
	 private ZooDataBaseManager() throws SQLException  {
		 try {
			 Class.forName("org.sqlite.JDBC");
			 connection = DriverManager.getConnection("Jdbc:sqlite:database.db");
			initializeTables();			 
			 
		 }catch(SQLException e) {
				e.printStackTrace();
 
		 } catch (Exception e) {
			
			e.printStackTrace();
		}
	 }
	
	
		public static ZooDataBaseManager getInstance() throws SQLException {
			 if (instance == null) {
		            instance = new ZooDataBaseManager();
		        }
		        return instance;
			
		}
	

	private void initializeTables()  {
		try {
			
		Statement stmt = connection.createStatement();
		
		//creation  de la table animal
		stmt.execute("CREATE TABLE IF NOT EXISTS Animal (" + 
		"id_animal INTEGER PRIMARY KEY AUTOINCREMENT," + 
		"Nom TEXT NOT NULL," +
		"Espece TEXT NOT NULL" + 
		" Age TEXT  " + 
		"regimaAlimentaire TEXT ");
		
		//creation  de la table enclos
		stmt.execute("CREATE TABLE IF NOT EXISTS Enclos (" + 
				"id_enclos INTEGER PRIMARY KEY AUTOINCREMENT," + 
				"Nom TEXT NOT NULL," +
				"Capacite TEXT " +  
				"typeHabitat TEXT ");
		
		//creation  de la table Soigneur 
				stmt.execute("CREATE TABLE IF NOT EXISTS Soigneur (" + 
						"id_soigneur INTEGER PRIMARY KEY AUTOINCREMENT," + 
						"Nom TEXT NOT NULL," + 
						"typeHabitat TEXT ");
		
         
		}catch (Exception e) {
			
			e.printStackTrace();
		}
			
	}





	@Override
	public void ajouter(Animal animal) {
		try {
			PreparedStatement pstmt = connection.prepareStatement(
					"INSERT INTO livre (titre,auteur,ISBN) VALUE(?,?,?)");
			pstmt.setString(1,animal.getEspece() );
			pstmt.setString(2,animal.getEspece() );
			pstmt.setInt(3,animal.getAge() );
			pstmt.setString(2,animal.getRegimaAlimentaire());
			pstmt.executeUpdate();
			 
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public Animal getAnimal(int id_animal) {
		 try {
	            PreparedStatement pstmt = connection.prepareStatement(
	                "SELECT * FROM Animal WHERE id = ?");
	            pstmt.setInt(1, id_animal);
	            ResultSet rs = pstmt.executeQuery();
	            
	            if (rs.next()) {
	                return new Animal(
	                    rs.getInt("id_animal"),
	                    rs.getString("Nom"),
	                    rs.getString("espece"),
	                    rs.getInt("age"),
	                    rs.getString("regimaAlimentaire")
	                );
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
		return null;
	}

	@Override
	public List<Animal> getAnimal() {
		
		List<Animal> animals = new ArrayList<>();
		try{  PreparedStatement pstmt = connection.prepareStatement(
				"SELECTE * FROM Animal ");
	    ResultSet rs = pstmt.executeQuery();
	       if(rs.next()) {
	    	   Animal animal =new Animal(
	    			   rs.getInt("id_animal"),
	                    rs.getString("Nom"),
	                    rs.getString("espece"),
	                    rs.getInt("age"),
	                    rs.getString("regimaAlimentaire")
	    			   
	    			   );
	    	   
	    	   animals.add(animal);
	       }
	    
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		

		
		return animals;

	}

	@Override
	public void modifier(Animal animal) {
		try{  PreparedStatement pstmt = connection.prepareStatement(
				"UPDATE livre set titre = ? , auteur = ? , ISBN = ?  where idLivre = ? ");
		    pstmt.setString(1, animal.getNom());
		    pstmt.setString(2, animal.getEspece());
		    pstmt.setInt(3, animal.getAge());
		    pstmt.setString(4, animal.getRegimaAlimentaire());
		    pstmt.executeUpdate();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void supprimer(Animal animal) {
		try{  PreparedStatement pstmt = connection.prepareStatement(
				"DELETE FROM Animal where id_animal = ? ");
		    pstmt.setInt(1, animal.getId_animal());
		    pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
			
			
		
	}

}
