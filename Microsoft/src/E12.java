public class E12 {
	
	public static void main(String args[]){
	
		int count=0;
		long n;
			for(n = 1;n<=1000000;n++){
				count=0;
			for(long i=1;i <= n;i++){
			    if(n%i == 0){  
			    	count++;
			    	
			    }
			    }
			if(count>=500){
				System.out.println(n);
				break;
			}
			}
			    
			    		
			    	System.out.println(count);
			    
			    
			    
		
			
		
	}
	}
//22734