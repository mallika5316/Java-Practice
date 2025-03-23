package pattern;

public class M {
public static void Ee(int n) {
		
		

		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i-j==0 && j<n/2 || j==0||j==n-1|| i+j==n-1&&j>n/2) {
				System.out.print("*");}
				else {
					System.out.print(" ");
				}
				
		}
			System.out.println();}}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Ee(8);
	}

}
