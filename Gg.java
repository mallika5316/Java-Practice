package pattern;

public class Gg {
public static void Gc(int n) {
		
		

		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				
				
				 //  if(i==0||j==0||(i==n-1&&j<=3*n/4)||(j==3*n/4&&i>=n/2)||(i==n/2&&(j<=3*n/4&&j>=n/2))||(j==n/2&&(i>=n/2&&i<=3*n/4))||(i==3*n/4&&(j<=n/2&&j>=n/4))||(j==n/4&&(i>=n/4&&i<=3*n/4))||(i>=n/4&&j==n-1)||(i==n/4&&j>=n/4))

				if(j==0||i==0||i==n-1&&j<=n/2 || j==n/2 && i>=n/2 ||i==n/2 &&j>n/2 || j==n-1&& i>n/2) {
				System.out.print("*");}
				else {
					System.out.print(" ");
				}
				
		}
			System.out.println();}}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
Gc(8);
	}

}
