import java.util.*;  //  or  import java.util.Scanner;

// Scanner input=new Scanner(System.in); --> Scanner_clas_name object = new(for allocate memory for the new object) construtor (inputstream paramenter)
//
// obj.next()       --->read string
// obj.nextInt()     -->read integer
// obj.nextDouble()  -->read double
// obj.nextFloat()  --->read float
// obj.nextByte()   --->read byte
// obj.nextShort()   --->read short
// obj.nextBoolean() --->read boolean
// obj.nextLong()    --->read long
//
// note: read string along with space we use obj.nextLine()  --> this read along with space also
//
//     and read char we use  --> obj.next().charAt(); --> used to read character
//
//
//
//
//
//
//
//
//
//
class Main{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);

		System.out.println("Enter your name");
		String name=input.next();
		System.out.println("Enter two numbers");
		int a=input.nextInt();
		int b=input.nextInt();
		System.out.println(a+b);
		System.out.println("Enter one float numbers");
		float f=input.nextFloat();
		System.out.println(f);
		System.out.println("Enter one double numbers");
		double d=input.nextDouble();
		System.out.println(d);
		System.out.println("Enter the char");
		char ch=input.next().charAt(0);
		System.out.println(ch);
		input.nextLine(); /// to clean the input stream buffer to use dummy statement
		System.out.println("Enter your quotes");
		String str=input.nextLine();
		System.out.println(str);






	}

}
