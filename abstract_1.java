class Main
{

	public static void main(String[] args)
	{
		Member[] member=new Member[2];

		Member.staticFun();  // we can access abstract class static method directly
		member[0]=new Student();
		member[1]=new Teacher();

		for(Member mem:member)
			mem.welcomeMessage();

	}
}

abstract class Member
{
	abstract void welcomeMessage();

	static void staticFun()
	{
	System.out.println("i am base class ...!");
	}
}

class Student extends Member
{
	void welcomeMessage()
	{
		System.out.println("Welcome Student...!");
	}
}
class Teacher extends Member
{
	void welcomeMessage()
	{
		System.out.println("Welcome Teachers...!");
	}
}
