/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
public class Triangle {
	public static void main(String[] args) {
		// Put your code here	
		int	var1 = Integer.parseInt(args[0]);
		int var2 = Integer.parseInt(args[1]);
		int	var3 = Integer.parseInt(args[2]);
		boolean isTriangle = var1 + var2 > var3;
		isTriangle = isTriangle && (var2 + var3 > var1);
		isTriangle = isTriangle && (var1 + var3 > var2);
		System.out.println(var1 + ", " + var2 + ", " + var3 + ": " + isTriangle);
	}
}
