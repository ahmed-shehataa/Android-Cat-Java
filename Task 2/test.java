import java.util.Scanner;
 class task_2 {
	static  int r;
	static	int h;
	static double pie=3.14;
 
	public static void main(String[] args) {
        cylinder();
        circle k = new circle();
        k.circle_area();
 
 
    }
	public static void cylinder() {
		Scanner m = new Scanner(System.in);
 
		//Height				
		h =m.nextInt();
		r = m.nextInt();	   
	    //Radius	    
	    double volume = pie*(r*r)*h;
	    double area = 2*pie*r*(r+h);
	    System.out.println("volume = "+volume);
	    System.out.println("area = "+area); 
 
 
	}
	static class circle extends task_2 {
 
		public static void circle_area(){
			circle a = new circle();
			double area = a.pie *a.r *a.r;
			System.out.println("circle area= "+area);
 
		}
	}
 
}









2_
  
  import java.util.Arrays;
import java.util.Scanner;
 
 class cat_3 {
   public static void main(String args[]) {
		int n;				
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no. of elements you want in array:");
       n = s.nextInt();
       int m = n-1; //used in last line
		int num [] = new int [n];						
		for (int i = 0; i < n; i++) {
			num [i] = s.nextInt();			
		}	   	   	   	 
      System.out.println("Elements in the array are:: ");
      System.out.println(Arrays.toString(num));     
      System.out.println("Enter the index of the required element ::");
      try {
         int element = s.nextInt();
         System.out.println("Element in the given index is :: "+num[element]);
      } catch(Exception e) {
         System.out.println("The index you have entered is invalid");
         System.out.println("Please enter an index number between 0 and " +m);
      }
   }
}
