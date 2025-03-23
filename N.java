package pattern;

public class N {
public static void Nn(int n) {
		
		

		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i-j==0 || j==0||j==n-1) {
				System.out.print("*");}
				else {
					System.out.print(" ");
				}
				
		}
			System.out.println();}}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Nn(8);
	}

}
