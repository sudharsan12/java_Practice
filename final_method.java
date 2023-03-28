class Main
{
	public static void main(String[] args)
	{
		Temp temp=new Sub();

		temp.add(10,20);
		temp.add(3,2);
	}
}

class Temp
{
    public  final void add(int num_1,int num_2)
    {
	    System.out.println(num_1+num_2);
    }
}
class Sub extends Temp
{
    public void add(int num_1,int num_2)
    {

	    System.out.println(num_1+num_2);
    }


}



