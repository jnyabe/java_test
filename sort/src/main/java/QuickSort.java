class QuickSort extends Sorter {

	private int sort(int [] array, int l, int r)
	{
		int m = l;

		for(int i=l+1; i <= r; i++)
		{
			
		}
		sort(array, l, m-1);
		sort(array, m+1, r);
	}
	
	public int Sort(int[] array)
	{
		return sort(array, 0, array.length - 1);
	}
}
