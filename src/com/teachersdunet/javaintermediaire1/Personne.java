package com.teachersdunet.javaintermediaire1;

public class Personne {
		private String nom;
		private int age;
		
		//public Personne(String nom, int age)
		public Personne(String nom){
			this.nom = nom;
			//this.age = age;
		}
		
		public String getNom() {
			return nom;
		}



		public void setNom(String nom) {
			this.nom = nom;
		}



		public void setAge(int age){
			if(age<15){
				System.out.println("Interdit au moins de 15 ans");
			}else {
				this.age = age;
			}
			
		}
		public int getAge(){
			return this.age*365;
		}
		
		}
		

		

