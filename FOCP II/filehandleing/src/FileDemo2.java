import java.io.*;
 class FileDemo2 {
   
   public static void main(String[] args) {
      File f = null;
            try {
         
              f = new File("kunal18csu111.txt");
              FileReader fin = new FileReader(f);
	      BufferedReader bin= new BufferedReader(fin);
 	      String sr;
	      System.out.println("The contents of the file are: ");	
		 while((sr=bin.readLine())!=null){
                         System.out.println(sr);
                         
			} 
		}
		catch (Exception e) {
         
         e.printStackTrace();
     }
 } }
