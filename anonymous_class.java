// Anonymous class
//
//    when particular object need any extra methods are over riding on that methods directly you can declare inside the object instantiation.
//
//    other object doesnt exist on that method


class Main
{
	public static void main(String[] args)
	{
		Cycle cycle=new Cycle(){
		
			void display()
			{
		        System.out.println("I am bike...");
			}

		};


		Cycle cycle_1=new Cycle();
		Cycle cycle_2=new Cycle();

		cycle.display();
		cycle_1.display();
		cycle_2.display();
	}
}



class Cycle
{
	void display()
	{
		System.out.println("I am bicycle...");
	}
}
