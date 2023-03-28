// lambda expression
//
//   in java 8.1 there is  a one abstract method present in the interface  that interface is called single abstract method (or) SAM method that interface is called
//   functional interface.
//
//   lambda expression implement the only abstract method present there for functional interface 
//


class Main
{
	public static void main(String[] args)
	{
		Engine engine=()->System.out.println("bikes are single cylinder ");

		engine.cyclinderCapacity();
	}
}

interface Engine
{
	void cyclinderCapacity();
}
