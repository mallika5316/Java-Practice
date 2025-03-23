package arayConcept;

public class split {
	
	public static void spliting(int a[],int n) {
		int a1[]=new int[(n+1)/2];
		int a2[]=new int[n-a1.length];
		
		for(int i=0;i<n/2;i++) {
			a1[i]=a[i];
		}
//		int j=0;
//		for(int i=n/2 ;i<n-1;i++) {
//			a[j++]=a[i];
//		}
//		
		for(int i=0;i<n;i++) {
			System.out.println(a1[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {46,57,92,122,65,97,70,90};
	      int n=a.length;
		
		
		
	}

}
