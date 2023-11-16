package org.java.pojo.inter;

import org.java.pojo.Ivolante;
import org.java.pojo.abs.Animale;

public class Aquila extends Animale implements Ivolante{

	@Override
	public void verso() {
		System.out.println("skreee");
		
	}

	@Override
	public void mangia() {
		System.out.println("Carne");
		
	}

	public void vola() {
		System.out.println("Sta volando");
		
	}

	@Override
	public void faiVolare() {
		vola();
		
	}
}
