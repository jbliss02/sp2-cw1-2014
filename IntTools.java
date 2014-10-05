import java.util.*;

/**
 * IntTools - A class which contains common methods when working with integers
 * 
 * @author jbliss02
 * @version 1.0
 */

public class IntTools
{
	/**
	 * intExists 
	 * checks whether the provided int (inp) exists in the provided list (list)
	 */
	public boolean intExists(List<Integer> list, int inp)
	{//checks whether the provided int (inp) exists in the provided list (list)
	
		for(Integer i : list)
		{
			if (i == inp) {return true;}
		}
		
		return false;
	
	}//private boolean intExists
	
	
	/**
	 * intExists 
	 * checks whether the provided int (inp) exists in the provided array (array)
	 */
	public boolean intExists(int[] array, int inp)
	{
		for(Integer i : array)
		{
			if (i == inp) {return true;}
		}
		
		return false;
	
	}//private boolean intExists
	
	
	/**
	 * listToString 
	 * returns the elemts of a the Integer list (list) as a string
	 */
	public String listToString(List<Integer> list) 
	{
	
		if(list.size() > 0)
		{
			String s = "";
			for(int i = 0; i < list.size(); i++)
			{
				s += list.get(i) + " ";
			}
			return s.trim();
		}
		else
		{
			return "None";
		}

	}//listToString()
	
}//IntTools ends