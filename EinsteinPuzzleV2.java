import java.util.*;

public class EinsteinPuzzleV2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("We are going to play Einstein's favorite game. Ask your friend to write down any three-digit number,\n emphasizing that the first and last digits must differ by at least two.");

        int number = input.nextInt();
        System.out.println("Original:" + number);

        int reversed = reverser(number);
        System.out.println("Reversed:" + reversed);

        int difference = Math.abs(number - reversed);
        System.out.println("Difference:" + difference);

        int reverseDiff = reverser(difference);
        System.out.println("Reverse Difference:" + reverseDiff);
        System.out.println("Sum of Difference & Reverse Difference:" + (reverseDiff+difference));

        System.out.println("\n--- RESTART ---\n");
        main(null);
    }

    public static int reverser(int num) {
        int onesPlace = num % 10;
        int tensPlace = num % 100 / 10;
        int hundredsPlace = num / 100;
        int reverse = (onesPlace * 100 + tensPlace * 10 + hundredsPlace);
        return reverse;
    }
}
