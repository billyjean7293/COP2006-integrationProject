package main;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

//Billy Jean Baptiste
//Integration project for COP 2006. Everything we've learned in COP2001 course in.
//This is a introduction to a game with slight similarities to black jack.

//8 primitive data types
/*byte:  8-bit, helpful for saving memory, from -128 to 127 
short: 16-bit, with a value from -32,768 to 32,767. Helpful for memory
int: 32-bit, with a value from -231 to 231-1. Supports arithmetic operations
long: 64-bit, use when you need a range of values wider than those provided by int.
float: single-precision 32-bit, never be used for precise values
double: 64-bit IEEE 754 floating point. 
boolean: true or false values. Used for conditions
char: a single 16-bit Unicode character.
 */

/* 
A variable is a stored location of memory that can contain different types of data types.
The term scope means a defined variable that can be located in a function or method and if out of scope, it cannot be accessed.
Precedence order is when two operators share an operand, the operator with the higher precedence goes first.
There's a table to show which operators take precedence. */

//Inheritance is beneficial in programming because it allows us to reuse code without complication.
//Polymorphism is the ability of an object to take on many forms, like when a parent class reference is used to refer to a child class object.
/**
 * @author billyjeanbaptiste
 *
 */
public class Main {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Multidimensional array for every (suit and rank) card in the deck
		String SuitAndRankArray[][] = new String[5][13];
		/// multidimensional array for hearts
		SuitAndRankArray[0][0] = "ace of heart";
		SuitAndRankArray[0][1] = "two of hearts";
		SuitAndRankArray[0][2] = "three of hearts";
		SuitAndRankArray[0][3] = "four of hearts";
		SuitAndRankArray[0][4] = "five of hearts";
		SuitAndRankArray[0][5] = "six of hearts";
		SuitAndRankArray[0][6] = "seven of hearts";
		SuitAndRankArray[0][7] = "eight of hearts";
		SuitAndRankArray[0][8] = "nine of hearts";
		SuitAndRankArray[0][9] = "ten of hearts";
		SuitAndRankArray[0][10] = "jack of hearts";
		SuitAndRankArray[0][11] = "queen of hearts";
		SuitAndRankArray[0][12] = "King of hearts";
		/// multidimensional array for diamonds
		SuitAndRankArray[1][0] = "ace of diamonds";
		SuitAndRankArray[1][1] = "two of diamonds";
		SuitAndRankArray[1][2] = "three of diamonds";
		SuitAndRankArray[1][3] = "four of diamonds";
		SuitAndRankArray[1][4] = "five of diamonds";
		SuitAndRankArray[1][5] = "six of diamonds";
		SuitAndRankArray[1][6] = "seven of diamonds";
		SuitAndRankArray[1][7] = "eight of diamonds";
		SuitAndRankArray[1][8] = "nine of diamonds";
		SuitAndRankArray[1][9] = "ten of diamonds";
		SuitAndRankArray[1][10] = "jack of diamonds";
		SuitAndRankArray[1][11] = "queen of diamonds";
		SuitAndRankArray[1][12] = "king of diamonds";
		/// multidimensional array for spades
		SuitAndRankArray[2][0] = "ace of spades";
		SuitAndRankArray[2][1] = "two of spades";
		SuitAndRankArray[2][2] = "three of spades";
		SuitAndRankArray[2][3] = "four of spades";
		SuitAndRankArray[2][4] = "five of spades";
		SuitAndRankArray[2][5] = "six of spades";
		SuitAndRankArray[2][6] = "seven of spades";
		SuitAndRankArray[2][7] = "eight of spades";
		SuitAndRankArray[2][8] = "nine of spades";
		SuitAndRankArray[2][9] = "ten of spades";
		SuitAndRankArray[2][10] = "jack of spades";
		SuitAndRankArray[2][11] = "queen of spades";
		SuitAndRankArray[2][12] = "King of spades";
		/// multidimensional array for clubs
		SuitAndRankArray[3][0] = "ace of clubs";
		SuitAndRankArray[3][1] = "two of clubs";
		SuitAndRankArray[3][2] = "three of clubs";
		SuitAndRankArray[3][3] = "four of clubs";
		SuitAndRankArray[3][4] = "five of clubs";
		SuitAndRankArray[3][5] = "six of clubs";
		SuitAndRankArray[3][6] = "seven of clubs";
		SuitAndRankArray[3][7] = "eight of clubs";
		SuitAndRankArray[3][8] = "nine of clubs";
		SuitAndRankArray[3][9] = "ten of clubs";
		SuitAndRankArray[3][10] = "jack of clubs";
		SuitAndRankArray[3][11] = "queen of clubs";
		SuitAndRankArray[3][12] = "king of clubs";

		boolean continueProgram;
		continueProgram = true && !false;
		while (continueProgram) {

			// Code that uses random number generators to be used to create a random output
			// for card suits and ranks
			// To be used later in code
			Random randomNumber = new Random();

			// Variables to hold the values for face cards to be used later
			int cardValue = 5;
			int jack = 11;
			int queen = 12;
			int king = 13;
			double ace[] = { 1.0, 14.0 };
			boolean blackJack = true;

			// The rules in Black Jack is to not go over 21. That will never change.
			final int BLACK_JACK = 21;

			/*
			 * Sting arrays to hold rank values in a deck of cards. NUll as zeroth term
			 * cause there's no zero in a deck Easier to match ranks with corresponding
			 * indexes
			 */
			String[] ranksInDeck = { null, "ace", "two", "three", "four", "five", "six", "seven", "eight", "nine",
					"ten", "jack", "queen", "king" };
			// Sting ArrayList to hold suit values in a deck of cards. Added method to add
			// suits
			ArrayList<String> suitsInDeck = new ArrayList<String>();
			suitsInDeck.add("hearts");
			suitsInDeck.add("diamonds");
			suitsInDeck.add("spades");
			suitsInDeck.add("clubs");

			// Greeting message that introduces the game and greets user. Asks for age and
			// name.

			while (true) {
				System.out.println("Hola! Guten tag! Bonjour! Nǐn hǎo! Olá!");
				break;
				// This break just stops the while loop from an infinite print statement loop.
				// I understand this is bad programming. This is to satisfy requirements
			}
			String hello = "And of course, hello! ";
			String greeting = "And welcome to my integration project. ";

			if (hello.equals(greeting)) {
				System.out.println(greeting + hello);
			} else {
				System.out.println(hello + greeting);
			}

			// Cannot use == comparing string Objects, it will always be false.

			String tutorialMessage = new String("This is a quick informational tutorial to a game,");
			String tutorialMessage2 = new String("similar to black jack called 'Kazino'");

			System.out
					.println(tutorialMessage.compareTo(tutorialMessage2) < 0 ? tutorialMessage + " " + tutorialMessage2
							: tutorialMessage2 + " " + tutorialMessage);

			Scanner scanner = new Scanner(System.in);
			System.out.println("What's your first name? ");
			String userName = scanner.nextLine();

			try {
				System.out.println("whats your age? ");
				int userAge = scanner.nextInt();
				getDisplayNameAndAge(userName, userAge);
				Player newPlayer = new Player(userName, userAge);

				System.out.println(newPlayer.getName());

				/*
				 * A created method call that that uses the user's name and age as arguments to
				 * display a message, whether the user is old enough to play or not
				 */

				// If user is too young or has an unrealistic age, the program terminates. If
				// not, it continues
				if ((userAge < 13) || (userAge > 120)) {
					continueProgram = false;

				} else {
					System.out.println(
							"Let's start with the very basics." + "\nHow many cards are in a deck? Enter a number ");
					int cardsInDeck = 52;
					int guessedCardsInDeck = scanner.nextInt();
					String message;

					// Ternary that prints a message depending if user get question correct
					message = (cardsInDeck == guessedCardsInDeck) ? "Correct! There's 52 cards in a deck"
							: "That's incorrect. I see we're going to have to go through the very basic of cards lol.";
					System.out.println(message);

					// Code that accepts a char for user's input y for "yes" and n for "no"
					System.out.println("Are you familiar with the game Black Jack?: y or n? ");
					char userInput = scanner.next().charAt(0);
					char yesAsInput = 'y';
					char noAsInput = 'n';

					if (userInput == yesAsInput) {
						System.out.println("Great, so you should be familiar with the concept in this" + " game.");
					} else if (userInput == noAsInput) {
						System.out.println("Lets go over the basic, basics.");
						System.out.println(
								"There are four different suits and there are 13 different ranks, for example one is a "
										+ SuitAndRankArray[randomNumber.nextInt(3)][randomNumber.nextInt(12)]
										+ "\nFrom ascendng order, you have " + ranksInDeck[1] + ", " + ranksInDeck[2]
										+ " through " + ranksInDeck[10]);
						System.out.print("Then you have suits, ");
						for (int i = 0; i < suitsInDeck.size(); i++) {
							if (i == 3)
								continue;
							// Continue keyword does not include the one iteration indicated in the loop
							// when it reaches 3
							// It will not print the word "clubs", which is the 3rd index/ fourth element in
							// the suitsInDeck array
							System.out.println(suitsInDeck.get(i) + ", ");

						}
						System.out.print("and lastly, clubs. So every cards has a combination of a suit and a rank.");

						System.out
								.print("\nFor example, " + ranksInDeck[randomNumber.nextInt(12)] + " of " + "hearts.");

					} else {
						System.out.println("Lets go over the basic, basics.");
						System.out.println("There are four different suits ");
						for (String suitCards : suitsInDeck) {
							System.out.println(suitCards);
						}

						System.out.println("and there are 13 different ranks, for example one is a "
								+ SuitAndRankArray[randomNumber.nextInt(3)][randomNumber.nextInt(12)]
								+ "\nFrom ascendng order, you have " + ranksInDeck[1] + ", " + ranksInDeck[2]
								+ " through " + ranksInDeck[10]);
						System.out.println("Then you have suits, ");
						int j = suitsInDeck.size() - 1;
						while (j >= 0) {
							System.out.print(suitsInDeck.get(j) + ", ");
							j--;
						}

						System.out.print("so every cards has a combination of a suit and a rank.");

						System.out.print(
								"\nFor example, " + ranksInDeck[randomNumber.nextInt(12)] + " of " + "diamonds.");

					}

					System.out.println("\nIn Black Jack, if your first two cards added are " + BLACK_JACK + ", "
							+ "you get Black Jack!");
					System.out.println("In Black Jack, all  face cards are numerically valued at 10");
					System.out.println("But in 'Kazino', face cards are numerically valued in ascending order.");
					System.out.println("For instance, a Jack is " + jack + ".");
					System.out.println("A Queen is valued as " + queen + ".");
					System.out.println("A king is valued as " + king + ".");
					System.out.println("And an ace is value " + ace[0] + " and also " + ace[1] + ".");
					System.out.print("Let's do a quick review to make sure you understand \n" + "or paying attention.");
					System.out.println("What is the value of an king?" + " Enter a number" + "\n PRESS 1 for 10"
							+ "\n PRESS 2 for 13" + "\n PRESS 3 for 9" + "\n PRESS 4 none of the above");

					int userChoice = scanner.nextInt();

					switch (userChoice) {
					case 1:
						System.out.println("Close, but Inccorect");
						break;
					case 2:
						System.out.println("Correct!");
						break;
					case 3:
						System.out.println("Inccorect. Let's pay attention!");
						break;
					case 4:
						System.out.println("Incorrect. Let's pay attention!");
					default:
						System.out.println("That's is an invalid entry.");
						break;
					}

					System.out.println(
							"Alright, this may be long so it's important to pay attention. \nJust like in black jack, we can add cards togethger. "
									+ "\nIn black jack, if your two cards equal 21, \nwe say that it black jack is "
									+ blackJack + ".");

					System.out.println(
							"Instead 21 as the limit, the limit is 14. You cannot add to cards together that's over 14.");
					System.out.println("With that, we can add a king and an ace together and get "
							+ getAddition((int) ace[0], king) + "\nbecuase a king is 13 and an ace is 1.");

					// Loop that ask user for input. Does not terminate until user answers correctly
					System.out.println("Alright, let's see if you're still payiing attention");
					int guessedCardLimit;
					do {
						System.out.println("What's the is the limit when adding in Kazino?");
						guessedCardLimit = scanner.nextInt();
					} while (guessedCardLimit != 14);
					scanner.close();

					System.out.println("So, since in this game each card has a numerical value \n"
							+ "you can add, subtract, multiple or divide them together,\n"
							+ "but you have to be explicit.\n" + "Remember, you're only limited from 1 to 14.");

					System.out.println("We can subtract an ace from a king and get "
							+ Math.abs(getSubstraction(ace[0], (double) king)) + " or "
							+ Math.abs(getSubstraction((int) ace[1], king)));
					// casting ace variable from double to int because method accepts int arguments
					// Method calls to perform math operations and return results
					System.out.printf(
							"When we divide, we have to be explicit and we can only divide divisible numbers together,"
									+ "%nmeaning, you have to get a whole number when dividing."
									+ "%nSo dividing an ace at 14 and a 2 together can work, because you get %.2f",
							getDivision((int) ace[1], (int) 2));
					System.out.println("\nBut dividing a queen and a king won't work because you get a remainder of "
							+ queen % 13 + ".");
					System.out.println("So when mulitplying, it should be simple, but the operation cannot go over 14, "
							+ "\nso a 2 and 7 is fine, but a 2 and an 8 is illegal because that's "
							+ getMultiplication(2, 8));
					System.out
							.println("Just some obvious concepts. You can always the add the same card values together,"
									+ "\nonly if from it's an ace to to 7. So a 5 of heart and a 5 of ace can easily be added together to get "
									+ (cardValue += cardValue));
					System.out.println(
							"One last trick to the game is that you're allowed to add three cards together if applicable"
									+ "\nto add to a card you have in your hand. So for instance, if you have a king, valued at 13, an ace and a 8,"
									+ "\nand a 3 was played, you can add your cards together to and a ");

					System.out.print("\nWell, that's all for now. Please stay tune for the next version!");

					continueProgram = false;
				}
			} catch (InputMismatchException e) {
				System.out.println("We're going to start over until you enter a valid age. Please enter a valid age!");
			}
		}

	}

	/**
	 * CAPitalize the input name, and displaying message method Header that uses
	 * doesn't use a return type, but prints a message for user Header uses name and
	 * age as parameters
	 *
	 * @param name
	 * @param age
	 */
	public static void getDisplayNameAndAge(String name, int age) {
		String toCapitalize = name.substring(0, 1).toUpperCase();
		if (age < 13) {
			System.out.println("Sorry, you're not old enould to play!");
		} else if (age > 120) {
			System.out.println("Are you really this old?. Please restart and enter your real age");

		} else {
			System.out.println(
					"Hello, " + toCapitalize + name.substring(1) + ". You're " + age + " yours old! Pretty old.");

		}

	}

	// methods for addition, subtraction, multiplication and division
	/**
	 * @param card1
	 * @param card2
	 * @return the sum of the two parameters of int data type
	 */
	public static int getAddition(int card1, int card2) {
		int result = (card1 + card2);
		return result;
	}

	/**
	 * @param card1
	 * @param card2
	 * @param card3
	 * @return the sum of the three parameters of int data type
	 */
	public static int getAddition(int card1, int card2, int card3) {
		int result = (card1 + card2 + card3);
		return result;
	}

	/**
	 * @param card1
	 * @param card2
	 * @return the sum of the two parameters of double data type
	 */
	public static double getAddition(double card1, double card2) {
		double result = (card1 + card2);
		return result;
	}

	/**
	 * @param card1
	 * @param card2
	 * @return the difference of the two parameters of int data type
	 */
	public static int getSubstraction(int card1, int card2) {
		int result = (card1 - card2);
		return result;
	}

	/**
	 * @param card1
	 * @param card2
	 * @return the difference of the two parameters of double data type
	 */
	public static double getSubstraction(double card1, double card2) {
		double result = (card1 - card2);
		return result;
	}

	/**
	 * @param card1
	 * @param card2
	 * @return the quotient of the two parameters of double data type
	 */
	public static double getDivision(double card1, double card2) {
		double result = (card1 / card2);
		return result;
	}

	/**
	 * @param card1
	 * @param card2
	 * @return the product of two parameters of int data type
	 */
	public static int getMultiplication(int card1, int card2) {
		int result = (card1 * card2);
		return result;

	}

	/**
	 * @param card1
	 * @param card2
	 * @return the product of the two parameters of double data type
	 */
	public static double getMultiplication(double card1, double card2) {
		double result = (card1 * card2);
		return result;
	}

}
