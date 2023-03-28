
class Main
{
	public static void main(String[] args)
	{
		System.out.println(Person.id); // static varibale is class variable not a object variable we can access the variable out side the scobe
		System.out.println(Person.get_id()); // static varibale is class variable not a object variable we can access the variable out side the scobe

		Person p1=new Person();
		System.out.println(p1.id);
		p1.id=10;// we can modify the variable out side the class 
		Person p2=new Person("sudharsan",24);
		System.out.println(p2.id);

		


	}
}

class Person
{
	static int id;
	String name;
	int age;

	Person() // default construtor
	{
		id++;
		name="noname";
		age=0;
	}

	Person(String name,int age)
	{
		id++;
		this.name=name;
		this.age=age;
	}


	static int get_id()
	{
		
		return id; // static method only access the static variable
		//return age;  this make error
	}

}

