package pattern;

public class nine {
public static void nine(int n) {
		
		

		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==n/2||i==0||i==n/2|| j==n-1 ||i==0 ||j==0 &&i<n/2||j==n-2) {
				System.out.print("*");}
				else {
					System.out.print(" ");
				}
				
		}
			System.out.println();}}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
nine(8);
	}

}
