// comparable interface
//
import java.util.*;
class Main
{
	public static void main(String[] args)
	{
		Employee[] emp=new Employee[4];
		emp[0]=new Employee("sudharsan",40090);
		emp[1]=new Employee("surya",40000);
		emp[2]=new Employee("akil",40059);
		emp[3]=new Employee("tamil",298493);
		System.out.println("before sort");
		for(Employee e:emp)
			e.display();

		Arrays.sort(emp);
		System.out.println("after sort");
		for(Employee e:emp)
			e.display();


	}
}


class Employee implements Comparable<Employee>
{
	protected String name;
	protected double salary;

	Employee(String n,double s)
		{
			name=n;
			salary=s;
		}
	public int compareTo(Employee obj)
	{
		if(this.salary==obj.salary)
			return 0;
		if(this.salary<obj.salary)
			return -1;
		else
			return 1;
	}

	void display()
	{
		System.out.println(name+"   "+salary);
	}

}





