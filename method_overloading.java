class Main
{
	public static void main(String[] args)
	{
		System.out.println(sum(10,22,34));
		System.out.println(sum(10.5f,5.5f));
	}
	private static int sum(int num_1,int num_2,int num_3)
	{
		return num_1+num_2+num_3;
	}
	private static float sum(float num_1,float num_2)
	{
		return num_1+num_2;
	}
}
