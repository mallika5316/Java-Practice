package arayConcept;

public class moveZero {
	 public static void moveZeroes(int[] nums) {
	       int n=nums.length;
	       if(nums[0]==0){
	        System.out.println(nums[0]);
	       }
	       for(int i=0;i<n-1;i++){
	        for(int j=0;j<n-i-1;j++){
	            if(nums[j]==0){
	                nums[j+1]=nums[j]+nums[j+1]-(nums[j]=nums[j+1]);
	            }
	        }
	       }
	       for(int i=0;i<n;i++){
	        System.out.println(nums[i]);
	       }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {4,3,0,1,4,2,0,0,3,0,6,0};
moveZeroes(a);
	}

}
