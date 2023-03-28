// enum inside constant are must be uppercase and enum can defined ouside the class and inside the class never writen iside the method
//



class Main
{
	public static void main(String args[])
	{
		Level level=Level.MEDIUM;

		System.out.println(level);
	}
}
enum Level
{
	LOW,
	MEDIUM,
	HIGH;
}
