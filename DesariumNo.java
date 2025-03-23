package Day6;

public class DesariumNo {
	
	public static int lenth(int num) {
        int length = 0;
        while (num > 0) {
            num /= 10;
            length++;
        }
        return length;
    }
	 public static int power(int n,int exp) {
	        int result = 1;
	        for (int i = 0; i < exp; i++) {
	            result *= n;
	        }
	        return result;
	    }
	public static int Desa(int n) {
		int m=n,sum=0;
		int l=lenth(m);
			
  		while(n>0) {
			int r=n%10;
			sum=sum+power(r,l);
			
			l--;
			
			n=n/10;
		}
  		if (sum==m) {
  			System.out.println("Darial");
  			return 1;
  		}
  		System.out.println("Darial not");
  		return 0;
  		
  		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.out.println(Desa(175));
	}

}
