package org.java.pojo.inter;

import org.java.pojo.Ivolante;
import org.java.pojo.abs.Animale;

public class Passerotto extends Animale implements Ivolante {

	@Override
	public void verso() {
			System.out.println("cip");
	}

	@Override
	public void mangia() {
	
		System.out.println("Semi");
	}
	public void vola() {
		System.out.println("Sta volando");
		
	}

	@Override
	public void faiVolare() {
		vola();
		
	}

}
