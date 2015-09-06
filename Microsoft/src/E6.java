import java.lang.String;
public class E6 {
public static void main(String args[]) {
long sum1=0,sum2 = 0,temp = 0;
for(int i=1; i <= 100; i++){
sum1 = sum1 + (i*i);
temp = temp+i;
}
sum2 = temp * temp;
System.out.println(sum2-sum1);
}}