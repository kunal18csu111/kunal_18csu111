class nullexption
{
	public static void main(String args[]){  
  try{  
   String data= null;  
   System.out.println(data.length());  
  }  
  catch(NullPointerException e)
  {
  	System.out.println(e);
  	}  
  finally{
  	System.out.println("block is  executed");
  }  
  System.out.println(" the code...");  
  }  
} 

