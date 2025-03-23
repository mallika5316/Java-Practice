package arayConcept;

public class primeornot {
	
	
	
	public static int prime(int n) {
		
		if(n%2==0 && n!=2 || n%3==0 && n!=3) {
			return 0;
		}
		for(int i=5;i*i<n;i+=6) {
			if(n%i==0 ||i*i<n &&n%(i+2)==0) {
				return 0;
			}
		}
		return 1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,6,2,8,9};
		
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int  j=0;j<n;j++) {
			System.out.print(prime(arr[j])+" ");
		}
	}

}
