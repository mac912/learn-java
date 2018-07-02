class A
{	
	int a;
	public A(int x)//if constructor has arguments than we use super
	{	
		a=x;
		System.out.println("A");
	}
}
class B extends A
{
	public B()
	{
		super(5);
		System.out.println("B");
	}
}	
public class Constructor
{
	public static void main(String [] args)
	{
		B obj =new B();
	}	
}