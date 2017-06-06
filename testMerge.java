package algo;

public class testMerge 
{
	public static void main(String[] args) 
	{
		sortNumbers();
		sortStrings();
	}
	
	public static void sortNumbers()
	{
		Integer[] anArray = { 15, 8, 10, 2, 5, 56, 7};
		System.out.println("MERGE Sort: O(n log n)");
		System.out.println("Test for merge sort with numbers: ");
	
		for (int i = 0; i < anArray.length; i++)
		{
			System.out.print(anArray[i] + " ");
		}
	
		System.out.println("\n\tStarting merge:");
		for (int i = 0; i < anArray.length; i++)
		{
			System.out.print("|" + anArray[i] + "|");
		}
		System.out.print("\n");
		System.out.print("\t/" + "\t \\" + "\n" );
		mergeSort.printer(anArray);
		mergeSort.mergeSort(anArray);
		System.out.print("   ");
		for (int i = 0; i < anArray.length; i++)
		{
			System.out.print("|" + anArray[i] + "|");
		}
	}
	
	public static void sortStrings()
	{
		String[] anArray = 
			{ "word", "test", "bubble", "sort", 
			  "array", "string", "structure", "git",
			  "bit", "do", "left","zoo","alabama", "fargo",
			  "moon"};
		System.out.println("\n\nMERGE Sort: O(n log n)");
		System.out.println("Test for merge sort with strings: ");
		
		for (int i = 0; i < anArray.length; i++)
		{
			System.out.print(anArray[i] + " ");
		}
		System.out.println("\n\tStarting merge:");
		for (int i = 0; i < anArray.length; i++)
		{
			System.out.print("|" + anArray[i] + "|");
		}
		System.out.print("\n");
		System.out.print("\t\t\t\t\t\t/" + "\t \\" + "\n" );
		mergeSort.printerString(anArray);
		mergeSort.mergeSort(anArray);
		System.out.print("   ");
		for (int i = 0; i < anArray.length; i++)
		{
			System.out.print("|" + anArray[i] + "|");
		}
	}
}
