

class Main implements InterfaceA,InterfaceB
{

	public void printSomething()
	{
		System.out.println("i am inside the main class");

		InterfaceA.super.printSomething();
		InterfaceB.super.printSomething();
	}

	public static void main(String[] args)
	{
		Main main=new Main();

		main.printSomething();
	}
}

interface InterfaceA
{
	default void printSomething()
	{
		System.out.println("I am inside the interface A");
	}
}
interface InterfaceB
{
	default void printSomething()
	{
		System.out.println("I am inside the interface B");
	}
}


