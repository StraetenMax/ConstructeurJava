package com.teachersdunet.javaintermediaire1;

public class PersonneTest {

	public static void main(String[] args) {
		Personne p1 = new Personne("Petit","Philippe");
		Personne p2 = new Personne("Durant","Eric");
		Personne p3 = new Personne("Dupont", "Pierre");
		
		//System.out.println(Personne.nbreTotalDePersonne);
		
		System.out.println(p1.full_title("Je suis"));
		System.out.println(p2.full_title("Je ne suis pas"));
		System.out.println(p3.full_title());
		
		
		System.out.println(Personne.getNbreTotalDePersonne());
		
		System.out.println(Personne.NOMBRE_MAX_OREILLES);
		//System.out.println(p1.getNom());
		
		//p1.setAge(45);
		//System.out.println(p1.getAge());
	
		
	}

}
