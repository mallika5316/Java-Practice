package arayConcept;

public class printPattern {
	public static int name(int m) {
		for(int i=0;i<m;i++) {
			for(int j=0;j<m;j++) {
				if(i*j==0||i+j==m-1){
					System.out.print(m);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
		return 1;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {6,4,8};
		int n=arr.length;
		for(int i=0;i<n;i++) {
			name(arr[i]);
		}
	}

}
