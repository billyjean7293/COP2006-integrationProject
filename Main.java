package main;

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

//A variable is a stored location of memory that can contain different types of data types.
//The term scope means a defined variable that can be located in a function or method and if out of scope, it cannot be accessed.
public class Main {

	public static void main(String[] args) {
		//Variables used to store values to be used later whenever it is called
		
		int jack = 11;
		int queen = 12; 
		int king = 13;
		double ace = 14;
		
		//The rules in Black Jack is to not go over 21. That will never change.
		final int BLACK_JACK = 21;
		
		boolean blackJack = true;
		
		String hello = "Hello! "; 
		String greeting = "Welcome to my integration project. ";
		
		System.out.println(hello + greeting);
		System.out.println("This is a quick informational tutorial to a game similar to black jack called 'Kazino'");
		System.out.println("Let's start with the very basics. How many cards are in a dack? Enter a number");
		Scanner scan = new Scanner(System.in);
		
		int cardsInDeck = scan.nextInt();
		scan.close();
		
		System.out.println("There's 52 cards in a dack, if you didn't know.");
		System.out.println("In Black Jack, if your first two cards added are " + BLACK_JACK + ", "
				+ "you get Black");
		System.out.println("In Black Jack, all  face cards are numerically valued at 10");
		System.out.println("But in 'Kazino', face cards are numerically valued in ascending order.");
		System.out.println("For instance, a Jack is " + jack + ".");
		System.out.println("A Queen is valued as " + queen + ".");
		System.out.println("A king is valued as " + king + ".");
		System.out.println("And an ace is value 1 and also " + ace + ".");
		System.out.println("Just like in Black Jack, we can add cards togethger, "
				+ "if your two cards equal 21, we consider it black is " + blackJack + ".");
		System.out.println("Instead 21 as the limit, the limit is 14.");
		System.out.println("With that, we can add a king and an ace together and get 14 becuase a king is 13 and an ace is 1.");
		System.out.println("Well, thats all for now. Please stay tune for the next tutorial");

		
	}

}
