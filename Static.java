class Parent
{
	static int y=4;
	//public static void f1()//both function should be static
	//{
	//	System.out.println("hello");
	// }
}
class Child extends Parent
{	
	static
	{
		y=5;//static member variable dont inherit
	}
	//public static void f1()//if static than function hidding else function overriding
	//{
	//	System.out.println("hi");
	//} 
}
public class Static
{
	public static void main(String []args)
	{
		//Child.f1();
		System.out.println("y="+Child.y	);//y=4
	}	
}