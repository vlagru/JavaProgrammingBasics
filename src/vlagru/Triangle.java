package vlagru;

public class Triangle {

    public static void main(String[] args) {
        // A program generating a triangle.
        int i = 9;
        while (i >= 0) {
            int k = i;
            while (k >= 0) {
                System.out.print(k + " ");
                k--;
            }
            System.out.println();
            i--;
        }
    }
}
