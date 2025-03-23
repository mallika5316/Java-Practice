package Day6;

public class hammingNo {
	
	
	public static void hamming(int n) {
		if(n%2==0 || n%3==0 ||n%5==0) {
			System.out.println("hamming no");
		}
		else {
			System.out.println("not");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
hamming(15);
	}

}
