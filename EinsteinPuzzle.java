package Package;
import java.util.*;
public class EinsteinPuzzle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("We are going to play Einstein's favorite game. Ask your friend to write down any three-digit number,\n emphasizing that the first and last" + 
				"digits must differ by at least two. ");
		int number = input.nextInt();
		int onesPlace1 = number%100%10;
		int tensPlace1 = (number - onesPlace1)%100/10;
		int hundredsPlace1 = (number - onesPlace1 - tensPlace1)/100;
		int reverse1 = (onesPlace1*100+tensPlace1*10+hundredsPlace1);
		System.out.println(number);
		System.out.println(reverse1);
		int difference = Math.abs(number-reverse1);
		System.out.println(difference);
		int onesPlace2 = difference%100%10;
		int tensPlace2 = (difference - onesPlace2)%100/10;
		int hundredsPlace2 = (difference - onesPlace2 - tensPlace2)/100;
		int reverse2 = (onesPlace2*100+tensPlace2*10+hundredsPlace2);
		System.out.println(reverse2);
		System.out.println(difference+reverse2);
		main(null);
	}

}
