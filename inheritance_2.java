import java.util.*;


class Main
{
	public static void main(String[] args)
	{
		Employee emp=new Employee("sudharsan",35000);

		emp.raiseSalary(30);

		System.out.println(emp.getSalary());

		Manager manager= new Manager("akil",40000,50000);
		
		System.out.println(manager.getSalary());


	}

}


class Employee          // super class or parent class
{
	private String name;
	private double salary;

	Employee(String name,double salary)
	{
		this.name=name;
		this.salary=salary;
	}
	Employee()
	{
		this.name="";
		this.salary=0.0;
	}



	public String getName()
	{
		return this.name;
	}
	public double getSalary()
	{
		return this.salary;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public void raiseSalary(double percent)
	{
		 salary+=salary*percent/100;
	}


}
class Manager extends Employee // sup class or derived class
{
 double Bouns;

 Manager(String name,double salary,double Bouns)
 {
	 super(name,salary);  // we cant access private member directly in sub class also so we call parent class constructor using super keyword 
	                      // super statement is compulsory  first statement of the method.
	 this.Bouns=Bouns;
 }

public double getSalary()
{
return super.getSalary()+Bouns;  // method over riding
}

}
