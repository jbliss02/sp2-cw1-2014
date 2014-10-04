import java.util.*;

public class Compare {
//class does the matching between two array integers

	private int[] arrayA;
	private int[] arrayB;
	
	public Compare(int[] a, int[] b) 
	{//constructor that takes the 2 integer arrays as parameters
		arrayA = a;
		arrayB = b;
	}
	
	public void DoAnalysis()
	{	
		//print the elements of the arrays
		PrintAll printAll = new PrintAll();
		printAll.print(arrayA, arrayB);
		
		//print the intersections
		Intersection intersection = new Intersection();
		intersection.print(arrayA, arrayB);
		List<Integer> common = intersection.ReturnList(); //returns the list of the common elements to help in next calculation

		//print the uncommon items
		Nonintersection nonintersection = new Nonintersection();
		nonintersection.print(common, arrayA, arrayB);
	}
	
}//compare class ends



class PrintAll extends IntTools
{//class that holds the logic for calculating and displaying all elements in the arrays
	public void print(int[] arrayA, int[] arrayB)
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
	
}//printAll

class Intersection  extends IntTools
{//class that holds the logic for calculating and displaying the common elements in the arrays
	private List<Integer> list;

	public void print(int[] arrayA, int[] arrayB) //the list 
	{//prints the common elements in each array
	
		list = new ArrayList<>(); //list to hold the common and unique numbers
		for(int i = 0; i < arrayA.length; i++)
		{
			for(int k = 0; k < arrayB.length; k++)
			{
				if (arrayA[i] == arrayB[k])
				{
					if (!super.intExists(list, arrayA[i])) {list.add(arrayA[i]);}
				}//if a match is found		
			}//k, arrayB
		}//i, arrayA
	
		System.out.print("Common data is: ");
		System.out.println(super.listToString(list));
		
	}//public printIntersection()
	
	public List<Integer> ReturnList()
	{
		return list;
	}
}//intersection

class Nonintersection  extends IntTools
{//class that holds the logic for calculating and displaying the non common elements in the arrays

	public void print(List<Integer> common, int[] arrayA, int[] arrayB)
	{//the list (common) contains the integers that are common between the two arrays (arrayA) and (arrayB)
		
		System.out.println("Non-common values for array 1 is: " + returnArrayValues(common, arrayA));
		System.out.println("Non-common values for array 2 is: " + returnArrayValues(common, arrayB));
	
	}//print
	
	private String returnArrayValues(List<Integer> common, int[] array)
	{//returns the arrayValues that do not appear in the list 

		List<Integer> uncommon = new ArrayList<>(); //holds the uncommon values
		
		for(int i = 0; i < array.length; i++)
		{
			if(!super.intExists(uncommon, array[i]) && !super.intExists(common, array[i])) { uncommon.add(array[i]); }
		}//i - each element in array

		return super.listToString(uncommon);
	}	

}//class Nonintersection