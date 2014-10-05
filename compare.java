import java.util.*;

/**
 * Compare - class does the matching between two array integers
 * @author jbliss02
 * @version 1.0
 */
 
public class Compare extends IntTools
{

	private int[] arrayA; //the first array
	private int posA; //the length of the defined arrayA elements
	private int[] arrayB;
	private int posB;
	
	public Compare(int[] a, int posA, int[] b, int posB) 
	{//constructor that takes the 2 integer arrays, and their defined lengths, as parameters
		arrayA = a;
		this.posA = posA;
		arrayB = b;
		this.posB = posB;
	}
	
	/**
	*doAnalysis()
	*runs the comparision on the two arrays
	 */
	public void doAnalysis()
	{	//runs the comparision on the two arrays
		
		if(emptyArrays()){System.out.println("Both arrays are empty"); return;} //exit if no ints defined
		
		//print the elements of the arrays
		PrintAll printAll = new PrintAll();
		printAll.print(arrayA, posA, arrayB, posB);
		
		//print the intersections
		Intersection intersection = new Intersection();
		intersection.print(arrayA, posA, arrayB, posB);
		List<Integer> common = intersection.ReturnList(); //returns the list of the common elements to help in next calculation

		//print the uncommon items
		Nonintersection nonintersection = new Nonintersection();
		nonintersection.print(common, arrayA, posA, arrayB, posB);

	
	}//doAnalysis()
	
		/**
	 *emptyArrays 
	 *defines whether both arrays are 'empty', i.e. no position has been defined 
	 */
	private boolean emptyArrays()
	{//
		
		if(posA == 0 && posB == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	
	}//emptyArrays
	
}//compare class ends

class PrintAll 
{//class that holds the logic for calculating and displaying all elements in the arrays
	public void print(int[] arrayA, int posA, int[] arrayB, int posB)
	{//prints the elements in each array
		System.out.println("Values for data in array 1 is: " + returnArrayValues(arrayA, posA));
		System.out.println("Values for data in array 2 is: " + returnArrayValues(arrayB, posB));
	}
	private String returnArrayValues(int[] inp, int pos)
	{//returns the elements of the array supplied as a parameter as s string
	
		String s = "";
		
		for(int i = 0; i < pos; i++)
		{
			s+= inp[i] + " ";
		}
	
		return s.trim();
	
	}//private String returnArrayValues(int[] inp)
	
}//printAll

class Intersection  extends IntTools
{//class that holds the logic for calculating and displaying the common elements in the arrays
	private List<Integer> list;

	public void print(int[] arrayA, int posA, int[] arrayB, int posB) //the list 
	{//prints the common elements in each array
	
		list = new ArrayList<>(); //list to hold the common and unique numbers
		for(int i = 0; i < posA; i++)
		{
			for(int k = 0; k < posB; k++)
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

	public void print(List<Integer> common, int[] arrayA, int posA, int[] arrayB, int posB)
	{//the list (common) contains the integers that are common between the two arrays (arrayA) and (arrayB)
		
		System.out.println("Non-common values for array 1 is: " + returnArrayValues(common, arrayA, posA));
		System.out.println("Non-common values for array 2 is: " + returnArrayValues(common, arrayB, posB));
	
	}//print
	
	private String returnArrayValues(List<Integer> common, int[] array, int pos)
	{//returns the arrayValues that do not appear in the list 

		List<Integer> uncommon = new ArrayList<>(); //holds the uncommon values
		
		for(int i = 0; i < pos; i++)
		{
			if(!super.intExists(uncommon, array[i]) && !super.intExists(common, array[i])) { uncommon.add(array[i]); }
		}//i - each element in array

		return super.listToString(uncommon);
	}	

}//class Nonintersection