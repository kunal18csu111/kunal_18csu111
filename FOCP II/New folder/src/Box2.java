class Box{
	double width;
	double depth;
	double hieght;
	void setDim(double w , double h, double d)
	{
		this.width=w;
		this.hieght=h;
		this.depth=d;
	}
	double volume()
	{
		double volume = hieght * depth * width;
		return volume;
	}
}
class BoxDemo
{
	public static void main(String args[])
	{
		Box b=new Box();
		b.setDim(4,6,3);
		double vol=b.volume();
		System.out.println(vol);
	}
}