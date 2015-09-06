import java.util.Scanner;

public class E10 {
	
	public static void main(String args[]){
		System.out.println("Enter the number to Find the sum of all the primes below of :");
		long n = new Scanner(System.in).nextLong();
		long sum = 0;
		for (long i=2;i<n;i++){
			if (isPrime(i)){
				sum+=i;
			}
		}
		System.out.println(sum);
		
	}
	public static boolean isPrime(long number){
		for (long m=2;m<number;m++){
			if (number % m == 0)
			return false;
			}
			return true;
	}
	
}