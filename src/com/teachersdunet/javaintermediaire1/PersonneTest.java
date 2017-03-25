package com.teachersdunet.javaintermediaire1;

public class PersonneTest {

	public static void main(String[] args) {
		Personne p1 = new Personne("Philippe");
		Personne p2 = new Personne("Eric");
		Personne p3 = new Personne("Pierre");
		
		//System.out.println(Personne.nbreTotalDePersonne);
		
		System.out.println(Personne.getNbreTotalDePersonne());
		
		System.out.println(Personne.NOMBRE_MAX_OREILLES);
		//System.out.println(p1.getNom());
		
		//p1.setAge(45);
		//System.out.println(p1.getAge());
	
		
	}

}
