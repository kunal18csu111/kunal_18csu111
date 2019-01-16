import java.util.*;
class series1
{
	public static void main(String[] args){
		
		System.out.println("enter the values of x and i");
		

		Scanner value = new Scanner(System.in);

		int x = value . newInt();
		int n = value . newInt();

		double i,Total=1.0;
		for(i=1;i<=n;i++)
		{
			Total=Total+(Math.pow(x,i)/i);
		}
		System.out.println(Total);
		
	}
}