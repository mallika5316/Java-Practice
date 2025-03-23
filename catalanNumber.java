package Day6;

import java.util.function.BinaryOperator;


public class catalanNumber {
	
	
//	
//	public static int fact(int a) {
//		int fact=1;
//		if(a==0||a==1) return 1;
//		else {
//			for(int i=a;i>0;i--) {
//				fact=fact*i;
//			}
//		}
//		return fact;
//	}
//	
//	public static int binar(int a,int b) {
////		int r=1;
////		if(b>a-b) {
////			b=a-b;
////		}
////		for(int i=0;i<b;i++) {
////			r=r*(a-i)/(i+1);
////		}
////		return r;
//		
//		
//		
//		
//		//other method:
//		
//	        return fact(a) / (fact(b) * fact(a - b));
//	    }
//	
//	
//	
//	public static int catal(int n) {
//		return binar(2*n,n)/(n+1);
//	}
//	
	
	
	
	
	 public static long fact(int a) {
	        long fact = 1;
	        for (int i = 2; i <= a; i++) {
	            fact *= i;
	        }
	        return fact;
	    }
	    
	    // Computes the binomial coefficient "a choose b" using factorials.
	    public static long binar(int a, int b) {
	        return fact(a) / (fact(b) * fact(a - b));
	    }
	    
	    // Computes the nth Catalan number using the formula: C(n) = binom(2n, n) / (n+1)
	    public static long catal(int n) {
	        return binar(2 * n, n) / (n + 1);
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=10;
for(int i=1;i<=n;i++) {
	System.out.println(catal(i));
}
		System.out.println(7+"\u00B2 + " );
		
	}

}
