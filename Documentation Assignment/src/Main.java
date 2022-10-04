
public class Main {

	public static void main(String[] args) {
		long result = 0;
		long n=50;
		
		long startTime = System.nanoTime(); 
		//result = rFibonacci(n);
		long endTime = System.nanoTime(); 
		result = iFibonacci(n);
		System.out.println("Time took: " + (endTime - startTime));
	}
	
	public static long rFibonacci (long n) {
		if (n <= 1) {
			return n;
		}
		return rFibonacci(n-1)+rFibonacci(n-2);
	} 
	
	public static long iFibonacci (long n) {
		 long result = 0;
		 long a = 1;
		for(int i = 0; i < n; i++) {
			long temp = result;
		    result = result + a;
		    a = temp;
		}
		return result;
	} 

}
