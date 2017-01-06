class BubbleSort extends Sorter {
	public int Sort(int[] array)
	{
		for(int i=0; i < array.length; i++)
		{
			for(int j=1; j < array.length - i; j++)
			{
				if(array[j-1] > array[j])
				{
					Swap(array,j-1, j);
				}
			}
		}
		return 0;
	}
}
