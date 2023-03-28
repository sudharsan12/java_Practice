// enum inside constant are must be uppercase and enum can defined ouside the class and inside the class never writen iside the method
//



//internally implementation of enum
//
//  class Level
/*  {
    public static final Level LOW=new Level();
    public static final Level MEDIUM=new Level();
    public static final Level HIGH=new Level();
  }
  */





class Main
{
	public static void main(String args[])
	{
		Level level=Level.MEDIUM;

		System.out.println(level);
		System.out.println(level.getabbr());
		System.out.println(Level.valueOf("LOW"));
	}
}
enum Level
{
	LOW("L"),
	MEDIUM("M"),
	HIGH("H");

	private String abbr;
	Level(String ab)
	{
		abbr=ab;
	}

	String getabbr()
	{
		return abbr;
	}
}
