import java.util.*;

public class Compare {

	//class does the matching between two array integers
	
	private int[] arrayA;
	private int[] arrayB;
	
	public Compare(int[] a, int[] b) {
		arrayA = a;
		arrayB = b;
	}
	
	public void printArrays()
	{//prints the elements in each array
		System.out.println("Values for data in array 1 is: " + returnArrayValues(arrayA));
		System.out.println("Values for data in array 2 is: " + returnArrayValues(arrayB));
	}
	
	private String returnArrayValues(int[] inp)
	{//returns the elements of the array supplied as a parameter as s string
	
		String s = "";
		
		for(int i = 0; i < inp.length; i++)
		{
			s+= inp[i] + " ";
		}
	
		return s.trim();
	
	}//private String returnArrayValues(int[] inp)
	
	public void printIntersection()
	{//prints the common elements in each array
	
		List<Integer> list = new ArrayList<>(); //list to hold the common and unique numbers
		for(int i = 0; i < arrayA.length; i++)
		{
			for(int k = 0; k < arrayB.length; k++)
			{
				if (arrayA[i] == arrayB[k])
				{
					if (!intExists(list, arrayA[i])) {list.add(arrayA[i]);}
				}
				
			
			}//k, arrayB
		}//i, arrayA
	
	
	}//public printIntersection()
	
	private boolean intExists(List<Integer> list, int inp)
	{//checks whether the provided int (inp) exists in the provided list (list)
	
		for(Integer i : list)
		{
			if (i == inp) {return true;}
		}
		
		return false;
	
	}
	

	

}//compare ends