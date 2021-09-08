package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oblig3 {

	public static void main(String[] args) {
		
		int sum = 1;
		
		String nTekst = showInputDialog("Tall ");
		int n = parseInt(nTekst);
		
		for (int i = 1; i <= n; i++) {
			
			sum *= i;
			
		}
		
		System.out.println(sum);
		
	}

}
