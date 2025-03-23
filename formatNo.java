package Day6;

public class formatNo {
	
	 public static double pow(double n,double exp) {
	        long result = 1;
	        for (int i = 0; i < exp; i++) {
	            result *= n;
	        }
	        return result;
	    }  
	 
	 public static void format(int n) {
		 for(int i=0;i<n;i++) {
			 double p=pow(2, i);
			 
			 double r=pow(2, p)+1;
			 System.out.println(r);
		 }
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
format(10);
	}

}
