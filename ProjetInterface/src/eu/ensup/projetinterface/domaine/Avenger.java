
package eu.ensup.projetinterface.domaine;

import java.util.List;

public class Avenger {
	//Classe avenger
	private String nom;
	private String costume;
	private int age;
	private String pouvoir;
	
	public Avenger(String nom, String costume, int age, String pouvoir) {
		super();
		this.nom = nom;
		this.costume = costume;
		this.age = age;
		this.pouvoir = pouvoir;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCostume() {
		return costume;
	}
	public void setCostume(String costume) {
		this.costume = costume;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPouvoir() {
		return pouvoir;
	}
	public void setPouvoir(String pouvoir) {
		this.pouvoir = pouvoir;
	}

	@Override
	public String toString() {
		
		return " nom : " + nom + " \t costume : " + costume + "  \t age : " + age + ", \t pouvoir : " + pouvoir +"\n";
	}
	

}
