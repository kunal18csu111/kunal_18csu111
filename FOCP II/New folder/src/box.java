import java.util.Scanner;
class Box
{
	double width;
	double hieght;
	double depth;
	double volume(){
	double volume=width*hieght*depth;
	return volume;
	}

	void setDim(double w,double h,double d)
	{
		width=w;
		hieght=h;
		depth=d;


	}
}

class BoxDemo
{
	public static void main(Strings args[])
	{
		Scanner values= new Scanner(System.in);
		Box b= new Box ();
		System.out.println("enter width");
		width= values.nextInt();
		System.out.println("enter hieght");
		hieght=values.nextInt();
		System.out.println("enter depth");
		depth=values.nextInt();
		setDim();
		double volume= c.
		System.out.println(volume);

	}
}