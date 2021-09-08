package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Math.round;

public class Oblig1 {

	public static void main(String[] args) {

		String bruttoTekst = showInputDialog("Brutto inntekt (uten mellomrom) ");
		int brutto = parseInt(bruttoTekst);

		System.out.println("Du tjener: " + brutto);

		if (brutto >= 164101) {

			if (brutto >= 230951) {

				if (brutto >= 580651) {

					if (brutto >= 934051) {

						System.out.println(round(brutto * 0.1452) + "kr skatt");

					} else
						System.out.println(round(brutto * 0.1152) + "kr skatt");

				} else
					System.out.println(round(brutto * 0.0241) + "kr skatt");

			} else
				System.out.println(round(brutto * 0.0093) + "kr skatt");

		} else
			System.out.println("Du betaler ikke trinnskatt");

	}

}
