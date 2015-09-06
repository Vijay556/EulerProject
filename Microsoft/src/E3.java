import java.util.Scanner;
public class E3 {
public static void main(String args[]) {

      //System.out.println("Enter the number:”);
      long n = new Scanner(System.in).nextLong();
  long temp =n;
  n = n/2;

   while(n>2){
if (temp%n==0){
if(isPrime(n)){
System.out.println(n);
break;}
}
n=n-1;
}
    }


    public static boolean isPrime(long number){
        for(long i=2; i<number; i++){
           if(number%i == 0){
               return false; //number is divisible so its not prime
           }
        }
        return true; //number is prime now
    }
}
