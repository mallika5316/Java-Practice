package arayConcept;

public class oddeven {
	public static void oddev(int arr[],int n) {
		int c1=0,c2=0;
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				c1++;
			}else {
				c2++;
			}
		}
		System.out.println(c1+ " "+ c2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,6,2,8,9};
		int n=arr.length;
		oddev(arr, n);
		
	}

}
