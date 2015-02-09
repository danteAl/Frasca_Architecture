package com.esiea.tp;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {

		Acteur acteur1 = new Acteur("Michael", "Fassbender", 37);
		Acteur acteur2 = new Acteur("Kiefer", "Sutherland", 48);
		Acteur acteur3 = new Acteur("Ryan", "Gosling", 34);
		Acteur acteur4 = new Acteur("Kiefer", "Sutherland", 34);

		ArrayList<Acteur> acteurs = new ArrayList<Acteur>();
		
		acteurs.add(acteur1);
		acteurs.add(acteur2);
		acteurs.add(acteur3);
		acteurs.add(acteur4);

		Collections.sort(acteurs, new ByAgeAsc());
		
		for (Acteur acteur : acteurs) {
			System.out.println(acteur);
		}
		
	}

}