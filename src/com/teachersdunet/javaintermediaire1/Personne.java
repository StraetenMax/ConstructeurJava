package com.teachersdunet.javaintermediaire1;

public class Personne {
		public String nom;
		public int age;
		
		//public Personne(String nom, int age)
		public Personne(String nom){
			this.nom = nom;
			//this.age = age;
		}
		
		public void setAge(int age){
			if(age<15){
				System.out.println("Interdit au moins de 15 ans");
			}else {
				this.age = age;
			}
			
		}
		
		
		}
		

		

