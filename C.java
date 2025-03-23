package pattern;

public class C {
	
public static void Cc(int n) {
		
		

		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0 ||i==n-1||i==0||i==n-1) {
				System.out.print("*");}
				else {
					System.out.print(" ");
				}
				
		}
			System.out.println();}}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cc(8);
	}

}
