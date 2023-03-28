//nested interface 

class Main
{
	public static void main(String[] args)
	{
		Test.Yes obj;

		obj=new Testing();

		obj.sayHi();
	}
}

interface Test
{
	interface Yes
	{
		void sayHi();
	}
}

class Testing implements Test.Yes
{
	public void sayHi()
	{
			System.out.println("from method in implements.....!");

	}
}


