package Day6;

public class lucas {
	public static void  LucasN(int n) {
		int n1=2,n2=1,temp;
		System.out.println(n1);
		System.out.println(n2);
		for(int i=2;i<n;i++) {
			temp=n2;
			n2=n1+n2;
			n1=temp;
			System.out.println(n2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=10;
LucasN(n);
	}

}
