/*  constant in java
 * 	A whose variable cannot be changed.
 * 	to find a constant we use the final keyword.
 * 	cnstant to be used any other variable.
 * 	constant name written in upper case and using the snake case convension.
 *
 *
 */


class Constant
{
	public static void main(String[] args)
	{
		final String str="sudharsan"; //the constant marked using final keyword

		System.out.println(str);

		final String st; // this constant declartion
                st=args[0];      // definition also possible
		System.out.println(st);
	//	st=args[1];      /// this make error becuse of redefintion is not possible

	}
}
