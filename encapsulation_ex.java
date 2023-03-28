public class Testencapsulation
{
	public static void main(String[] args)
	{
		Encapsulate obj=new Encapsulate();

		obj.set_name("sudharsan");
		obj.set_age(23);
		obj.set_no(5);

		System.out.println("Legend name ="+obj.get_name());
		System.out.println("Legend no ="+obj.getroll_no());
		System.out.println("Legend age ="+obj.get_age());

	}
}
class Encapsulate
{
	private String legend_name;
	private int roll_no;
	private int age;


	public int get_age()
	{
		return age;
	}
	public int getroll_no()
	{
		return roll_no;
	}
	public String  get_name()
	{
		return legend_name;
	}

	public void set_age(int ae)
	{
		age=ae;
	}
	public void set_name(String ae)
	{
		legend_name=ae;
	}
	public void set_no(int ae)
	{
		roll_no=ae;
	}
}


