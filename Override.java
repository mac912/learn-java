class A//car
{
	public void f1(int x)
	{
		System.out.println("hello A");
	}

}
class B extends A//sportscar
{

	public void f1(int x)            //Here it override
	{
		System.out.println("hello B");
	}
}
public class Override
{
	public static void main(String []args)
	{
		B obj = new B();
		obj.f1(5);
		obj.f1(6);
	}
}