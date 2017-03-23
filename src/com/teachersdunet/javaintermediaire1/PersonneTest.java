package com.teachersdunet.javaintermediaire1;

public class PersonneTest {

	public static void main(String[] args) {
		Personne p1 = new Personne("Philippe");
		System.out.println(p1.nom);
		
		p1.setAge(12);
		System.out.println(p1.age);
	
		
	}

}
