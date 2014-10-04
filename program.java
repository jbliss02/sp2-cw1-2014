import java.util.Scanner;

public class program {

	public static void main(String[] args)
	{
		

		Arraybuilder arraybuilder = new Arraybuilder();
		System.out.println("Enter data for array " +  arraybuilder.currentArray +  " (0 to finish):");

		Scanner scanner = new Scanner(System.in);
		while(!scanner.hasNextInt())
		{
			arraybuilder.intIn(scanner.nextInt());
		}
		
		Compare comp = new Compare(GiveArrayA(), GiveArrayB());
		comp.DoAnalysis();

		
		
	}

	public static int[] GiveArrayA()
	{
		int[] ret = new int[8];
		ret[0] = 1;
		ret[1] = 4;
		ret[2] = 2;
		ret[3] = 5;
		ret[4] = 7;
		ret[5] = 4;
		ret[6] = 8;
		ret[7] = 6;
		
		return ret;
	}
	
		public static int[] GiveArrayB()
	{
		int[] ret = new int[8];
		ret[0] = 5;
		ret[1] = 7;
		ret[2] = 3;
		ret[3] = 11;
		ret[4] = 4;
		ret[5] = 7;
		ret[6] = 3;
		ret[7] = 9;
		
		return ret;
	}
	
	
}