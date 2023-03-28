import java.util.*;


class Main
{
	public static void main(String[] args)
	{

		Employee m= new Manager("akil",40000,50000);  // is this possible dynamic binding

	//	Manager m1=new Employee("sudharsan",4000,500);  this is not possible
	
		Employee[] emp_array=new Employee[5];

		emp_array[0]=new Employee("sudharsan",80000); 
		emp_array[1]=new Employee("akash",90000); 
		emp_array[2]=new Employee("tamil",150000); 
		emp_array[3]=m; 

		emp_array[4]=new Manager("kili",4994,32234);
		emp_array[4].setBouns(5000);

		
		for(Employee emp:emp_array)
			System.out.println(emp.getName()+"  "+emp.getSalary());

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
public String getName()
{
return super.getName();  // method over riding
}



}
