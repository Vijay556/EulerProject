class E1{public static void main(String args[]){
long a=0;for (int i=0; i< 1000; i++){
if(i%3 == 0 || i%5 == 0){
a+=i;
}
}
System.out.println("1. " + a);System.out.println("2. " + a);
}
}