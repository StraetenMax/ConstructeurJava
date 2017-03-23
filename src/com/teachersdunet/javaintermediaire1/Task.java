package com.teachersdunet.javaintermediaire1;

public class Task {
	public String title;
	public String description;
	public boolean completed = false;
	
	public Task(String title, String description){
		this.title = title;
		this.description = description;
	}
	
	public void complete (){
		completed = true;
	}
}
