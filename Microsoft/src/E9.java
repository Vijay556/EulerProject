public class E9 {
	
	public static void main(String args[]){
		long sqrA,sqrB,sqrC,sqrAplusB;
		int add;
	for (int a = 0; a<=998;a++){
		for (int b=0;b<=999;b++){
			for (int c=0;c<=1000;c++){
				sqrA = a*a;
				sqrB = b*b;
				sqrC = c*c;
				sqrAplusB = sqrA + sqrB;
				add = a+b+c;
				if (a<b && a<c && b<c && sqrAplusB == sqrC && add ==1000){
				System.out.println(a + " X " +b+ " X " +c+ " = "+ a*b*c);
				}
				
			}
		}
	}
}
	}
	
