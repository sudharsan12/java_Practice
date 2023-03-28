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
	public final void test()
	{
		System.out.println("hai sudharsan....!");
	}
	abstract void show();
}

class  Sub extends Temp
{
    void show()
    {
		System.out.println("hai sudharsan in abstract....!");

    }
}

