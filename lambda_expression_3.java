class Test
{
interface FunInter1
{
int  operation(int x,int y);
}
interface FunInter2
{
void sayMessage(String str);
}

private int operate(int x,int y,FunInter1 obj)
{
	return obj.operation(x,y);
}

public static void main(String[] args)
{

	FunInter1 add=(int x,int y)->(x+y);
	FunInter1 mul=(int x,int y)->(x*y);

	Test obj=new Test();

	System.out.println("addition ="+obj.operate(5,2,add));
	System.out.println("multiply ="+obj.operate(5,2,mul));

	FunInter2 message=(String str)->System.out.println(str);

	message.sayMessage("hello Sudharsan");

}

}
