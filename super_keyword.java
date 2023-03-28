class Main
{
	public static void main(String args[])
	{
		Student s=new Student();
	}

}

class Person
{
	private String name;
	private int age;

	Person()
	{
		name="";
		age=0;
	}
	Person(int age,String name)
	{
		this.name=name;
		this.age=age;
	}


}

class Student extends Person
{
	int id;
	int std;


        Student()
	{
		id=0;
		std=0;
	}

	Student(int id,int std,int age,String name)
	{
		super(age,name);
		this.id=id;
		this.std=std;
	}
}
