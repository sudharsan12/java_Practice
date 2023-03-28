class Main
{
	public static void main(String[] args)
	{
		Vechicle vechicle=new Car();
		Mechanic mechanic=new Mechanic();
		mechanic.check(vechicle);
		vechicle=new Bike();
		mechanic.check(vechicle);

	}
}

abstract class Vechicle
{
	abstract public void ride();
}


class Car extends Vechicle
{
	public void ride()
	{
		System.out.println("i love ride a car...");
	}
}
class Bike extends Vechicle
{
	public void ride()
	{
		System.out.println("i love ride a bike...");
	}
}

class Mechanic
{
	public void check(Vechicle vec)
	{
		System.out.println("checking...");
		vec.ride();
	}
}
