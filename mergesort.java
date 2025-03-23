package arayConcept;

public class mergesort {
	public static void merge(int a[],int b[]) {
		int l1=a.length;
		int l2=b.length;
		int k[]=new int[l1+l2];
		int i=0,j=0,p=0;
		
		while(i<l1 && j<l2) {
			if(a[i]<b[j]) {
				k[p++]=a[i++];
			}
			else {
				k[p++]=b[j++];
			}
		}
		
		while(i<l1) {
			k[p++]=a[i++];
		}
		while(j<l2) {
			k[p++]=b[j++];
		}
		
		
		for(p=0;p<k.length;p++) {
			System.out.println(k[p]);
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[]= {2,5,7,9};
     int b[]= {3,6,8};
     merge(a,b);
     
	}

}
