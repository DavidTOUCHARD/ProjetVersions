package eu.ensup.projetexception.exception;

import java.sql.SQLException;

public class SyntaxeException extends Exception {
	
	//public SQLException except = new SQLException();
	
	public SyntaxeException() {
		System.out.println("Probl�me de syntaxe, verifiez l'�criture des champs");
	}
	

}
