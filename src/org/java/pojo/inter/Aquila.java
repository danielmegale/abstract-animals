package org.java.pojo.inter;

import org.java.pojo.abs.Animale;

public class Aquila extends Animale{

	@Override
	public void verso() {
		System.out.println("skreee");
		
	}

	@Override
	public void mangia() {
		System.out.println("Carne");
		
	}

}
