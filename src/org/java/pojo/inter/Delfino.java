package org.java.pojo.inter;

import org.java.pojo.Inuotante;
import org.java.pojo.abs.Animale;

public class Delfino  extends Animale implements Inuotante{

	@Override
	public void verso() {
		System.out.println("eeee-eee-eee");
		
	}

	@Override
	public void mangia() {
		System.out.println("Pesci");
		
	}

	public void nuota() {
		System.out.println("Sta nuotando");
		
	}

	@Override
	public void faiNuotare() {
		nuota();
		
	}

}
