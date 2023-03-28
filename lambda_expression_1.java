class Test
{
	public static void main(String[] args)
	{
		FuncInterface obj=(int x)->System.out.println(2*x);

		obj.abstractMethod(5);
	}
}


interface FuncInterface
{
	void abstractMethod(int x);

	default void normalFun()
	{
		System.out.println("Hello...");
	}
}


