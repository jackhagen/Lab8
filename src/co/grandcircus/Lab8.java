//@author Jack Hagen

package co.grandcircus;

import java.util.Scanner;

public class Lab8 {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

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

		System.out.print("Welcome to our Java class. Which student would you like to learn more about?");
		System.out.println("(enter a number 1-10): ");
		userInput = scnr.nextInt();

		while (cont.equals("no") || (cont.equals("no"))) {
			System.out.println("Thanks!");
			break;
		}

		do {

			try {
				System.out.println("Student " + userInput + " is " + studentName[userInput - 1] + ". "
						+ "What would you like to know about " + studentName[userInput - 1] + "?"
						+ " (enter 'hometown' or 'favorite food'):");
				System.out.println();
				data = scnr.nextLine();

			} catch (Exception e) {
				System.out.println("That student does not exist. Please try again. (enter a number 1-10):");
				System.out.println();
				userInput = scnr.nextInt();

			}

			do {
				System.out.println("Enter 'hometown or 'favorite food': ");
				data = scnr.nextLine();

				if (data.equalsIgnoreCase("hometown")) {
					cont = Validator.getString(scnr, studentName[userInput - 1] + " is from " + hometown[userInput - 1]
							+ ". " + "Would you like to know more? (y/n): ");
					data = scnr.nextLine();

				} else if (data.equalsIgnoreCase("favorite food")) {
					cont = Validator.getString(scnr, studentName[userInput - 1] + "'s favorite food is "
							+ favFood[userInput - 1] + ". " + "Would you like to know more? (y/n): ");
				} else {
					data = Validator.getString(scnr,
							"That data does not exist. Please try again. (enter or hometown or favorite food: ");
				}

				if (data.equalsIgnoreCase("hometown")) {
					cont = Validator.getString(scnr, studentName[userInput - 1] + " is from " + hometown[userInput - 1]
							+ ". " + "Would you like to know more? (y/n): ");

				}

			} while (cont.equals("y") || (cont.equals("yes")));

		} while (userInput > 0 || userInput < 11);
		scnr.close();
	}
}
