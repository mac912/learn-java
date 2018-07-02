class A
{
	int x;//1
	public void f1()
	{
		
	}
}
class B extends A
{
	int x;//2
	public void f1()
	{
		super.f1();//to access class A function	
	}
	public void f2()
	{	
		int x;//3
		x=5;//1
		this.x=6;//2
		super.x=7;//3
	}
}
public class Super
{
	public static void main(String []args)
	{
		B obj = new B();
		obj.f1();
		obj.f2();
	}
}