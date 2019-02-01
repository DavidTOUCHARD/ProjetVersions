package eu.ensup.projetexception.exception;

public class ConnexionException extends Exception {
	
	//public SQLException except = new SQLException();
	
	public ConnexionException() {
		System.out.println("Problème de connexion à la base de données");
	}
	

}
