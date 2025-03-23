package arayConcept;

public class compareArrange {
	public static void arrabge(int a[],int n) {
		int m=a[n-1];
		int b[]=new int[n];
		int i=0,j=n-1,k=0;
		                                                    
//			for(i=0;i<n;i++) {
//				if(a[i]<=a[j]) {
//				b[k++]=	a[i];
//				}
//			}
//			for(i=0;i<n;i++) {
//				if(a[i]>a[j]) {
//					b[k++]=a[i];
//				}
//			}
		
		
		
		
		for(i=0;i<n;i++) {
			System.out.println(b[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[]= {46,57,92,122,65,97,70,90};
      int n=a.length;
      
      arrabge(a, n);
	}

}
