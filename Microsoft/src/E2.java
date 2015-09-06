class E2{public static void main(String args[]){
long a = 1;
long b = 2;
long sum = 2;
long i =3;while(i<=4000000){
if (i%2 == 0){
sum+=i;
}
a=b;
b=i;
i=a+b;
}
System.out.println(sum);
}
}