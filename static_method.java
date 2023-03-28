/*
class Sudharsan
{
	public static void main(String[] args)
	{
		Sudharsan.sayHi();// it show error because 
	}

	public void sayHi() // this is not static method
	{
	System.out.println("hello....!");
	}
}*/

class Sudharsan
{
	public static void main(String[] args)
	{
		Sudharsan obj=new Sudharsan();

		obj.sayHi();
	}

	public static void sayHi() 
	{
		
	System.out.println("hello....!");
	}
	
	public  void sayHi() 
	{
		
	System.out.println("hello....!");
	}
}

//access non static method
/*
class Sudharsan
{
	public static void main(String[] args)
	{
		Sudharsan obj=new Sudharsan();

		obj.sayHi();
	}
	public  void sayHi() 
	{
		
	System.out.println("hello....!");
	}
}*/
