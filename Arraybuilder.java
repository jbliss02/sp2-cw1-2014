public class Arraybuilder extends IntTools
{
	public int[] arrayA;
	public int[] arrayB;
	private int posA;
	private int posB;

	public int currentArray; //which array is currently being filled
	
	public Arraybuilder()
	{
		currentArray = 1; //starting array
		posA = 0;
		posB = 0;
	}
	
	public boolean intIn(int i)
	{//takes the integer input (i) and adds to the correct array, if it is unique
		
		if (currentArray == 1)
		{
			if (i == 0)
			{
				currentArray = 1;
				return false;
			}
			if (!super.intExists(arrayA, i)) 
			{
				arrayA[posA] = i;
				posA++;
				return false;
			}
		}
		else // assume B
		{
			if(i == 0)
			{
				return true;
			}
			else
			{
				arrayB[posB] = i;
				posB++;
				return false;
			}
		
		}

		return false;
		
	}
	
}//Arraybuilder