class Main
{
public static void main(String[] args)
{
	subclass ex=new subclass();
	example ex_1=new subclass();
	
	System.out.println(ex.a);

	ex_1.display();
	ex_1.method();

	example.method_2();
}

}

interface example
{
	final int a=10; //by default public static and final
	void display();

        default void method()
	{
	System.out.println("interface only have static and default methods");
	}

	static void method_2()
	{
	System.out.println("interface direct access static method");
	}

}

class subclass implements example
{
	public void display()
	{
		System.out.println("hi sudharsan");
	}
        public void method()
	{
	System.out.println("interface only have static and default methods");
	}

	
}


