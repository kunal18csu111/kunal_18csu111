class pascalt
{
	public static void main(String args[])
	{
		System.out.println("pascal triangle :  ");
		int blk,c=1;
		for(int i=0;i<5;i++)
		{
			for(blk=1;blk<=5-1;blk++)
			{
			
				System.out.print(" ");
			}
			for(int j=0;j<=5;j++)
			{
				if(j==0||i==0)
				{
					c=1;
				}
				else
				{
					c=c*(i-j+1)/j;
				}
			
				System.out.print(" "+c);
			}
			System.out.print("\n");
		
		}
	}
}