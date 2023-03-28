// protected access specifier 
// this access specifier marked data member and member function can access inside the class and inside the derived class only
//
class Main
{
	public static void main(String[] args)
	{
		Sub test=new Sub("sudharsan",23);

		test.show();
	}
}

class Base
{
	protected String name; // only can access inside the class and derived the class
	protected int age;

	Base(String name,int age)
	{
		this.name=name;
		this.age=age;
	}

}

class Sub extends Base
{
	Sub(String name,int age)
	{
		super(name,age);
	}
	void show()
	{
		System.out.println(this.name+" \n"+this.age);
	}
}

