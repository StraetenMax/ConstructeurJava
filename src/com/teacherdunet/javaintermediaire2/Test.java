package com.teacherdunet.javaintermediaire2;

public abstract class Test {

	public static void main(String[] args) {
		System.out.println(Math.abs(-15));
	}
	public int abs(int value){
		if(value >=0){
			return value;
		}else{
			return -value;
		}
	}
	
	
	
}
