import java.util.*;

class Main{

public static void main(String[] args)
{
	ArrayList<Integer> arrl=new ArrayList<>();
	
	for(int i=0;i<10;i++)
	arrl.add(i);


	arrl.forEach(n->System.out.println(n));
	arrl.forEach(n->{if(n%2==0)System.out.println(n);});
}

}

	
