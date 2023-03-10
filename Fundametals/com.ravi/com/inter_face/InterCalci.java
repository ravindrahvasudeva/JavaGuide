package com.inter_face;

public class InterCalci implements InterFace {
	public void run() {
		System.out.println("hii");
		
	}
public void fly() {
		System.out.println("flying");
	}

public static void main(String[] args) {
	InterCalci i=new InterCalci();
	i.run();
	i.fly();
	
}}

