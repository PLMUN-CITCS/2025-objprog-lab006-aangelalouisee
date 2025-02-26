import java.util.Scanner;
public class CircleCalculator {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the radius of the circle: "); //lets the user input a radius
	double radius = input.nextDouble(); //reads user input 
	double area = Math.PI * Math.pow(radius, 2); //calculate area
	double circumference = 2 * Math.PI * radius; //calclulate circumference
	
	//display formatted output
	System.out.printf("Radius: %.2f%n", radius);
	System.out.printf("Area: %.2f%n", area);
	System.out.printf("Circumference: %.2f%n", circumference);

	input.close(); //close the scanner
    }
}
