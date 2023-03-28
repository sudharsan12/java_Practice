public class Test
{
	Day day;

	public Test(Day day)
	{
		this.day=day;
	}

	public void dayIsLike()
	{
		switch(day)
		{
			case SUNDAY:
			case SATURDAY:System.out.println("sunday is weekend");
				      break;
			case MONDAY:System.out.println("Monday is very bad");
				    break;
			case FRIDAY:System.out.println("friday is better");
				    break;
			default:
				    System.out.println("Mid weekdays are burn...");
				    break;
		}
	}


	public static void main(String[] args)
	{
		String str="TUESDAY";

		Test test=new Test(Day.valueOf(str));
		test.dayIsLike();
	}


}
enum Day
{
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
}

