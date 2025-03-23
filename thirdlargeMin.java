package arayConcept;

public class thirdlargeMin {

	public static void large(int a[],int n) {
		int l1=0,l2=0,l3=-1;
		 int m1= a[n-1],m2=a[n-1],m3=a[n-1];
		
		for(int i=0;i<n;i++) {
			if(a[i]> l1) {
				l1=a[i];
			}
			if(a[i]<m1) {
				m1=a[i];
			}
		}
		for(int i=0;i<n;i++) {
			if(a[i]> l2 && a[i]!=l1) {
				l2=a[i];
			}
			if(a[i]<m2 &a[i]!=m1) {
				m2=a[i];
			}
		}
		for(int i=0;i<n;i++) {
			if(a[i]> l3 && a[i]!=l2 &&a[i]!=l1) {
				l3=a[i];
			}
			if(a[i]<m3 &&a[i]!=m2&&a[i]!=m1) {
				m3=a[i];
			}
		}
		  
		
		System.out.println(l3 + " "+ m3);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {46,57,92,122,65,97,70,90};
	      int n=a.length;
	      large(a, n);
	}

}
