import java.util.Scanner;
class sumarry
{


	public static int sum(int [] arr){
		int sum1=0;
	for(int i=0;i<=n;i++)
	{
		sum1=sum1+arr[i];
	}
	System.out.println(sum1);
	return sum1;
}
}
public int largestnum(int large)
{
	
	arr[0]=large;
	for(int i=0;i<5;i++)
	{
		if(large<arr[i])
		{
			arr[i]=large;
		}
	}
	System.out.println("largest number is "+large);
	return large;

}
public int smallnum(int small)
{
	
	arr[0]=small;
	for(int i=0;i<5;i++)
	{
		if(small>arr[i])
		{
			arr[i]=small;
		}
	}
	System.out.println("smallest number is"+small);
	return small;
}
public int secondnum(int second)
{
	
	arr[0]=second;
	for(int i=0;i<5;i++)
	{
		if(arr[i]!=large)
		{
			if(arr[i]>second)
			{
				arr[i]=second;
			}
		}
	}
	System.out.println("second largest num"+second);
	return second;


}
public int sumalt(int suma,sumb)
{
	
	suma=arr[0]+arr[2]+arr[4];
	sumb=arr[1]+arr[3]+arr[5];
	System.out.println("sum of alternate numbers 0,2,4="+suma+"sum of alternate numbers 1,3,5="+sumb);
	return suma ,sumb;
}
public int sumeven(int sumev)
{


for(int i=0;i<5;i++)
{
	if(arr[i]%2==0)
	{
		sumev=sumev+arr[i];
	}
	return sumev;
}
System.out.println("sum of even numbers="+sumev);
}

	public static void main(String args[])
	{
		Scanner values = new Scanner(System.in);

		for(int i=0;i<5;i++)
		{
			int arr[i]= values.nextInt();
		}
		for(i=0;i<5;i++)
		{
			System.out.println(i+"-"+arr[i]);
		}
		
		System.out.println("select no. from 1 to 6");
		int y=values.nextInt();
		if(y==1)
		{
			sum(sum1);
			
		}
		else if(y==2)
		{
			sumarry largeobj = new sumarry();
			largeobj.largestnum(large);
			
		}
		else if(y==3) {

			sumarry smallobj = new sumarry();
			smallobj.smallnum(small);
			

			
		 
			
		}
		else if(y==4)
		{
			sumarry secondobj = new sumarry();
			secondobj.secondnum(second);
			
			
		}
		else if(y==5)
		{
			sumarry sumabobj = new sumarry();
			sumabibj.sumalt(suma,sumb);
			
			
		}
		else if(y==6)
		{
			sumarry sumevobj = new sumarry();
			sumevobj.sumeven(sumev);
			
			
		}
	}