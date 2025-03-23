package Day6;

public class decTobiRecusion {
	public static int decitoBinary(int n) {
		int sum=0,i=1;
		while(n>0) {
			int r=n%2;
			sum+=r*i;
			n=n/2;
			i=i*10;
		}
		return sum;

	}
	
	
	
	public static int decitoBinaryR(int n) {
	    if (n == 0) {
	        return 0;
	    }
	    return (n % 2) + 10 * decitoBinary(n / 2);
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
