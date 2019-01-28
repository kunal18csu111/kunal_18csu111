public class cylinder extends circle 
{
	private double hieght;

	public cylinder()
	{
		super();
		this.hieght=1.0;
	}
	public cylinder(double radius){
		super(radius);
		this hieght=1.0;
	}
	public cylinder(double radius,double hieght)
	{
		super(radius);
		this.hieght=hieght;

	}
	public cylinder(double radius,double hieght,String colour){
		super(radius,colour);
		this.hieght=h;

	}
	public double getvolume()
	{
		return super getArea()*hieght;
	}
}