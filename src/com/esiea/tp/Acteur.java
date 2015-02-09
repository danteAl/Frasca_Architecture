package com.esiea.tp;

public class Acteur {
	
	private String nom, prenom;
	private int age;

	public Acteur(String nom, String prenom, int age) {
		this.age = age;
		this.nom = nom;
		this.prenom = prenom;
	}
	
	@Override
	public String toString() {
		 return "Nom : " + nom + ", Prenom : " + prenom + ", Age : " + age;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public int getAge() {
		return age;
	}

}