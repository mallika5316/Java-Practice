package Day6;

public class friendlyPair {
	public static int sum(int n) {
		int sum=0;
		while(n>0) {
			int r=n%10;
			sum=sum+r;;
			
			
			n=n/10;
		}
		return sum;
	}
	
	
	public static void friendly(int a, int b) {
		if(sum(a)/a==sum(b/b)) {
			System.out.println("friendly pair");
		}
		else {
			System.out.println("not");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
friendly(6, 28);
	}

}
