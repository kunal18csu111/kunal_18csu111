import java.util.Scanner;
class trycatch
{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();

		try{
			if(age<18)  
      throw new Exception("not valid");  
     else  
      System.out.println("welcome to vote");  
		}
  		catch(Exception e){
  			System.out.println(e.getMessage(e));
  			
  		}

  			finally{
  				System.out.println("finally block is always executed");
  			}  
  			System.out.println("rest of the code..."); 
		}
	
	
}