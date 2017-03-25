package com.teachersdunet.javaintermediaire1;

public class Personne {
		//private String nom;
		//private String prenom;
		private String mNom;
		private String mPrenom;
		private int age;
		
		public static final int NOMBRE_MAX_OREILLES = 2;
		
		private static int nbreTotalDePersonne = 0;
		public static char[] getNbreTotalDePersonne;
		
		//public Personne(String nom, int age)
		public Personne(String nom, String prenom){
			//this.nom = nom;
			//this.prenom = prenom;
			mNom = nom;
			mPrenom = prenom;
			//this.age = age;
			nbreTotalDePersonne++;
		
		}
		
		public String full_title(String debut){
			return String.format("%s %s %s", debut, mNom, mPrenom);
		}
		
		public String full_title(){
			//return mNom +" "+mPrenom;
			return String.format("%s, %s", mNom, mPrenom);
		}
		
		
		
		
		public static int getNbreTotalDePersonne(){
			return nbreTotalDePersonne;
		}
		
		
		
		
		
		/*public String getNom() {
			return nom;
		}*/

		/*public void setNom(String nom) {
			this.nom = nom;
		}*/

		public String getmNom() {
			return mNom;
		}

		public void setmNom(String mNom) {
			this.mNom = mNom;
		}

		public String getmPrenom() {
			return mPrenom;
		}

		public void setmPrenom(String mPrenom) {
			this.mPrenom = mPrenom;
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
		

		

