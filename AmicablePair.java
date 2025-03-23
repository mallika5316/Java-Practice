package Day6;

public class AmicablePair {
	public static int sumDivisor(int n) {
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		
		return sum;
	}
	
	
	public static void AmicalPair(int a,int b) {
		System.out.println(sumDivisor(a));
		System.out.println(sumDivisor(b));
		if(sumDivisor(a)==b && sumDivisor(b)==a) {
			System.out.println("number is amicable pair");
		}
		else {
			System.out.println("not amicable pair");
		}
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  AmicalPair(220, 284);
	}

}
