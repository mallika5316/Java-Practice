package arayConcept;

public class decimalTobinary {
	
	public static int convertion(int a) {
		int res=0;
		while(a>0) {
		int rev=a%10;
			 res=res*10+rev;
			 a=a/10;
		}
		return res;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {37,62,29,899,9};
		
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.println(convertion(arr[i]));
		}
	}

}
