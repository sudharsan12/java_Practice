//wrapper class
//
//  its a conerting of primitive data type to class object that is called wrapper;
//  auto boxing primitive type to wrapper class implicityly conversion is called auto boxing.
//  outboxing  wrapper class to primitive type implictiy coversion is called  unboxing

/*
 *        primitive type              wrapper class
 *
 *        int                           Integer
 *        char                          Character
 *        boolean                       Boolean
 *        float                         Float
 *        double                        Double
 *        byte                          Byte
 *        long                          Long
 *        short                         Short
 *
 * */

import java.util.*;

class WarapperExample
{
	public static void main(String[] args)
	{
		int i=10;

		Integer num=Integer.valueOf(i);// explicity conversion
		Integer num2=i;  //autoboxing

		int num3=num.intValue();// expilicity conversion

		int num4=num;//outboxing

		System.out.println(num+"  "+num2+" "+num3+" "+num4);


	}

}
