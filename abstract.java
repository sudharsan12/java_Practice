

class Main
{
	public static void main(String[] args)
	{
		//Temp t=new Temp(12,"akil");
		Temp.testHai();
	}
}

abstract class Temp
{
int val;
String name;

      Temp(int val,String name)
      {
	      this.val=val;
	      this.name=name;
      }
      abstract void show();

      public static void testHai()
      {
	      System.out.println("hai sudharsan....");
      }
}
