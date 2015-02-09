package com.esiea.tp;

import java.util.Comparator;

public class ByAgeAsc implements Comparator<Acteur> {

	public int compare(Acteur arg0, Acteur arg1) {
		return arg0.getAge() - arg1.getAge();
	}

}