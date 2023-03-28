import java.util.Scanner;
class Lexicographic
{
  private static void lex_fun(int n)
  {
	  int i=1,j,m;
	  while(i<=9)
	  {
		  j=1;
		  while(j<n)
		  {
			  m=0;
			  while(m<j)
			  {
				  if(m+j*i<n)
					  System.out.print(m+j*i + "  ");
				  m+=1;
			  }

                          j*=10;
		  }
		  i+=1;
	  }
  }

	public static void main(String... args)
	{
		Scanner in=new Scanner(System.in); //create object for read class scanner
		
		int num=in.nextInt();
		System.out.println("enter the number"+num);
		

		lex_fun(num);
		System.out.println(" ");
	}
}
