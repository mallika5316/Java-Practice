package arayConcept;

public class allProgram {
	
	
	public static void sum(int arr[],int n) {
		int sum=0, product=1;
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];
			System.out.println(sum);
			product*=arr[i];
		}
		
		System.out.println(sum + " "+ product);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {3,6,2,8,9};
int n=arr.length;
sum(arr, n);


}
}
