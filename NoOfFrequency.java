package arayConcept;


public class NoOfFrequency {
	
	public static int[] sort(int a[],int n) {
		for(int i=n-1;i>0;i--) {
			for(int j=n-1;j>n-i-1;j--) {
				if(a[j]<a[j-1]) {
					a[j]=a[j]+a[j-1]-(a[j-1]=a[j]);
				}
			}
		}
		return a;
	}
	public static void frequency(int arr[],int n) {
		
		int a[]=sort(arr, n);
		for(int i=0;i<n;i++) {
			int c=1;
			for(int j=i+1;j<n;j++) {
				
				
				if(a[i]==a[j] ) {
					c++;
					a[j]=-1;					
				}				
			}
			if(a[i]!=-1) {
			System.out.println(a[i]+" "+c);}}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {4,1,2,1,1,3,4,6,6,1};
int n=a.length;
frequency(a, n);
	}

}
