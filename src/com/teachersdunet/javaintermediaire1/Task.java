package com.teachersdunet.javaintermediaire1;

public class Task {
	public String titre;
	public String description;
	public boolean completed = false;
	
	public Task(String title, String desc){
		titre = title;
		description = desc;
	}
	
	public void complete (){
		completed = true;
	}
}
