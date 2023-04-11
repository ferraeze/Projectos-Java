package myfirstjava;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hi! What's your name?");
		String name= scanner.nextLine();
		
		System.out.println("Hi! " + name);
		
		System.out.println("What's your favourite food?");
		String food= scanner.nextLine();
		System.out.println(food+ "?"+ " So tasty!");
		
		System.out.println("Where do you live?");
		String location= scanner.nextLine();
		
		System.out.println("Nice! I use to live there, near of "+ location);
		
		
		System.out.println("What's sports do you play");
		String sports = scanner.nextLine();
		int year= 1994;
		System.out.println("I use to play " + sports+" as well" +" in "+ year);
		
		System.out.println("When do you born?");
		int bornyear= scanner.nextInt();
		System.out.println(bornyear+"? "+" That was a great year!");
		
	}

}
