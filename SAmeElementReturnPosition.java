package arayConcept;

public class SAmeElementReturnPosition {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {15,17,18,19,19,20,20};
int n=a.length;
for(int i=1;i<n;i++) {
	if(a[i-1]==a[i]) {
		System.out.println(i-1);

		
	}
}
	}

}
