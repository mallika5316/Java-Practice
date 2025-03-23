package Day6;

public class armstrongnu {
	public static int lenth(int num) {
        int length = 0;
        while (num > 0) {
            num /= 10;
            length++;
        }
        return length;
    }

    public static int pow(int n,int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= n;
        }
        return result;
    }
	public static int Nar(int n) {
		int sum=0,w=n;
		int l=lenth(n);
		while(n>0) {
			int r=n%10;
			sum+=pow(r,l);
			n=n/10;
		}
		if(sum==w) return 1;
		else return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0,k=1,n=10;
	      while(count<n) {
	    	  if(Nar(k)==1) {
	    		  System.out.println(k);
	    		  count++;
	    	  }
	    	  k++;
	      }
	}

}
