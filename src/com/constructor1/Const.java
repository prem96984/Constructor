package com.constructor1;

public class Const {
	public Const() {
		System.out.println("prem");
		
		
	}
	public Const(int a) {
		System.out.println(a);
	}
	public Const(String s) {
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		Const a = new Const();
		Const a1 = new Const(99);
		Const a2 = new Const("prrem");	
	}

}
