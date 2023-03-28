import java.util.*;


class Main
{

public static void main(String[] args)
{

	ArrayList<Laptop> laps=new ArrayList<>();

	laps.add(new Laptop("Apple",8,150000));
	laps.add(new Laptop("Acer",12,75000));
	laps.add(new Laptop("Dell",8,90000));
	laps.add(new Laptop("lenovo",4,35000));
	laps.add(new Laptop("HCL",150000));

}

}

class Laptop
{
String name;
int  ram;
float price;

Laptop(String name,int ram, float price)
{
this.name=name;
this.ram=ram;
this.price=price;
}

public String toString()
{
	return name+"  "+ram+"  "+price;
}

}


