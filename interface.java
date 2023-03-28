/*
interface in java

   interfce in java is  blueprint of class.it has static constants and abstract methods.

   the interface in java is a mechanism to achive abstraction .there can be only abstract methods in the java
   interface not method body.it is used to achive abstraction and multiple apstraction.


*/







class Test
{
	public static void main(String[] args)
	{
		Bank b=new SBI();
		System.out.println("rate of interest of sbi"+b.rateofinterest());
		Bank c=new SIB();
		System.out.println("rate of interest of sib"+c.rateofinterest());
	}
}
interface  Bank
{
	float rateofinterest();
}

class SBI implements Bank
{
	public float rateofinterest()
	{
		return 9.5f; 
	}
}
class SIB implements Bank
{
	public float rateofinterest()
	{
		return 9.5f; 
	}
}

