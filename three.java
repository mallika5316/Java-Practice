package pattern;

public class three {
	public static void Funct(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==n-1||(i==n/2||i==0)||j==n-1) {
				System.out.print("*");}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Funct(8);
	}

}
