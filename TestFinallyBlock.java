class TestFinallyBlock
{
	public static void main(String ar[])
	{
		try
		{	// Creating an exceptions here
			int data=25/0;
			System.out.println((data));
		}
	catch(NullPointerException e)
	{	//Printing the exception
		System.out.println(""+e);
	}	
	finally
	{
		System.out.println("Finally is Always Executes");
	}
	 	System.out.println("Out of Finally");
	}
}
