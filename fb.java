import java.util.Scanner;
public class fb {
	private static Scanner tastiera;
	public static long fibonacci(long number) {
		      if ((number == 0) || (number == 1))
		         return number;
		      else
		         return fibonacci(number - 1) + fibonacci(number - 2);
		   }
		   public static void main(String[] args) {
	         //This is the iterative version of 
		     //the list of fibonacci    
		   tastiera = new Scanner(System.in);
		     int n = tastiera.nextInt();
		     System.out.println("Inserire numero da cui generare la serie: " + n);
                 for (int counter = n;n>0 || n>=0;n++,counter++){
		         if(counter>=10000)
		        	 {
		        	  System.out.println("Interrompi è troppo lungo da generare.");
		        	  break;
		        	 }
                	 System.out.printf("Fibonacci di %d è: %d\n",
		         n, fibonacci(n));
		      }
       }
}
