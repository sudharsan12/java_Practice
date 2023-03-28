class Temp
{
	{
		System.out.println("init");
	}

	Temp()
	{
		System.out.println("default");
	}
	Temp(int x)
	{
		System.out.println(x);
	}
	{
		System.out.println("second");
	}

	public static void main(String[] args)
	{
		new Temp();
		new Temp(10);
	}
}
