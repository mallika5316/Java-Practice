package arayConcept;



public class selectionSort {
	public static void Selection(int a[]) {
		int n=a.length;
		for(int i=n-1;i>0;i--) {
			
			for(int j=i-1;j>-1;j--) {
				if(a[i]<a[j]) {
					a[i]=a[i]+a[j]-(a[j]=a[i]);
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
		Selection(a);
	}

}
