class Dummy 
{
	public final void somefuction()
	{
			
	}	
}
class Moredummy extends Dummy
{
	public void somefunction()//Can not be overriden so shows error
	{	

	}
}
public class Final
{
	private final int x;//if final not used x=0 if final keyword used x=blank
	private final static int y;//final variable once initialised than can not be ulterd
	static//static block
	{	
		y=5;
	}
	Final()
	{
		x=2;
	}
	public void fun()
	{
		//int k; local variables are by default blank
		final int k;//final are also blank but fixed can not be change 
	}
	public static void main(String []args)
	{
		Final f1=new Final();
	}
}