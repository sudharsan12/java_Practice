class Main
{
	public static void main(String[] args)
	{
		Engine e_1=new Engine(){

	            public void cyclinderCapacity()
	             {
		        System.out.println("Super bikes are double cylinder");
	             }   
		};

		Engine e_2=new Bike();
		Engine e_3=new Car();

		e_1.cyclinderCapacity();
		e_2.cyclinderCapacity();
		e_3.cyclinderCapacity();
		
	}

}


interface Engine
{
	 void cyclinderCapacity();	
}

class Bike implements Engine
{
	public void cyclinderCapacity()
	{
		System.out.println("bikes are single cylinder");
	}
}

class Car implements Engine
{
	public void cyclinderCapacity()
	{
		System.out.println("Car are single cylinder");
	}
}


