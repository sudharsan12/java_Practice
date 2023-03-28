import java.util.*;
import java.lang.reflect.*;


class Main
{
public static void main(String[] args)
{

	Employee emp=new Employee(10000,"sudharsan");

	Class cls=emp.getClass();

	System.out.println(cls.getName());
	Method[] methods=cls.getMethods();
	
	for(Method method:methods)
	  System.out.println(method.getName());


}

}



class Employee
{
	int salary;
	String name;

	public Employee(int salary,String Name)
	{
		this.name=name;
		this.salary=salary;
	}


	public String getName()
	{
		return this.name;
	}
	public int getsalary()
	{
		return this.salary;
	}
	public void setName(String name)
	{
		 this.name=name;
	}
	public void setsalary(int salary)
	{
		this.salary=salary;
	}
}


