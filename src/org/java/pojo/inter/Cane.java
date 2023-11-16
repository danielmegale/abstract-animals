package org.java.pojo.inter;

import org.java.pojo.abs.Animale;

public class Cane extends Animale {

	@Override
	public void verso() {
		System.out.println("woof");
	}

	@Override
	public void mangia() {
		System.out.println("Carne");
	}

	
}
