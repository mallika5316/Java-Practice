package arayConcept;

public class bubbleSort {
	public static void buble(int a[]) {
		int n=a.length;
//		for(int i=0;i<n-1;i++) {
//			for(int j=0;j<n-i-1;j++) {
//				if(a[j]>a[j+1]) {
//					a[j]=a[j]+a[j+1]-(a[j+1]=a[j]);
//				}
//			}
//		}
		
		
		
		
		//reverse:
		
//		for(int i=0;i<n-1;i++) {
//			for(int j=n-1;j>i;j--) {
//				if(a[j]<a[j-1]) {
//					a[j]=a[j]+a[j-1]-(a[j-1]=a[j]);
//				}
//			}
//		}
//		for(int i=0;i<n;i++) {
//			System.out.println(a[i]);
//		}
//		
//	}
		
		
		
		
		
		
		for(int i=n-1;i>0;i--) {
			for(int j=n-1;j>n-i-1;j--) {
				if(a[j]<a[j-1]) {
					a[j]=a[j]+a[j-1]-(a[j-1]=a[j]);
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {15,9,18,5,19,1,20};
		buble(a);
	}

}
