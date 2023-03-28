//ArrayList
//
// the size of the array is changed dynamically by array is fixed size not changeable.
//
//   ArrayList<object_type> name_of_list = new ArrayList<>();
//
//   note: in an array list we can store objects like (integer,String,character,boolean,double)
//         can not be stored primitive type data (int,boolean,float,char,double)

// here we used predefined methods are
//
//   .add()            -->to add item
//   .add(index,item)  -->insert item into crt index
//   .get(index)       -->access item on index
//   .set(index,item)  -->insert data into crt index
//   .removing(index)  -->removing item on index
//   .clear()          -->clear all data
//
//   sort arraylist using collection
//      Collections.sort(ArrayList_name);
//



import java.util.*;

class Main{
	public static void main(String[] args)
	{
  		ArrayList<Integer> numbers=new ArrayList<>();

  		Scanner input=new Scanner(System.in);
  		int n=input.nextInt();
  		for(int i=0;i<n;i++)
	  		numbers.add(input.nextInt());
		Collections.sort(numbers);


	System.out.println(numbers.get(0));// get data on arraylist particular index

	numbers.set(1,10);// to change arraylist value corresponding index

	numbers.remove(2); // remove the 2nd index element

	System.out.println(numbers.size());

	System.out.println(numbers);
         numbers.clear(); //// erase the all data

	}
	

}
