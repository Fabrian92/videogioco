package gioco.main;

import java.util.ArrayList;

import gioco.PersonaggiAttivit‡Comuni;
import gioco.personaggi.Batman;
import gioco.personaggi.KenIlGuerriero;
import gioco.personaggi.Spiderman;
import gioco.personaggi.Superman;



public class Main {

	public static void main(String[] args) {
		ArrayList<PersonaggiAttivit‡Comuni> listaPersonaggi = new ArrayList<PersonaggiAttivit‡Comuni>();
		
		Spiderman spiderman = new Spiderman();
		spiderman.corri(54);
		
		Superman superman = new Superman();
		Batman batman = new Batman();
		KenIlGuerriero kenIlGuerriero = new KenIlGuerriero();
		Spiderman spiderman = new Spiderman();
		Hulk hulk = new Hulk();
		UfoRobot ufoRobot = new UfoRobot();
		CodeGeass codeGeass = new CodeGeass();
		
		
		
		
		listaPersonaggi.add(spiderman);
		

	}

}
