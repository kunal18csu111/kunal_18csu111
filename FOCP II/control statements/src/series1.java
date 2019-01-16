import java.util.*;
class series1
{
	public static void main(String[] args){
		
		System.out.println("enter the values of x and i");
		

		Scanner value = new Scanner(System.in);

		double x = value.nextDouble();
		double n = value.nextDouble();

		double i,Total=1.0;
		for(i=1;i<=n;i++)
		{
			Total=Total+(Math.pow(x,i)/i);
		}
		System.out.println(Total);
		
	}
}