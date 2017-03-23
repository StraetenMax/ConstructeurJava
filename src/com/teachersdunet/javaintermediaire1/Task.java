package com.teachersdunet.javaintermediaire1;

public class Task {
	public String title;
	public String description;
	public int nbPages;
	public boolean completed = false;
	
	public Task(String title, String description, int nbPages){
		this.title = title;
		this.description = description;
		this.nbPages= nbPages;
	}
	
	public void complete (){
		completed = true;
	}
}
