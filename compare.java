import java.util.*;

public class Compare {

	//class does the matching between two array integers
	
	private int[] arrayA;
	private int[] arrayB;
	
	public Compare(int[] a, int[] b) {
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
		List<Integer> common = intersection.ReturnList();
		
	}
	
	


	

}//compare ends

class PrintAll
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

class Intersection
{//class that holds the logic for calculating and displaying the common elements in the arrays
	private List<Integer> list;

	public void print(int[] arrayA, int[] arrayB) //the list 
	{//prints the common elements in each array
	
		List<Integer> list = new ArrayList<>(); //list to hold the common and unique numbers
		for(int i = 0; i < arrayA.length; i++)
		{
			for(int k = 0; k < arrayB.length; k++)
			{
				if (arrayA[i] == arrayB[k])
				{
					if (!intExists(list, arrayA[i])) {list.add(arrayA[i]);}
				}//if a match is found		
			}//k, arrayB
		}//i, arrayA
	
		System.out.print("Common data is: ");
		if(list.size() > 0)
		{
			String s = "";
			for(int i = 0; i < list.size(); i++)
			{
				s += list.get(i) + " ";
			}
			System.out.println(s);
		}
		else
		{
			System.out.println("None");
		}

	}//public printIntersection()
	
	private boolean intExists(List<Integer> list, int inp)
	{//checks whether the provided int (inp) exists in the provided list (list)
	
		for(Integer i : list)
		{
			if (i == inp) {return true;}
		}
		
		return false;
	
	}//private boolean intExists

	public List<Integer> ReturnList()
	{
		return list;
	}
}//intersection

class Nonintersection
{
	private List<Integer> common;
}