class A
{
	public A()
	{
		System.out.println("A");
	}
}
class B extends A
{
	public B()
	{
		this(5);
		System.out.println("B 1");		
	}
	public B(int x)
	{
		System.out.println("B 2");
	}
}
public class Constructorchaining
{
	public static void main(String []args)
	{
		B obj =new B();
	}
}