package arayConcept;

public class BestTime {
	public static int maxProfit(int[] prices) {
        int i=0, j=0, n=prices.length;
        int min=prices[n-1];
        int max=0;
        int res=0,k=0;
        for(i=0;i<n;i++){
            if(prices[i]<min){
               
                min=prices[i];
                k=i;
            }

        }
         System.out.println(min);
        for(j=0;j<n;j++){
            if(prices[j]>max &&j>k ){
                max=prices[j];
            }
        }
        System.out.println(max);

        if(min==prices[n-1]){
            return 0;
        }

    res=max-min;
    return res;

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int prices[] = {7,1,5,3,6,4};
System.out.println(maxProfit(prices));
	}

}
