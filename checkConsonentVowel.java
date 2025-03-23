package Day6;

import java.util.Scanner;

public class checkConsonentVowel {
	
	
	public static void check(char y) {
		
		{
		if(y=='a' || y=='e' || y=='i'||y=='o' || y=='u' ) {
			System.out.println("ovel");
		}
		else {
			System.out.println("consonent");
		}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner b =new Scanner(System.in);
System.out.println("enter char");
char a=b.next().charAt(0);
check(a);
}

}
