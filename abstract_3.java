//this gives error illegal combination  the abstract method dont accesspet final method


class Main
{
	public static void main(String[] args)
	{
		Temp temp=new Sub();

		temp.show();

		temp.test();
	}
}


abstract class Temp
{
	public void test()
	{
		System.out.println("hai sudharsan....!");
	}
	abstract final void show();
}

class  Sub extends Temp
{
    final void show()
    {
		System.out.println("hai sudharsan in abstract....!");

    }
}

