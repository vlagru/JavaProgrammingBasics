package vlagru;

import java.util.Scanner;

public class AnUnusualFormular {

    public static void main(String[] args) {

        // How old are you? And do you like dogs or cats? Be careful of what you're gonna answer! :]

        System.out.println("Kolik ti je roku?");
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());

        System.out.println("Mas radsi kocky, nebo psy?");
        Scanner scanner2 = new Scanner(System.in);
        String jmeno = scanner.nextLine();

        if (input >= 18 && !"psy".equals(jmeno)) // nebere desetinna cisla
            /* >
             * <
             * =!
             * <=
             * >=
             * &&
             * ||
             * !
             * && and || nejdou dohromady
             */ {
            System.out.println("Muzes si podat prihlasku.");

        } else {
            System.out.println("Je nam lito, ale nelze si podat prihlasku.");

        }
    }
}





