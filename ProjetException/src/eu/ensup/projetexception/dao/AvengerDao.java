package eu.ensup.projetexception.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import eu.ensup.projetexception.domaine.Avenger;
import eu.ensup.projetexception.exception.ConnexionException;
import eu.ensup.projetexception.exception.SyntaxeException;

public class AvengerDao {

	// AccesBd bd = new AccesBd(); quand on va implementer l'interface
	// IAvengerDao

	// public DaoException de = new DaoException();

	public void createAvenger(Avenger avenger) throws SyntaxeException, ConnexionException {
		// TODO Auto-generated method stub

		AccesBd bd = new AccesBd();
		bd.seConnecter();
		try {

			String requete = "INSERT INTO `superhero` (`nom`,`costume`,`age`,`pouvoir`) VALUES ('" + avenger.getNom()
					+ "','" + avenger.getCostume() + "','" + avenger.getAge() + "','" + avenger.getPouvoir() + "');";

			bd.st.executeUpdate(requete);

		} catch (SQLException e) {
			// TODO: handle exception
			new SyntaxeException();
		}

		bd.seDeconnecter();

	}

	public Avenger readAvengerbyname(Avenger avenger) throws ConnexionException {
		// TODO Auto-generated method stub
		AccesBd bd = new AccesBd();
		Avenger av = null;
		bd.seConnecter();
		try {

			String requete = "SELECT * FROM `Avenger` WHERE `nom` = '" + avenger.getNom() + "';";
			ResultSet rs = bd.st.executeQuery(requete);

			while (rs.next()) {
				av = new Avenger(rs.getString("nom"), rs.getString("costume"), rs.getInt("age"),
						rs.getString("pouvoir"));

			}

		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("hello");
		}

		bd.seDeconnecter();

		return av;
	}

	public String updateAvengerbyname(Avenger avenger, String newpower) throws ConnexionException {
		// TODO Auto-generated method stub
		AccesBd bd = new AccesBd();
		int rs = 0;
		bd.seConnecter();
		try {
			String requete = "UPDATE `Avenger` SET `pouvoir` = '" + newpower + "' WHERE `nom` = '" + avenger.getNom()
					+ "';";
			rs = bd.st.executeUpdate(requete);
			if (rs != 0) {
				bd.seDeconnecter();
				return "OK.Vous avez modifié " + rs + "ligne(s)\n";
			}

		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("hello");
		}

		bd.seDeconnecter();
		return "Modification non prise en compte";
	}

	public void deleteAvengerbyname(Avenger avenger) throws ConnexionException {
		// TODO Auto-generated method stub
		AccesBd bd = new AccesBd();
		bd.seConnecter();
		try {
			String requete = "DELETE FROM `Avenger` WHERE `nom` = '" + avenger.getNom() + "';";
			bd.st.executeUpdate(requete);
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("hello");
		}

		bd.seDeconnecter();

	}

	public List<Avenger> getAll() throws ConnexionException {
		// TODO Auto-generated method stub
		AccesBd bd = new AccesBd();
		List<Avenger> superheros = new ArrayList<Avenger>();

		bd.seConnecter();
		try {
			String requete = "SELECT * FROM `Avenger`;";
			ResultSet rs = bd.st.executeQuery(requete);

			while (rs.next()) {

				superheros.add(new Avenger(rs.getString("nom"), rs.getString("costume"), rs.getInt("age"),
						rs.getString("pouvoir")));

			}

		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("hello");
		}

		bd.seDeconnecter();

		return superheros;
	}

}
