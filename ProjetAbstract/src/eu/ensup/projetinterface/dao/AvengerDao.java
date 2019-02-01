package eu.ensup.projetinterface.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import eu.ensup.projetinterface.domaine.Avenger;
import eu.ensup.projetinterface.exception.DaoException;

public class AvengerDao extends AbstractAvenger {

	@Override
	public void createAvenger(Avenger avenger) throws DaoException {
		// TODO Auto-generated method stub

		seConnecter();
		try {

			String requete = "INSERT INTO `Avenger` (`nom`,`costume`,`age`,`pouvoir`) VALUES ('" + avenger.getNom()
					+ "','" + avenger.getCostume() + "','" + avenger.getAge() + "','" + avenger.getPouvoir() + "');";

			st.executeUpdate(requete);

		} catch (SQLException e) {
			// TODO: handle exception
			new DaoException();
		}

		seDeconnecter();

	}

	@Override
	public Avenger readAvengerbyname(Avenger avenger) {
		// TODO Auto-generated method stub
		AccesBd bd = new AccesBd();
		Avenger av = null;
		seConnecter();
		try {

			String requete = "SELECT * FROM `Avenger` WHERE `nom` = '" + avenger.getNom() + "';";
			ResultSet rs = st.executeQuery(requete);

			while (rs.next()) {
				av = new Avenger(rs.getString("nom"), rs.getString("costume"), rs.getInt("age"),
						rs.getString("pouvoir"));

			}

		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("hello");
		}

		seDeconnecter();

		return av;
	}

	@Override
	public String updateAvengerbyname(Avenger avenger, String newpower) {
		// TODO Auto-generated method stub
		AccesBd bd = new AccesBd();
		int rs = 0;
		seConnecter();
		try {
			String requete = "UPDATE `Avenger` SET `pouvoir` = '" + newpower + "' WHERE `nom` = '" + avenger.getNom()
					+ "';";
			rs = st.executeUpdate(requete);
			if (rs != 0) {
				seDeconnecter();
				return "OK.Vous avez modifié " + rs + "ligne(s)\n";
			}

		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("hello");
		}

		seDeconnecter();
		return "Modification non prise en compte";
	}

	@Override
	public void deleteAvengerbyname(Avenger avenger) {
		// TODO Auto-generated method stub
		AccesBd bd = new AccesBd();

		seConnecter();
		try {
			String requete = "DELETE FROM `Avenger` WHERE `nom` = '" + avenger.getNom() + "';";
			st.executeUpdate(requete);
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("hello");
		}

		seDeconnecter();

	}

	@Override
	public List<Avenger> getAll() {
		// TODO Auto-generated method stub
		AccesBd bd = new AccesBd();
		List<Avenger> superheros = new ArrayList<Avenger>();

		seConnecter();
		try {
			String requete = "SELECT * FROM `Avenger`;";
			ResultSet rs = st.executeQuery(requete);

			while (rs.next()) {

				superheros.add(new Avenger(rs.getString("nom"), rs.getString("costume"), rs.getInt("age"),
						rs.getString("pouvoir")));

			}

		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("hello");
		}

		seDeconnecter();

		return superheros;
	}

}
