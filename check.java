package arayConcept;

public class check {
	public static int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int r[]=new int[2];
        int k=0;
        if(n==0) return new int[]{-1,-1};

        for(int i=0;i<n;i++){
            //if(nums[i]!=target)  return new int[]{-1,-1};
            if(nums[i]==target){
                          r[k++]=i;
            }
        }
        
        return r;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1};
		int target = 8;
		int re[]=searchRange(nums, target);
		for(int i=0;i<re.length;i++) {
			System.out.println(re[i]);
		}
	}

}
