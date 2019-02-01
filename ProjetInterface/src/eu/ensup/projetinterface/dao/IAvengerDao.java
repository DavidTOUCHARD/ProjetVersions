package eu.ensup.projetinterface.dao;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JComboBox;

import eu.ensup.projetinterface.domaine.Avenger;
import eu.ensup.projetinterface.exception.DaoException;

public interface IAvengerDao {
	
	public void createAvenger(Avenger avenger) throws DaoException;
	
	public Avenger readAvengerbyname(Avenger avenger);
	
	public String updateAvengerbyname(Avenger avenger, String newpower);
	
	public void deleteAvengerbyname(Avenger avenger);
	
	public List<Avenger> getAll();
	
}
