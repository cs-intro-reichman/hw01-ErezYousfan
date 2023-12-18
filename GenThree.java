/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
import java.util.concurrent.ThreadLocalRandom;
public class GenThree {
	public static void main(String[] args) {
		// Put your code here	
		int min = Integer.parseInt(args[0]);
		int max = Integer.parseInt(args[1]);
		int diff = max - min;
		int first = ThreadLocalRandom.current().nextInt(min, max);
		int second = ThreadLocalRandom.current().nextInt(min, max);
		int third = ThreadLocalRandom.current().nextInt(min, max);
		int minnum = Math.min(first, second);
		minnum = Math.min(minnum, third);
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		System.out.println("The minimal generated number was " + minnum);
	}
}
