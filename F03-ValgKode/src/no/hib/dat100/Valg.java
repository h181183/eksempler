package no.hib.dat100;

import java.util.Scanner;

public class Valg {

	public static void main(String[] args) {
		int antallStudenter;
		Scanner tastatur = new Scanner(System.in);
		System.out.print("Oppgi verdien til x: ");
		antallStudenter = tastatur.nextInt();
		if (antallStudenter < 5) {
			  System.out.println("Kurset er avlyst.");
		} else if (antallStudenter < 10) {
			   System.out.println("Kurset g�r med muntlig eksamen.");
		} else if (antallStudenter < 40) {
			   System.out.println("Kurset g�r med skriftlig eksamen.");
		} else {
			   System.out.println("Kurset deles i flere klasser.");
		}	
	}
}
