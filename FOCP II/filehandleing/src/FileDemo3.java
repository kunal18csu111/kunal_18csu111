import java.io.*;
import java.util.*;
class FileDemo3 {
   public static void main(String[] args) {
      File f = null;
      try {
            f = new File("kunal18csu111.txt");
            FileWriter fout = new FileWriter(f);
            BufferedWriter bout= new BufferedWriter(fout);
	     Scanner sc = new Scanner(System.in);
             System.out.print("\nEnter a String:");
 	     while(sc.hasNext()){
               bout.write(sc.nextLine());
               bout.newLine();
        }
            bout.close();
}         
    catch (Exception e) {
         
         e.printStackTrace();
      }    } }