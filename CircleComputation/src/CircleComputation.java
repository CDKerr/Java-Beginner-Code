import java.util.Scanner;

public class CircleComputation {
	public static void main (String[] args){
		
		Scanner in = new Scanner(System.in);
		double radius;
		
		System.out.println("Enter the radius");
		
		radius = in.nextDouble();
		
		double area = Math.PI*(radius*radius);
		
		double circ = Math.PI*(radius*2);
		
		System.out.println("The radius of the circle is " + radius + ", the area is " + area + " and the" +
				" circumference is " + circ);
	}
}
