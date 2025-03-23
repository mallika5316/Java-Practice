package arayConcept;

public class reversearray {
	
	
	
	public static void name(int a[],int n) {
		int i=0,j=n-1;
		while(i<j) {
			a[i]=a[i]+a[j]-(a[j]=a[i]);
			i++;
			j--;
		}
		for( i=0;i<n;i++) {
			System.out.println(a[i]);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {8,6,9,4,6};
		int n=a.length;
//		for(int i=0;i<n;i++) {
//			System.out.println(a[n-i-1]);
//		}
		
		
		name(a, n);
		
	}

}
