package com.abstraction;

public class Launch1 extends Demo {
	public static void main(String[] args) {
     Launch1 l1= new Launch1();
		l1.fun();
		l1.hi();
		l1.hlo();
      
	}

	@Override
	void fun() {
		System.out.println("hakde preman ge");
	}

	@Override
	void hlo() {
		System.out.println("hlo method");
		
	}

	@Override
	void hi() {
		System.out.println("hii method");
		
	}
	
	// here we have implemented all the abstract class methods by inheriting it .
	//we cannot instantiate an abstract class
	

}
