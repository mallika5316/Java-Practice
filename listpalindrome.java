package Day6;

public class listpalindrome {
	static int reverseDigits(int num)
    {
        int rev_num = 0;
        while (num > 0) {
            rev_num = rev_num * 10 + num % 10;
            num = num / 10;
        }
        return rev_num;
    }
	
	static int isPalindrome(int n)
    {
     
      
        int rev_n = reverseDigits(n);
     
        
        if (rev_n == n)
            return 1;
        else
            return 0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=6;i<65;i++) {
	if(isPalindrome(i)==1) {
		System.out.println(i);
	}
}
	}

}
