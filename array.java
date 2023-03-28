//java arrays
//
//array object which contains elements of similer data types in element in contigious memeory.
//
//syntax:
//
//   datatype[] arr (or) datatype []arr;
//   datatype arr[];
//
//   instatiational array
//
//   arrayref = new datatype[size];
//


class array
{
	public static void main(String args[])
	{
		int arr[]={1,2,3,4,5,6};
		char []c_arr=new char[26];

		for(int i=0;i<26;i++)
			c_arr[i]=(char)(i+'a');
		for(int i:arr)
			System.out.println(i);

		for(char i:c_arr)
			System.out.println(i);

	}
}
