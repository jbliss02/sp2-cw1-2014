/**
 * ArrayBuilder - A class to manage the addition to integer arrays based on inputs
 * adds unique elements to the arrays, defines which array integer entry is for
 * and when entry shouls stop
 * @author jbliss02
 * @version 1.0
 */

public class Arraybuilder extends IntTools
{
	public int[] arrayA;
	public int[] arrayB;
	public int posA;
	public int posB;

	public int currentArray; //which array is currently being filled
	
	public Arraybuilder()
	{//constructor, sets the defaults
		currentArray = 1; //starting array
		posA = 0;
		posB = 0;
		arrayA = new int[100];
		arrayB = new int[100];
	}
	
	/**
	 * intIn(i) takes the integer input (i) and adds to the correct array, if it is unique
	 * returns a true or false, based on whether continued entry is still required
	 * i.e. exit key (0) on array 2 returns false, all other entries return true
	 */
	public boolean intIn(int i)
	{
		
		if (currentArray == 1)
		{
			if (i == 0)
			{
				currentArray = 2; //move to the second array
				return false;
			}
			else if (!super.intExists(arrayA, i)) 
			{
				arrayA[posA] = i;
				posA++;
				return false;
			}
			else
			{
				return false; //number already exists
			}
		}
		else // assume B
		{
			if(i == 0)
			{
				return true; //exit key
			}
			else if (!super.intExists(arrayB, i)) 
			{
				arrayB[posB] = i;
				posB++;
				return false;
			}
			else 
			{
				return false; //number already exists
			}
		
		}//which array
		
	}//intIn() ends
	
}//Arraybuilder