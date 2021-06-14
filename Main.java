package main;

import java.util.Random;
import java.util.Scanner;

//Billy Jean Baptiste
//Integration project for COP 2006. Everything we've learned so far.
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

public class Main {

	public static void main(String[] args) {

		boolean continueProgram;
		continueProgram = true && !false;
		while (continueProgram) {
			
			//Code that uses random number generators to be used to create a random output for card suits and ranks
			//To be used later in code
			Random randomSuits = new Random();
			int randomNumbers = randomSuits.nextInt(3);

			Random randomRanks = new Random();
			int randomNumbers2 = randomRanks.nextInt(12);
			
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
			// Sting arrays to hold suit values in a deck of cards
			String[] suitsInDeck = { "hearts", "diamonds", "spades", "clubs" };

			
			//Greeting message that introduces the game and greets user. Asks for age and name.
			
			while(true) {
				System.out.println("Hola! Guten tag! Bonjour! Nǐn hǎo! Olá!");
				break;
				//This break just stops the while loop from an infinite print statement loop.
				//I understand this is bad programming. This is to satisfy requirements
			}
			String hello = new String("And of course, hello! ");
			String greeting = new String("And welcome to my integration project. ");
			
			if(hello.equals(greeting)) {
				System.out.println(greeting + hello);
			}else {System.out.println(hello + greeting);}
			
			//Cannot use == comparing string Objects, it will always be false. 
			
			String tutorialMessage = new String("This is a quick informational tutorial to a game,");
			String tutorialMessage2 = new String("similar to black jack called 'Kazino'");
			
			System.out.println(tutorialMessage.compareTo(tutorialMessage2) < 0 ? tutorialMessage +  " " + tutorialMessage2 :
				tutorialMessage2 +  " " + tutorialMessage );

			Scanner scanner = new Scanner(System.in);
			System.out.println("What's your first name? ");
			String userName = scanner.nextLine();

			System.out.println("whats your age? ");
			int userAge = scanner.nextInt();


			/* A created method call that that uses the user's name and age as arguments to display a
			 * message, whether the user is old enough to play or not */
			getDisplayNameAndAge(userName, userAge);

			
			//If user is too young or has an unrealistic age, the program terminates. If not, it continues
			if ((userAge < 13) || (userAge > 120)) {
				continueProgram = false;

			} else {
				System.out.println(
						"Let's start with the very basics." + "\nHow many cards are in a deck? Enter a number ");
				int cardsInDeck = 52;
				int guessedCardsInDeck = scanner.nextInt();
				String message;
				
				
				//Ternary that prints a message depending if user get question correct
				message = (cardsInDeck == guessedCardsInDeck) ? "Correct! There's 52 cards in a deck"
						: "That's incorrect. I see we're going to have to go through the very basic of cards lol.";
				System.out.println(message);

				//Code that accepts a char for user's input y for "yes" and n for "no"
				System.out.println("Are you familiar with the game Black Jack?: y or n? ");
				char userInput = scanner.next().charAt(0);
				char yesAsInput = 'y';
				char noAsInput = 'n';

				
				if (userInput == yesAsInput) {
					System.out.println("Great, so you should be familiar with the concept in this" + " game.");
				} else if (userInput == noAsInput) {
					System.out.println("Lets go over the basic, basics.");
					System.out
							.println("There are four suits and there are 13 ranks." + "\nFrom ascendng order, you have "
									+ ranksInDeck[1] + ", " + ranksInDeck[2] + " through " + ranksInDeck[10]);
					System.out.print("Then you have suits, ");
					for (int i = 0; i <suitsInDeck.length ; i++) {
						if (i == 3)
								continue;
				//Continue keyword does not include the one iteration indicated in the loop when it reaches 3
				//It will not print the word "clubs", which is the 3rd  index/ fourth element in the suitsInDeck array
						System.out.println(suitsInDeck[i] + ", ");
					
					}
					System.out.print("and lastly, clubs. So every cards has a combination of a suit and a rank.");
			
					System.out.print("\nFor example, "
							+ ranksInDeck[randomNumbers2] + " of " + suitsInDeck[randomNumbers]+".");

					
				} else {
					System.out.println("Lets go over the basic, basics.");
					System.out
							.println("There are four suits and there are 13 ranks." + "\nFrom ascendng order, you have "
									+ ranksInDeck[1] + ", " + ranksInDeck[2] + " through " + ranksInDeck[10]);
					System.out.println("Then you have suits, ");
					int j = suitsInDeck.length - 1;
					while ( j >= 0) {
						System.out.print(suitsInDeck[j] + ", ");
						j--;
				}
					
					System.out.print("so every cards has a combination of a suit and a rank.");
			
					System.out.print("\nFor example, "
							+ ranksInDeck[randomNumbers2] + " of " + suitsInDeck[randomNumbers]+".");

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
					System.out.println("Invalid.");
					break;
				}
				
				System.out.println(
						"Alright, this may be long so it's important to pay attention. \nJust like in black jack, we can add cards togethger. "
								+ "\nIn black jack, if your two cards equal 21, \nwe say that it black jack is "
								+ blackJack + ".");
				
				System.out.println(
						"Instead 21 as the limit, the limit is 14. You cannot add to cards together that's over 14.");
				System.out.println("With that, we can add a king and an ace together and get "
						+ getAddition((int)ace[0], king) + "\nbecuase a king is 13 and an ace is 1.");
				
				
				//Loop that ask user for input. Does not terminate until user answers correctly
				System.out.println("Alright, let's see if you're still payiing attention");
				int guessedCardLimit;
				do {
				System.out.println("What's the is the limit when adding in Kazino?");
				guessedCardLimit = scanner.nextInt();
				}
				while(guessedCardLimit != 14);
				scanner.close();
					
		
				System.out.println("So, since in this game each card has a numerical value \n"
						+ "you can add, subtract, multiple or divide them together,\n"
						+ "but you have to be explicit.\n" + "Remember, you're only limited from 1 to 14.");
				
				System.out.println("We can subtract an ace from a king and get " + Math.abs(getSubstraction((int)ace[0], king))
						+ " or " + Math.abs(getSubstraction((int)ace[1], king))); 
				//casting ace variable from double to int because method accepts int arguments
				//Method calls to perform math operations and return results

				System.out.printf(
						"When we divide, we have to be explicit and we can only divide divisible numbers together,"
								+ "\nmeaning, you have to get a whole number when dividing."
								+ "\nSo dividing an ace at 14 and a 2 together can work, because you get %.2f",
						getDivision((int)ace[1],(int) 2));
				System.out.println("\nBut dividing a queen and a king won't work because you get a remainder of " + queen%13+".");
				System.out.println("So when mulitplying, it should be simple, but the operation cannot go over 14, "
						+ "\nso a 2 and 7 is fine, but a 2 and an 8 is illegal because that's " + getMultiplication(2, 8));
				System.out.println("Just some obvious concepts. You can always the add the same card values together"
						+ "\n, only if from it's an ace to to 7. So a 5 of heart and a 5 of ace can easily be added together to get " + (cardValue+=cardValue));
				
			
				System.out.print("\nWell, that's all for now. Please stay tune for the next version!");
				continueProgram = false;

			}
		}
	}

	// CAPitalize the input name, and displaying message method
	// Header that uses doesn't use a return type, but prints a message for user
	// Header uses name and age as parameters
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
	public static int getAddition(int card1, int card2) {
		int result = (card1 + card2);
		return result;
	}

	public static int getSubstraction(int card1, int card2) {
		int result = (card1 - card2);
		return result;
	}

	public static double getDivision(double card1, double card2) {
		double result = (card1 / card2);
		return result;
	}

	public static int getMultiplication(int card1, int card2) {
		int result = (card1 * card2);
		return result;
	
	}

}
