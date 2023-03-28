import java.util.*;

class String_test
{
	static public void main(String args[])
	{

		char ch[]={'S','U','D','H','A','R','S','A','N'};

		String s=new String(ch);
		System.out.println(s);

		String S="welcome";
		String W="welcome"; // here both S and W share same constant in memory area

		// string are immutable 
		String t="Sachin";
		t.concat("tendulkar"); //doesn't append 

		System.out.println(t); // here print only sacin they not changeble const string

		//string make mutable;

		t=t.concat("tendulkar");
		System.out.println(t); // here print only sacin tendulakar changeble const string


		// string compare
		
		//public boolean  equals(another string object) - compare two string
		//public boolean equlsIgnoreCase(String another object) -- ingnore string
		
                 String a="Sudharsan";
		 String b="Sudharsan";
		 System.out.println(a.equals(b)); // true

		 a="SUDHarsan";
		 b="sudhARSAN";
		 System.out.println(a.equalsIgnoreCase(b)); // true   


		 // string concatination
		 
		 // 1) using + operator
		 
		 String op="sudharsan "+"surya";
		 System.out.println(op);

		 String sp="sudharsan "+96+26+5.5;
		 System.out.println(sp);

		 String vp="akil ";
		 vp=new String(vp+"akash");
		 System.out.println(vp);

		 // 2) using concat()
		 
		 String po=op.concat(sp);
		 System.out.println(po);

		 // it value are StringBuilder using design this is very fast and mutable class

		 StringBuilder s1=new StringBuilder("sheeba ");
		 StringBuilder s2=new StringBuilder("sangeetha");

		 StringBuilder cv=s1.append(s2);

		 System.out.println(cv);

		 //using format()method
		 
		 String q="sudharsan";
		 int num=10;

		 String e=String.format("%s%d",q,num);
		 System.out.println(e);

		 // using String.join() method
		 
		 String o="sudharsan";
		 String p="surya";
		 String res=String.join(" and ",o,p);
		 System.out.println(res);
		

		// substring
		//
		// using substring() using this method
		 System.out.println(o.substring(6));
		 
		 System.out.println(o.substring(2,6));

		 // split string
		 //
		 String ar="hai i am sudharsan from nilgirish";
		 String sentence[]=ar.split(" ");
		 for(String v:sentence)
			 System.out.println(v);
			 



		 System.out.println(Arrays.toString(sentence));






		 




	}

}
