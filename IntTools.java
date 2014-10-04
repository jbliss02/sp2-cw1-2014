import java.util.*;

public class IntTools
{//the superclass for the private classes, contains functions that are common across the classes

	public boolean intExists(List<Integer> list, int inp)
	{//checks whether the provided int (inp) exists in the provided list (list)
	
		for(Integer i : list)
		{
			if (i == inp) {return true;}
		}
		
		return false;
	
	}//private boolean intExists
	
	public boolean intExists(int[] array, int inp)
	{//checks whether the provided int (inp) exists in the provided list (list)
	
		for(Integer i : array)
		{
			if (i == inp) {return true;}
		}
		
		return false;
	
	}//private boolean intExists
	
	public String listToString(List<Integer> list) 
	{//returns the elemts of a the Integer list (list) as a string
	
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

	}//listToString
	
	
}//IntTools ends