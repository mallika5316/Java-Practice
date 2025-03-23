package pattern;

public class Da {
public static void Dd(int n) {
		
		

		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==1 ||j==n-1||i==0||j==n-1||i==n||i==n-1) {
				System.out.print("*");}
				else {
					System.out.print(" ");
				}
				
		}
			System.out.println();}}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dd(8);
	}

}
