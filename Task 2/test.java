package pkgtry.pkgcatch;

import java.util.Scanner;


public class TryCatch {

   
    public static void main(String[] args) {
        try{
        int a[]=new int[6];

          Scanner scan =new Scanner(System.in);
          for(int i=0; i<=a.length; i++)
            {
                System.out.println("enter the number:");  
                a[i]= scan.nextInt();
                
            }//end_for
          
            for(int i=0; i<=a.length; i++)
            {
                System.out.println(a[i]);
            }//end_for

        }//end try
        catch(Exception e){
            System.out.println("index larger than size of array");
        }//end catch
    }//end main
    
}//end TryCatch
