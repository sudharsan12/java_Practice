//cosmic super class
//
// In java the Object class is the parent class of all the java classes.every java class is a direct or indirect child of java Object class hence every
// java class extends the object class therefore we need not write the following.
//
//   variable of type object could be used to refer to object of any type.






class Main //internall this main class inheritated by class Main extends Object
{
	public static void main(String[] args)
	{

		String s1="Sudharsan";
		String s2="Sudharsan";
		String s3=new String("Sudharsan");
		String s4=new String("Sudharsan");
//ex-1
		System.out.println(s1==s2);//true  this compare both object reference both object stroed same reference so its true
		System.out.println(s3==s4);//false  thie both reference are diffrent

//ex-2
		System.out.println(s1.equals(s2));//  true the string class internally override the equals method so string compare working fine
		System.out.println(s3.equals(s4));// true

//ex-3
               Employee e1=new Employee(1000,"Akil");
               Employee e2=new Employee(1000,"Akil");
		
	       System.out.println(e1.equals(e2));//the equals method now compare reference only that gives error now over ride the equls method in Employee method
	                                           //customize the equals method


	}
}

class Employee
{
	int salary;
	String name;

	Employee(int salary,String name)
	{
		this.salary=salary;
		this.name=name;
	}
	     //the over reide function
	public boolean equals(Object obj)
	{
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(this.getClass()!=obj.getClass())
			return false;
		Employee e1=(Employee)obj;

		return ((this.name.equals(e1.name))&&this.salary==e1.salary);
	}

}
