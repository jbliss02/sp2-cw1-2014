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
	
	public void intIn(int i)
	{//takes the integer input (i) and adds to the correct array, if it is unique
		
		if (currentArray == 1)
		{
			if (!super.intExists(arrayA, i)) 
			{
				arrayA[posA] = i;
				posA++;
			}
		}
		else // assume B
		{
				arrayB[posB] = i;
				posB++;
		}

	}
	
}//Arraybuilder