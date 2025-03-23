package Day6;

public class allHamming {
	public static int hamming(int n) {
		if(n%2==0 || n%3==0 ||n%5==0) {
			return 1;
		}
		else {
			return 0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0,k=1,n=15;
	      while(count<n) {
	    	  if(hamming(k)==1) {
	    		  System.out.println(k);
	    		  count++;
	    	  }
	    	  k++;
	      }
	}

}
