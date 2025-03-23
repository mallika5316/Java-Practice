package arayConcept;

public class leftrotate {
	public static void dis(int a[],int n) {
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
	}
	
	public static void name(int a[],int i,int j) {
		
		while(i<j) {
			a[i]=a[i]+a[j]-(a[j]=a[i]);
			i++;
			j--;
		}
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {6,8,4,2,9};
		int n=a.length;
		int k=3;
		
		if(k>n) k=k%n;
		name(a, 0, k-1);
		name(a, k, n-1);
		name(a, 0, n-1);
		dis(a, n);
	}

}
