package com.base;

public class Sample {
	static Sample a;

	private static Sample gana() {
		
		if (a == null) {
			a = new Sample();
			
		}
		int identityHashCode = System.identityHashCode(a);
		System.out.println(identityHashCode);
		return a;
		
	}

	public static void main(String[] args) {
		Sample gana = gana();
		Sample gana2 = gana();
		Sample gana3 = gana();
	}

}
