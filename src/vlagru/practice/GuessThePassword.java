package vlagru.practice;

import java.util.Scanner;

public class GuessThePassword {

    public static void main(String[] args) {

        // Until a password is guessed correctly, one will end up cycling through a loop for eternity!!!

        Scanner input = new Scanner (System.in);
        String password = "mon";
        String guess;

        do {
            System.out.println("Guess the password: ");
            guess = input.nextLine();

        } while (!guess.equals(password));

        System.out.println("You've done it!!!");
        input.close();
    }

}



