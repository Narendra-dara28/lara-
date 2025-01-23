abstract class interface1
{
	abstract void print();

	abstract void display();
}
abstract class interface2 extends interface1
{
	public void print()
	{
		System.out.println("balaji");
	}
}
class interface3 extends interface2
{
	public void display()
	{
		System.out.println("narendra");
	}
}
class Abstract6
{
	public static void main(String[]args)
	{
		
	interface3 obj=new interface3();
	//interface2 obj=new interface2();
	obj.print();
	obj.display();
}
}
