package Day6;

public class Duck {
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
	 
	 
	 public static  void uck(int n) {
		 int m=n;
		 int l=lenth(m);
	
		
		 if(m/power(10, l-1)==0) {
			 System.out.println("Not a Duck number");
			 return;
		 }
		 
		 while (n>0) {
			int r=n%10;
			
			if(r==0) {
				System.out.println("duck number");
				return;
			}
			n=n/10;
		}
		 System.out.println("not duck number");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
uck(987);
	}

}
