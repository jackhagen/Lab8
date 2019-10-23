//@author Jack Hagen

package co.grandcircus;

import java.util.Scanner;

public class Lab8 {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		int x = 1;
		int userInput = 0;
		String data = "";
		String cont = "";

		String[] studentName = { "Colton", "Aggie", "Jack", "Sarah", "Wolfgang", "Andreas", "Siddhartha", "Valeria",
				"Antonio", "Hilde" };

		String[] hometown = { "Palo Alto, CA", "Detroit, MI", "Traverse City, MI", "Cartagena, Colombia",
				"Medellin, Colombia", "Bogota, Colombia", "Moscow, Russia", "Las Vegas, NV", "Marquette, MI",
				"Macondo, Colombia" };

		String[] favFood = { "falafel", "plantains", "tacos", "shawarma", "hummus", "pho", "ramen", "pizza",
				"kale chips", "naan" };

		do {

			System.out.print("Welcome to our Java class. Which student would you like to learn more about?");
			System.out.println("(enter a number 1-10): ");
			userInput = scnr.nextInt();
			scnr.nextLine();

			System.out.println("Student " + userInput + " is " + studentName[userInput - 1] + ". "
					+ "What would you like to know about " + studentName[userInput - 1] + "?"
					+ " (enter 'hometown' or 'favorite food'):");

			data = scnr.nextLine();

			if (data.equalsIgnoreCase("hometown")) {
				data = Validator.getString(scnr, studentName[userInput - 1] + " is from " + hometown[userInput - 1]
						+ ". " + "Would you like to know more? (y/n): ");
				System.out.println();

			} else if (data.equalsIgnoreCase("favorite food")) {
				data = Validator.getString(scnr, studentName[userInput - 1] + "'s favorite food is "
						+ favFood[userInput - 1] + ". " + "Would you like to know more? (y/n): ");
				System.out.println();
			} else {
				data = Validator.getString(scnr,
						"That data does not exist. Please try again. (enter or hometown or favorite food: ");
			}

			while (data.equals("no") || data.equals("no")) {

				System.out.println("Thanks!");
				break;
			}

		} while ((userInput > 0 || userInput < 11) && !data.equals("no"));
		scnr.close();
	}
}
