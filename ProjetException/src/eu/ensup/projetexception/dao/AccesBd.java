package eu.ensup.projetexception.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import eu.ensup.projetexception.exception.ConnexionException;

public class AccesBd {

	public Connection cn;
	public Statement st;

	// TODO Connexion à la BD

	public Connection seConnecter() throws ConnexionException {
		
		String url = "jdbc:mysql://localhost/avengers?verifyServerCertificate=false&useSSL=true";
		String login = "root";
		String passwd = "";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection(url, login, passwd);
			st = cn.createStatement();
		}

		catch (SQLException e) {
			new ConnexionException();
		} catch (ClassNotFoundException e) {
			System.out.println("hello");
			e.printStackTrace();
		}

		return cn;
	}

	// TODO Déconnexion à la BD

	public void seDeconnecter() {
		try {
			cn.close();
			st.close();
			// System.out.println("Déconnecté. \nBye ");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
