import java.util.Scanner;
class question1
{
	public static void main (String args[]){
		System.out.println("enter the lenght of string");
		int n,i;
		Scanner scan = new Scanner(System.in);
		n=scan.nextInt();
		int arry[] = new int[n];
		for(i=0 ;i<n;i++)
		{
			 arry[i]=scan.nextInt();
		}
		for(i=0;i<n;i++)
		{
			System.out.println(arry[i]+"");
		}
		for(i=0;i<n;i++)
		{
			if(arry[i]>n/2)
			{
				System.out.println("Majority elements :"+arry[i]);
			}
		}
	}
}