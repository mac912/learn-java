class Box
{
	private int l, b, h;
	public void setdimension(int l, int b, int h)
	{
		this.l=l;//this to call global instance variable
		this.b=b;
		this.h=h;
	}
	public void sendbox()//suppose a class Gifttaker 
	{
		Gifttaker gf=new Gifttaker();
		gf.acceptgift(this)//this contians caller object reference
	}	
}
public class This
{
	public static void main(String []args)
	{
		Box b1= new Box();
		b1.setdimension(5, 6, 7);
		b1.sendbox();
	}
}