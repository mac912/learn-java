abstract class Person
{
	abstract void show();	
}
class Student extends Person
{
	void show()
	{
		//code
	}
}
public class Abstractmethod
{
	public static void main(String []args)
	{
		Student s= new Student();
		s.show();	
	}
}