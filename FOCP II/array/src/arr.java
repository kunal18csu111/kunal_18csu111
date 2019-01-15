import java.util.Scanner;
class arr
{
	public static void main(String args[])
	{
		int i=0,number;
    int ard[]= new int[10];
    Scanner scan= new Scanner(System.in);
    for( i=0;i<10;i++)
    {
    	ard[i]= scan.nextInt();
    }
    for(i=0;i<10;i++)
    {
    	System.out.println(i+"-"+ard[i]);
    }
    
    
    System.out.println("enter the value to be find");
    Scanner find=new Scanner(System.in);
    number= find.nextInt();

    for(i=0;i<10;i++)
    {
    	if(ard[i]==number)
    	{
    	System.out.println(i+"- " + ard[i] + "" );
        }
        else
        {
        	System.out.println( "-1 ");
        	break;
        }

    
	}
}
}