package vlagru;

import java.util.Arrays;
import java.util.Scanner;

public class DefiningASetOfNumbers {

    public static void main(String[] args) {

        // A program in Czech allowing you to define your own set of numbers.

        /*
		//int[] znamky;
		int[] znamky = new int[10];
		znamky[0] = 12;
		System.out.println(znamky[0]);
		*/

		/*
		int[] znamky = {1, 6, 8, 4, 5};
		System.out.println(znamky[2]);
		*/

		/*
		System.out.println("Zadejte celkove mnozstvi pole: ");
		Scanner total = new Scanner(System.in);
		int size = total.nextInt();

		int[] znamky = new int[size];
		Scanner input = new Scanner(System.in);
		System.out.println("Zadejte jednotlive cleny mnoziny: ");

		for (int i = 0 ; i < size ; i++) {

			int x = input.nextInt();

			znamky[i] = x;
		}
		System.out.print("Vase mnozina vypada nasledovne " + Arrays.toString(znamky));
		*/

        // jeste jedno procviceni

        System.out.println("Vlozte pocet prvku pole: ");
        Scanner pocet = new Scanner(System.in);
        int size = pocet.nextInt();
        int[] cleny = new int[size];
        System.out.println("Vlozte jednotlive cleny mnoziny: ");
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < size; i++) {
            int x = input.nextInt();
            cleny[i] = x;
        } System.out.println("Podoba Vasi mnoziny je nasledujici ... " + Arrays.toString(cleny));
    }

}



