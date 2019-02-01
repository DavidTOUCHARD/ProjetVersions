package eu.ensup.projetinterface.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import eu.ensup.projetinterface.domaine.Avenger;
import eu.ensup.projetinterface.exception.DaoException;

public abstract class AbstractAvenger implements IAvengerDao {

	public abstract void createAvenger(Avenger avenger) throws DaoException;

	public abstract Avenger readAvengerbyname(Avenger avenger);

	public abstract String updateAvengerbyname(Avenger avenger, String newpower);

	public abstract void deleteAvengerbyname(Avenger avenger);

	public abstract List<Avenger> getAll();

	public Connection cn;
	public Statement st;

	protected Connection seConnecter() {

		String url = "jdbc:mysql://localhost/avengers?verifyServerCertificate=false&useSSL=true";
		String login = "root";
		String passwd = "";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection(url, login, passwd);
			st = cn.createStatement();

		}

		catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("hello");
			e.printStackTrace();
		}

		return cn;
	}

	protected void seDeconnecter() {
		try {
			cn.close();
			st.close();
			// System.out.println("Déconnecté. \nBye ");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
