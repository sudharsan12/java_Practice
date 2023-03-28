import java.lang.reflect.*;


class Main
{
	public static void main(String[] args) throws Exception
	{
		Test test=new Test();

		Class cls=test.getClass();

		System.out.println("the unknown object class "+cls.getName());

		Constructor constructor=cls.getConstructor();

		System.out.println("the name of the constructor "+constructor.getName());

		System.out.println("the public method of class are : ");

		Method[] methods=cls.getMethods();

		for(Method method:methods)
		System.out.println(method.getName());


		Method methodcall_1=cls.getDeclaredMethod("fun_2",int.class);

		methodcall_1.invoke(test,23);

		Field field=cls.getDeclaredField("str");

		field.setAccessible(true);

		field.set(test,"surya");


		Method methodcall_2=cls.getDeclaredMethod("fun_1");

		methodcall_2.invoke(test);



		Method methodcall_3=cls.getDeclaredMethod("fun_3");

		methodcall_3.setAccessible(true);

		methodcall_3.invoke(test);

	}
}


class Test
{

	private String str;

	public Test()
	{
		this.str="sudharsan";
	}

	public void fun_1()
	{
		System.out.println("fun string is "+str);
	}

	public void fun_2(int n)
	{
		System.out.println("my age is "+n);
	}
	private void fun_3()
	{
		System.out.println("the private method invoked");

	}



}
