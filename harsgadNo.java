package Day6;

public class harsgadNo {
	
	
	public static void Harsha(int n) {
		int m=n,sum=0;
		
			
  		while(n>0) {
			int r=n%10;
			sum=sum+r;
			
			
			
			n=n/10;
		}
  		if (m%sum==0) {
  			System.out.println("Harshad");
  			return;
  			
  			
  		}
  		System.out.println("Harshad not");
  		
  		
  		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Harsha(172);
	}

}
