package com.esiea.tp;

import java.util.Comparator;

public class ByNom implements Comparator<Acteur> {

	public int compare(Acteur arg0, Acteur arg1) {
		String nom1 = ((Acteur) arg0).getNom();
		String nom2 = ((Acteur) arg1).getNom();

		return nom1.compareTo(nom2);
	}
}