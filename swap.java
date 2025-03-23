package arayConcept;

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int a[]= {4,8,4,9,2,4};
		int n=a.length;
		for(int i=0;i<n;i+=2) {
			int temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
		}
		for(int i=0;i<n;i++) {
		System.out.print(a[i]+" ");
		}
	}

}
