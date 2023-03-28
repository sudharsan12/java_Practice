class Main
{
	int x,y;

	public static void main(String[] args)
	{
		Main p=new Main();
		p.x=10;
		p.y=20;

		System.out.println("X ="+p.x+" ,Y ="+p.y);
		change(p);
		System.out.println("X ="+p.x+" ,Y ="+p.y);
	}
	public static void change(Main p)
	{
		p.x=20;
		p.y=10;
	}
}
