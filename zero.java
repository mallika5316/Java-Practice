package pattern;

public class zero {
public static void zero(int n) {
		
		

		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0|| j==n-1 ||i==0 ||i==n-1||j==0) {
				System.out.print("*");}
				else {
					System.out.print(" ");
				}
				
		}
			System.out.println();}}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
zero(8);
	}

}
