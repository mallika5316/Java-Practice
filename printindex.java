package arayConcept;

public class printindex {
	
	
	
	public static void oddev(int a[],int n) {
		for(int i=0;i<n;i++) {
			if(a[i]%2==0) {
				System.out.print(i+" ");
			}
		}
		for(int i=0;i<n;i++) {
			if(a[i]%2!=0) {
				System.out.print(i+" ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,6,2,8,9};
		int n=arr.length;
		oddev(arr, n);
	}

}
