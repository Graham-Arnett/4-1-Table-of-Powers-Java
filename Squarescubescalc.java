package squarescubes;
import java.util.Scanner;

public class Squarescubescalc {

	public static void main(String[] args) {
		System.out.println("Welcome to the Squares and Cubes table");
		Scanner scanner = new Scanner(System.in);
		String choice;
		
		do 
		{
			System.out.print("Enter an integer: ");
			int entry = scanner.nextInt();
			
			System.out.println("Number\tSquared\tCubed");
			System.out.println("======\t=======\t=====");
			
			for (int i = 1; i <= entry; i++) 
			{
				//number is obviously just i, squared is i*i, cubed is i*i*i
				int square = i * i;
				int cube = i * i * i;
				System.out.println(i + "\t" + square + "\t" + cube);
			}
			
			
			System.out.print("Would you like to go again? (y/n): ");
			choice = scanner.next();
		}while(choice.equalsIgnoreCase("y"));
	}

}
