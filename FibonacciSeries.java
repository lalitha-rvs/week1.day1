
package week1.day1.assignments;



public class FibonacciSeries {
	public static void main(String[] args) {
		//to find fibonacci series
		  int range = 8, firstNum = 0, secNum = 1;
	        System.out.print("Fibonacci Series of "+range+" numbers:");

	        for (int i = 1; i <= range; ++i)
	        {
	            System.out.print(firstNum+" ");

	            
	            int nextNum = firstNum + secNum;
	            firstNum= secNum;
	            secNum = nextNum;
	        }
	    }
}