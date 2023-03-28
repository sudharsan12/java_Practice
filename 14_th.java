//Type conversion
//
//       numeric primitive can be cast two ways .
//            implicit 
//            explicit
//    
//
/* implicit conversion
 *   it happens when source type has smaller range than the target type.
 *
 *   byte num=42;
 *   short short_var=num;
 *   int int_var=short_var;
 *   long long_var=int_var;
 *   float float_var=long_var;
 *   double double_var=float_var;         
 *
 */

/*explicit casting
 *            it has source type more longer thAN TARGET TYPE
 *
 * double  d_var=42.0d;
 *
 * float f_var=(float)d_var;
 * long l_var=(long)f_var;
 *int i_var=(int)l_var;
 *short s_var=(short)i_var;
 *byte b_var=(byte)s_var;
 * */


class Type_conversion{

	public static void main(String... args)
	{
		//implicit conversion
		int num=10;
		float f_var=num;
		double d_var=f_var;

		System.out.println(num);
		System.out.println(f_var);
		System.out.println(d_var);

		// explicit conversion
		double dvar=40.0d;
		int num_var=(int)dvar;

		System.out.println(dvar);
		System.out.println(num_var);

	}

}
