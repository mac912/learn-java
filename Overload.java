class A
{
	public void f1(int x)
	{
		System.out.println("hello A");
	}
	public void f1(int x, int y)
	{
		System.out.println("hello B");
	}

}
class B extends A
{

	
}
public class Overload
{
	public static void main(String []args)
	{
		B obj = new B();
		obj.f1(5);
		obj.f1(5, 6);
	}
}