package vlagru;

import java.util.Scanner;

public class PhoneBillCalculator {

    public static void main(String[] args) {

        /*
        * A simple program in Czech calculating a phone bill. There are two of them.
        * The one in brackets is easier to make compared the one which is not.
        */


        /*

		int pocetMinut;
		double ucetZaTelefon;
		Scanner input = new Scanner(System.in);

		System.out.println("Vlozte pocet minut, ktere jste provolali: ");
		pocetMinut = input.nextInt();

		if (pocetMinut <= 60) {
			ucetZaTelefon = 14;
		}

		else
		{
			pocetMinut = pocetMinut - 60;
			ucetZaTelefon = 14 + (double) (pocetMinut * 0.12);
		};

		System.out.println("\n\t\t\tUcet za telefon v poctu provolanych minut je: " + ucetZaTelefon + " Kc");

	    */

        int mezistatni, mezinarodni;
        double ucet;
        Scanner input = new Scanner(System.in);

        System.out.println("Vlozte pocet provolanych mezistatnich minut: ");
        mezistatni = input.nextInt();
        System.out.println("Vlozte pocet provolanych mezinarodnich minut: ");
        mezinarodni = input.nextInt();

        if (mezistatni == 0) {
            ucet = 0;
        }
        else if (mezistatni <=60) {
            ucet = 14;
        }
        else {
            mezistatni = mezistatni - 60;
            ucet = 14 + (double)(mezistatni * 0.12);
        }
        if (mezinarodni == 0) {
            ucet = ucet;
        }
        else if (mezinarodni <= 12) {
            ucet = ucet + 12;
        }
        else {
            mezinarodni = mezinarodni - 12;
            ucet = 12 + (double)(mezinarodni * 2.34);
        }
        System.out.println("\n\t\t\tUcet za celkovy pocet provolanych minut:" +ucet+ " Kc");

    }
}
