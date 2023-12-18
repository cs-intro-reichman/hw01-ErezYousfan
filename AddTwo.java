/*
 * Adds two given integers and prints the result in a fancy way.
 */
public class AddTwo {
	public static void main(String[] args) {
		// Put your code here	
		int	var1 = Integer.parseInt(args[0]);
		int var2 = Integer.parseInt(args[1]);
		int sum = var1 + var2;
		System.out.println(var1 + " + " + var2 + " = " + sum);
	}
}
