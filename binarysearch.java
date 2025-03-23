package arayConcept;

public class binarysearch {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a[]= {10,3,4,8,5};
   int k=9;
   int l=0,r=a.length-1;
   while(l<=r) {
	   int mid=l+(r-l)/2;
	   if(k==a[mid]) {
		   System.out.println(a[mid] + " found");
		   return;
	   }
	   if(k<a[mid]) {
		   r=mid-1;
	   }
	   else {
		   l=mid+1;
	   }
   }
   
	}

}
