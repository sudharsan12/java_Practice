//constructor chaining
//
// constructor chaining is the process of calling one constructor from another constructor with respect to current object
//within same class it can be done using this() keyword for constructor in the same class.
// by using Super() keyword to call the constructor from the base class.
//
//
// note :rules for constructor chaining
//   this() in same class or derived class  super() should always be the first line of the constrctor
//   there should be at least be one constructor without the this() keyword


class Temp
{
	Temp()
	{
		this(5);
		System.out.println("the default constructor..");
	}
	Temp(int x)
	{
		this(5,15);
		System.out.println(x);
	}

	Temp(int x,int y)
	{
		System.out.println(x*y);
	}

	public static void main(String[] args)
	{
		new Temp();
	}
}
