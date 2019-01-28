public class circle
{
	private double radius;
	private string colour;

	public circle()
	{
		this.radius = 1.0;
		this.colour="red";
	}
	public circle(double r,string c)
	{
		this radius = r;
		this.color= c;
	}
	public circle(double r)
	{
		this.radius = r;
		this.colour = "red";

	}
	public double getradius(){
		return radius;
	}
	public void setradius(double r){
		this.radius = r;
	}
	public string getcolour(){
		return colour;
	}
	public void setcolour(stings){
		colour= s;
	}
	public double getarea(){
		return 3.14*radius*radius;
	}
}