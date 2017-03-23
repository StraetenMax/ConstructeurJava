package com.teachersdunet.javaintermediaire1;

public class TaskTest {

	public static void main(String[] args) {
		Task tache1 = new Task("Tutoriel","Faire un tutoriel en peu d'heure", 12);
		Task tache2 = new Task("Cinéma","Allons au cinéma ce soir", 15);
		Task tache3 = new Task("Exécuter une action", "Dire mamamya à la fin de la vidéo", 231);
		
		tache2.complete();
		
		
		System.out.println(tache1.title);
		System.out.println(tache3.description);
		System.out.println(tache2.nbPages);
		System.out.println(tache2.completed);

	}

}
