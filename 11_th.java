
// here is a model
public class Team 
{
//	Member member;
	public static Member fun(Member member)
	{
		return member;
	}

	public static void main(String[] arg)
	{
		Member my_member=new Member("sudharsan","hero",5,1);
		my_member=fun(my_member);
		System.out.println(my_member.getName());
		System.out.println(my_member.getType());
		System.out.println(my_member.getLevel());
		System.out.println(my_member.getRank());

	}

}

class Member
{

	private String name;
	private String type;
	private int  level;
	private int rank;

	public Member(String name,String  type,int level,int rank)
	{
		this.name=name;
		this.type=type;
		this.level=level;
		this.rank=rank;
	}

	public String getName()
	{
		return this.name;
	}
	public String getType()
	{
		return this.type;
	}
	public int getLevel()
	{
		return this.level;
	}
	public int getRank()
	{
		return this.rank;
	}

}
