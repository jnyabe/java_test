import java.util.*;
	
abstract class Sorter {
	
	abstract public int Sort(int[] array);
	
	static public void Swap(int[] array, int n, int m)
	{
		// System.out.println("Swap " + n + " and " + m);
		int tmp = array[n];
		array[n] = array[m];
		array[m] = tmp;
	}

	static public void Init(int[] array)
	{
		for(int i=0; i < array.length; i++)
		{
			array[i] = i;
		}
	}
	static public void Shuffle(int[] array)
	{
		Random rnd = new Random();
		for(int i=0; i < array.length - 1; i++)
		{
			int j = rnd.nextInt(array.length - i - 1) + (i + 1);
			Swap(array, i, j);
		}
	}

	static public boolean IsSorted(int[] array)
	{
		for(int i=1; i < array.length; i++)
		{
			if(array[i-1] > array[i])
			{
				return false;
			}
		}
		return true;
	}
	
	static public void Print(String label, int[] array)
	{
		System.out.println("[" + label + "]" + Arrays.toString(array));
	}
}
