package app;
import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Input a tempurature in Fahrenheit");
		double temp1 = scnr.nextDouble();
		double temp1f = ((temp1-32)*5) / 9;
		System.out.print(temp1+" degrees Fahrenheit is equivalent to ");
		System.out.printf("%.1f",temp1f);
		System.out.println(" degrees Celsius.");
		
		System.out.println("Input a tempurature in Celsius");
		double temp2 = scnr.nextDouble();
		double temp2c = ((temp2*9)/5) +32;
		System.out.print(temp2+" degrees Celsius is equivalent to ");
		System.out.printf("%.1f", temp2c );
		System.out.println(" degrees Fahrenheit.");

	}

}
