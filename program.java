import java.util.Scanner;
/**
 * Program prompts the user to enter integers which are entered into 2 arrays
 * User enters 0 to finish entry into array. Once 0 has been entered into the
 * second array integer entry is considered finished
 * duplicate integers are not entered into either array, each int in an array
 * is unique
 *
 * @author jbliss02
 * @version 1
 */
 
public class program {

/**
 * Main program which prompts for user input and then runs the analysis
 *
 */
	public static void main(String[] args)
	{

		Arraybuilder arrayBuilder = new Arraybuilder(); //takes the user input to set the arrays and defines when to stop
		Scanner scanner = new Scanner(System.in);
		boolean exit = false; //flag to show when number entry has finished
		
		//prompt the use to enter the values for the array
		while (!exit)
		{
			System.out.print("Enter data for array " +  arrayBuilder.currentArray +  " (0 to finish):");
			while(!scanner.hasNextInt()) //non ints
			{
				System.out.print("Invalid entry, try again: ");
				scanner.next();
			}
	
			//load the integer into the array builder, and set the exit boolean
			exit = arrayBuilder.intIn(scanner.nextInt()); 
				
		}//while (!exit)
		
		//arrays are set, do the comparison
		Compare compare = new Compare(arrayBuilder.arrayA, arrayBuilder.posA, arrayBuilder.arrayB, arrayBuilder.posB);
		compare.doAnalysis();
		
	}//main ends
	
}//program class ends