import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int choice;
		Scanner scanner = new Scanner(System.in);
		Complex1 c1 = new Complex1();
		Complex1 c2 = new Complex1();
		System.out.print("Enter real part of first number: ");
		c1.setReal1(scanner.nextInt());
		System.out.print("Enter imaginary part of first number: ");
		c1.setImg1(scanner.nextInt());
		System.out.print("Enter real part of second number: ");
		c2.setReal1(scanner.nextInt());
		System.out.print("Enter imaginary part of second number: ");
		c2.setImg1(scanner.nextInt());
		do {
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();
			switch(choice) {
			case 1:
				Complex1.addition(c1, c2);
				break;
			case 2:
				Complex1.subtraction(c1, c2);
				break;
			case 3:
				Complex1.multiplication(c1, c2);
				break;
			case 4:
				Complex1.division(c1, c2);
				break;
			}
		} while(choice < 5 && choice > 0);
		scanner.close();
	}

}
