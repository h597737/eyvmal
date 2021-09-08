package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oblig2 {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {

			String poengTekst = showInputDialog("Hvor mange poeng fikk du? ");
			int poeng = parseInt(poengTekst);
			
			if (poeng >= 0 && poeng <= 100) {

				if (poeng >= 40) {

					if (poeng >= 50) {

						if (poeng >= 60) {

							if (poeng >= 80) {

								if (poeng >= 90) {
									
									System.out.println(i + ": " + "Du fikk A");

								} else System.out.println(i + ": " + "Du fikk B");
								
							} else System.out.println(i + ": " + "Du fikk C");
							
						} else System.out.println(i + ": " + "Du fikk D");

					} else System.out.println(i + ": " + "Du fikk E");

				} else System.out.println(i + ": " + "Du fikk F");

			} else {
				showMessageDialog(null, "Ugyldig karakterpoeng. Tast inn på nytt ");
				i--;
			}

		}

	}

}
