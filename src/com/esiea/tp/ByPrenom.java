package com.esiea.tp;

import java.util.Comparator;

public class ByPrenom implements Comparator<Acteur> {

	public int compare(Acteur arg0, Acteur arg1) {
		String prenom1 = ((Acteur) arg0).getPrenom();
		String prenom2 = ((Acteur) arg1).getPrenom();
		
		return prenom1.compareTo(prenom2);
	}

}
