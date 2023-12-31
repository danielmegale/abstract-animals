package org.java;

import org.java.pojo.Inuotante;
import org.java.pojo.Ivolante;
import org.java.pojo.inter.Aquila;
import org.java.pojo.inter.Cane;
import org.java.pojo.inter.Delfino;
import org.java.pojo.inter.Passerotto;

public class Main {
	public static void main(String[] args) {
		 	Cane cane = new Cane();
	        Passerotto passerotto = new Passerotto();
	        Aquila aquila = new Aquila();
	        Delfino delfino = new Delfino();
	        
	        cane.dormi();
	        cane.verso();
	        cane.mangia();
	        System.out.println("-----------------------------");
	        passerotto.dormi();
	        passerotto.verso();
	        passerotto.mangia();
	        faiVolare(passerotto);
	        System.out.println("-----------------------------");
	        aquila.dormi();
	        aquila.verso();
	        aquila.mangia();
	        faiVolare(aquila);
	        System.out.println("-----------------------------");
	        delfino.dormi();
	        delfino.verso();
	        delfino.mangia();
	        faiNuotare(delfino);
	        
	}
	public static void faiVolare(Ivolante animale) {
		animale.faiVolare();	         	
	} 
	public static void faiNuotare(Inuotante animale){
		animale.faiNuotare();
	}
}
