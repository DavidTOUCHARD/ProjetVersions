package eu.ensup.projetinterface.presentation;

import java.sql.SQLException;

/*import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestFenetre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Avengers kn = new Avengers("InvibleWoman", "vert", 22, "peut se rendre invisible");
		Avengers yc = new Avengers("batman", "noir", 32, "peut se déplacer dans le temps");
		
		List<Avengers> superheros = new ArrayList<Avengers>();
		superheros.add(0, kn);
		superheros.add(1, yc);
		
		JFrame fenetre = new JFrame("Ma Première Fenêtre");
		JMenuBar menubar = new JMenuBar();
		JMenu menu1 = new JMenu("Fichier");
		JMenu menu2 = new JMenu("Editer");
		JMenu menu3 = new JMenu("Aide");
		
		JPanel content = new JPanel();
		JPanel pan = new JPanel();
		
		
		JMenuItem sousmenu1 = new JMenuItem("Avengers");
		JMenuItem sousmenu2 = new JMenuItem("Personne");
		
		pan.add(new JTextField(superheros.toString()));
		
		menu1.add(sousmenu1);
		menu1.add(sousmenu2);
		
		menubar.add(menu1);
		menubar.add(menu2);
		menubar.add(menu3);
		
		content.add(pan);
		fenetre.getContentPane().add(content, BorderLayout.CENTER);
		
		//fenetre.add(comp);
		
		
		
		
		fenetre.setSize(500, 700);
		fenetre.setLocationRelativeTo(null);
		fenetre.setJMenuBar(menubar);
		fenetre.setVisible(true);
		

	}

}*/




import java.util.ArrayList;
import java.util.Collection;

import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

import eu.ensup.projetinterface.domaine.Avenger;
import eu.ensup.projetinterface.service.AvengerService;


public class TestFenetre extends JComponent{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		AvengerService service = new AvengerService();
		
		
		Avenger av1 = new Avenger("kh", "vert", 22, "peut se rendre invisible");
		Avenger av2 = new Avenger("iron", "noir", 26, "peut disparaitre");
		
		service.ComparerAvenger(av1, av1) ;
	service.ajouterAvenger(av2);
//		service.afficherAvenger();
//		service.modifierAvenger(av2, "peut se déplacer dans le temps");
//		System.out.println("Afficher 1 avenger : ");
//		service.recupererAvenger(av1);
//		//service.supprimerAvenger(av1);
//		System.out.println("Afficher tous les avengers : ");
//		service.recupererTout();
		
//		service.ajouterListeAvengers(av1);
//		service.ajouterListeAvengers(av2);
//		
//		JFrame f = new JFrame("hello"); 
//		f.setSize(700, 400);
//		f.setLocationRelativeTo(null);
//		JPanel p = new JPanel();
//		
//		
//		JMenu m1 = new JMenu("Accueil");
//		JMenu m2 = new JMenu("Option");
//		JMenu m3 = new JMenu("Edition");
//		JMenuBar mb = new JMenuBar(); 
//		mb.add(m1);
//		mb.add(m2);
//		mb.add(m3);
//		f.setJMenuBar(mb);
//		
//		
//		p.add(service.afficherListeAvengers());
//		f.add(p);
//		
//		f.setVisible(true);
//		
	}

}
