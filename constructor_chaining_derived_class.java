
class Derived extends Base
{
	Derived()
	{
		System.out.println("no argument constructor of derived");

	}
	Derived(String name)
	{
		super(name);
		System.out.println("calling parameterized constructor derived class");
        }
	public static void main(String[] args)
	{
		Derived obj=new Derived("test");
	}
}
class Base
{
	String name;
	Base()
	{
		this("");
		System.out.println("no argument constructor of base class");
	}
	Base(String name)
	{
		this.name=name;
		System.out.println("calling parameterized constructor base class");
	}
}
