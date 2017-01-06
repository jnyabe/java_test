class Test {
	public static void main(String args[])
	{
		
		int[] array	= new int[10];
		try {
			if(args.length > 0)
			{
				array = new int [Integer.parseInt(args[0])];
			}
		} catch(NumberFormatException e) {
			System.out.println("Usage: java Test [0-9]+");
			System.out.println("Wrong argument: " + args[0]);
			System.exit(0);
		} 


		Sorter sorter[] = {
			new InsertionSort(),
			new BubbleSort(),
			
		};
		Sorter.Init(array);
		Sorter.Shuffle(array);
		int[] org = array.clone();
		
		for(int i=0; i < sorter.length; i++)
		{
			array = org.clone();
			System.out.println("*** " + sorter[i].getClass().getSimpleName() + " ***");
			Sorter.Print("before", array);
			sorter[i].Sort(array);
			Sorter.Print("after ", array);
			System.out.println("Sort: " + (sorter[i].IsSorted(array)? "OK":"NG"));
		}
	}
}
