//***********************************************************************************************
//Class Lab1B demonstrates examples of taking user input then storing that information
//and later displaying all input back to the user in a final statement. This program
//also uses a Scanner object class.
//***********************************************************************************************
import java.util.Scanner;//Scanner class which allows the user to read values of various types.

//Name of program
public class Lab1B
{
	//Main 
	public static void main(String args[])
	{
		//Declaration and initialization of constant variables
		final int ID_NUMBER = 12345;
	
		//Print line statement which also stores the users name
		Scanner userInputScanner = new Scanner (System.in);		
		System.out.println("What is your first name?");
		String userInputName = userInputScanner.nextLine();
		
		//Print line statement that stores the users middle initial
		Scanner userInputScanner2 = new Scanner (System.in);		
		System.out.println("\nWhat is your middle initial?");
		String userInputInitial = userInputScanner2.nextLine();
		
		//Print line statement that stores the users age
		Scanner userInputScanner3 = new Scanner (System.in);	
		System.out.println("\nWhat is your age in years?");
		String userInputAge = userInputScanner3.nextLine();
		
		//Print line statement that stores the users value of checking account
		Scanner userInputScanner4 = new Scanner (System.in);
		System.out.println("\nHow much money do you have in your checking account?");
		String userInputAccountBalance = userInputScanner4.nextLine();
		
		//Print line statement that concatenates all previous print line information and variables 
		System.out.println("\nHello " + userInputName + " " + userInputInitial + ". \nYou are " + userInputAge + " years old and you have " + userInputAccountBalance + " dollars in your checking account");
		System.out.println("Your ID number is " + ID_NUMBER);
		
	}//end main
}//end Lab1B class