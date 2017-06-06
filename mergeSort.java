package algo;

public class mergeSort {
	
	public static <T extends Comparable<? super T>>
				void mergeSort(T[] array) 
	{
		//Declare temp array used for merge,must do unchecked 
		//cast from Comparable<?>[] to T[]
		T[] tempArray = (T[]) new Comparable<?>[array.length];

		mergeSort(array, tempArray, 0, array.length - 1);
	}
	
	private static <T extends Comparable<? super T>>
				void merge(T[] array, T[] tempArray, 
							int first,int mid,int last) 
	{
		int first1 = first;		//beginning of first subarray
		int last1 = mid;		//end of first subarray
		int first2 = mid + 1;	//beginning of second subarray
		int last2 = last;		//end of second subarray
		int index = first1;		//next available location in tempArray
		
		while((first1 <= last1) && (first2 <= last2)) 
		{
			if(array[first1].compareTo(array[first2]) < 0)
			{
				tempArray[index] = array[first1];
				first1++;
			}
			else
			{
				tempArray[index] = array[first2];
				first2++;
			}
			index++;
		}

		//finish off the first subarray, if necessary
		while(first1 <= last1)
		{
			tempArray[index] = array[first1];
			first1++;
			index++;
		}
		
		
		//finish off the second subarray, if necessary
		while(first2 <= last2)
		{
			tempArray[index] = array[first2];
			first2++;
			index++;
		}
		
		//copy the result back into original array
		for (index = first; index <= last; ++index)
		{
			array[index] = tempArray[index];
		}
		printer(array);
	}
	
	public static <T extends Comparable<? super T>>
				void mergeSort(T[] array,T[] tempArray, int first, int last)
	{
		if (first < last)
		{
			int mid = (first + last)/2;
			mergeSort(array, tempArray, first, mid);
			mergeSort(array, tempArray, mid + 1, last);
			merge(array, tempArray, first, mid, last);
		}
	}
	
	public static <T extends Comparable<? super T>>
				void printer(T[] array)
	{
		int middle = (0 + array.length)/2;
		
		for(int i = 0; i < middle; i++)
		{
			System.out.print("|" + array[i] + "|");
		}

		System.out.print("\t");
		for(int i = middle; i < array.length;i++)
		{
			System.out.print("|" + array[i] + "|");
		}
		System.out.print("\n");
		System.out.print("\t/" + "\t \\" + "\n" );
	}
	
	public static <T extends Comparable<? super T>>
			void printerString(T[] array)
	{
		int middle = (0 + array.length)/2;
		
		for(int i = 0; i < middle; i++)
		{
			System.out.print("|" + array[i] + "|");
		}

		System.out.print("\t");
		for(int i = middle; i < array.length;i++)
		{
			System.out.print("|" + array[i] + "|");
		}
		System.out.print("\n\t\t\t\t\t\t/" + "\t \\" + "\n" );
	}
	
	public static String toString(Object[] array){
		String output = "";
		
		for(int i = 0; i < array.length; i++)
		{
			output += "|" + array[i] + "|";
		}
		
		return output;
	}

}
