package arayConcept;

public class evenoddindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {5,8,7,2,6,1};
int n=a.length;
int ar[]=new int[n];
int j=0;
for(int i=0;i<n;i+=2) {
	
		ar[j]=a[i];
		j++;
	}
for(int i=1;i<n;i+=2) {

		ar[j]=a[i];
		j++;
	
}

for(int i=0;i<n;i++) {
	System.out.println(ar[i]);
}
	}

}
