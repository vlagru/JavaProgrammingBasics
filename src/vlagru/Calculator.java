package vlagru;

import java.util.Scanner;

public class Calculator {



        static double sum(double a, double b) {
            return a+b;
        }

        static double sub(double a, double b) {
            return a-b;

        }

        static double mul(double a, double b) {
            return a*b;
        }

        static double div(double a, double b) {
            return a/b;
        }

        public static void main(String[] args) {

        System.out.println("Vlozte dve cisla, s nimiz chcete pocitat: ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        System.out.println("Nasledujici operace lze provest\nPro scitani stisknete 1\nPro odcitani stisknete 2\n" +
                "Pro nasobeni stisknete 3\nPro deleni stisknete 4\n");
        System.out.println("Jakou operaci chcete s cisly provest: ");
        Scanner scanner1 = new Scanner(System.in);
        int choice = scanner1.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Vysledek je: " + sum(a, b));
                    break;
                }
                case 2: {
                    System.out.println("Vysledek je: " + sub(a, b));
                    break;
                }
                case 3: {
                    System.out.println("Vysledek je: " + mul(a, b));
                    break;
                }
                case 4: {
                    System.out.println("Vysledek je: " + div(a, b));
                    break;
                }
                default: {
                    System.err.println("Spatne zadana hodnota");
                }
            }

    }
}
