import java.util.*;
class sumarry
{


	int sum(){
	for(int i=0;i<=n;i++)
	{
		sum=sum+arry[i];
	}
	System.out.println(sum);
	return sum;
}
}
int largestnum()
{
	int large;
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
int smallnum()
{
	int small;
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
int secondnum()
{
	int second;
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
int sumalt()
{
	int suma,sumb;
	suma=arr[0]+arr[2]+arr[4];
	sumb=arr[1]+arr[3]+arr[5];
	System.out.println("sum of alternate numbers 0,2,4="+suma+"sum of alternate numbers 1,3,5="+sumb);
	return suma ,sumb;
}
int sumeven()
{
int sumev;
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
class arrfun;
{
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
			System.out.println(sum());
			
		}
		else if(y==2)
		{
			System.out.println(large());
			
		}
		else if(y==3) {
			System.out.println(small());

			
		 
			
		}
		else if(y==4)
		{
			System.out.println(second());
			
		}
		else if(y==5)
		{
			System.out.println(suma(),sumb());
			
		}
		else(y==6)
		{
			System.out.println(sumev());
			
		}
	}
}