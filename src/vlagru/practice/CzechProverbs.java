package vlagru.practice;

import java.util.Arrays;
import java.util.Scanner;

public class CzechProverbs {

    public static void main(String[] args) {

        // A program in Czech generating Czech famous proverbs on the basis of what you are going to type in the log (1-5).

        System.out.println("Napis cele cislo od 1 do 5: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        // int input = Integer.parseInt(scanner.nextLine()); u int nebere cela cisla

        switch(input) {
            case "1":
                System.out.println("Sul nad zlato.");
                break;// kdyz vypustim break a citat pro '1' a '2' plati to same, co plati pro '2'
            case "2":
                System.out.println("Kdo chce psa biti, hul si vzdycky najde.");
                break;
            case "3":
                System.out.println("Kdo jinemu...");
                break;
            case "4":
                System.out.println("Devatero remesel...");
                break;
            case "5":
                System.out.println("Neni vsechno zlato, co se trpyti.");
                break;
            default: // it is optional
                System.out.println("Konec");
                break;
        }
    }

}



