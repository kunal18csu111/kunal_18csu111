import java.util.Scanner;
class employee
{
	public employee()
	{
		String empName[],empDepartment[],empCity[];
	}
	public employee(int empol)
	{
		int empCode[],empSalary[];
	}
	public static void main (String args[]){
		System.out.println("Enter The details of employee");
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the no. of letters in your name");
		int n=scan.nextInt();
		String empName[]=new int[n];
		System.out.println("Enter employee Name");
		for(int i=0;i<n;i++)
		{
			empName[i]=scan.next().charAt(0);
		}
		System.out.println("Enter the 8 digit empcode");

		int empCode[]=new int[8];
		for(int i=0;i<n;i++)
		{
			empCode[i]=scan.nextInt();

		} 
		System.out.println("enter the name of empDepartment");
		System.out.println("enter the no. of letters of department");
		int s;
		int s=scan.nextInt();
		String empDepartment[]=new int[s];
		for(int i=0;i<n;i++)
		{
			empCode[i]=scan.next().charAt(0);
		}
		System.out.println("enter the name of empCity");
		System.out.println("enter the no. of letter of city");
		int c;
		int c=scan.nextInt();
		String empCity[]=new int[c];
		for( i=0;i<n;i++)
		{
			empCity[i]=scan.next().charAt(0);
		}
		System.out.println("enter the empSalary");
		System.out.println("enter the number of salaray digit ");
		int sl;
		int sl=scan.nextInt();
		int empSalary[]=new int[sl];
		for(i=0;i<sl;i++)
		{
			empSalary[i]=scan.nextInt();
		}
		System.out.println("");
		System.out.println("code of employee");
		for(i=0;i<8;i++)
		{
		System.out.println(empCode[i]);
		}
		System.out.println("Details of employee");
		for(i=0;i<n;i++)
		{
			System.out.println(empName[i]);
		}
		System.out.println(" ");
		System.out.println("employee department");
		for(i=0;i<s;i++)
		{
			System.out.println(empDepartment[i]);
		}
		System.out.println(" ");
		System.out.println(" employee city ");
		for(i=0;i<c;i++)
		{
			System.out.println(empCity[i]);
		}
		System.out.println(" ");
		System.out.println(" the salary of empluyee");
		for(i=0;i<sl;i++)
		{
			System.out.println(empSalary[i]);
		}

	}
}