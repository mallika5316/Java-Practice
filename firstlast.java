package arayConcept;

public class firstlast {
	public static void fistla(int a[],int n) {
//		int k[]=new int[n],j=0;
//		for(int i=0;i<n/2;i++) {
//			k[j]=a[i];
//			k[j+1]=a[n-i-1];
//			j=j+2;		
//		}
//		for(int i=0;i<n;i++) {
//			System.out.println(k[i]);
//		}
		
		
		
		int k[]=new int[n];
		int i=0,j=n-1,l=0;
		while(i<j) {
			k[l]=a[i];
			k[l+1]=a[j];
			i++;
			j--;
			l=l+2;			
		}
		
		for( i=0;i<n;i++) {
		System.out.println(k[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,6,2,8,9};
		int n=arr.length;
		fistla(arr, n);
	}

}
