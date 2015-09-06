import java.util.Scanner;
public class E7 {
public static void main(String args[]) {
System.out.println("Enter the position’s prime number to be printed:");      
int count=0;
long n = new Scanner(System.in).nextLong();
for (long i=2;i<=1000000000;i++){
if(isPrime(i)){
count=count+1;
if(count == n)
System.out.println(i);
else if(count > n)
break;

}
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
