package Day6;

public class happNumber {
	
	
	
	public static int Happy(int n) {
		int m=n,sum=n;
		while(sum>9) {
			 sum=0;		
  		while(n>0) {
			int r=n%10;
			sum=sum+(r*r);
			
			
			n=n/10;
		}
  		
  		n=sum;
		}
		
		if(sum==1||sum==7)
		{
			return 1;
		}
		
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0,k=1,n=10;
	      while(count<n) {
	    	  if(Happy(k)==1) {
	    		  System.out.println(k);
	    		  count++;
	    	  }
	    	  k++;
	      }
//       System.out.println(t);
	}

}
