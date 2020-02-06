package task_maven;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) throws NullPointerException{
		Scanner sc = new Scanner(System.in);
		Gift g = new Gift();
		boolean flag = true;
		do {
			// Read input from user
			System.out.println("Press 1 to add chocolate\nPress 2 to add sweet\n3 to stop adding candies");
			int choice = sc.nextInt();
			
			// Add item to gift
			switch(choice) {
			
			case 1:
				System.out.println("Enter varient name");
				String varient = sc.next() + sc.nextLine();
				System.out.println("Enter manufacturer name");
				String manufacturer = sc.nextLine();
				g.addCandy(new Chocolate(varient,manufacturer));
				break;
			case 2:
				System.out.println("Enter varient name");
				varient = sc.next() + sc.nextLine();
				System.out.println("Enter manufacturer name");
				manufacturer = sc.nextLine();
				g.addCandy(new Sweet(varient,manufacturer));
				break;
			case 3:
				flag = false;
				break;
			default:
				System.out.println("Enter a valid choice");
				break;
			}
		}while(flag);
		System.out.println("Number of items in the gift are : " + g.getNumberOfCandies());
		for(Candy c : g.getAllCandies()) {
			c.whoAmI();
		}
	}
}
