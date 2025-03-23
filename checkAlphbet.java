package Day6;

import java.util.Scanner;

public class checkAlphbet {
public static void check(char y) {
		
		{
		if(y>='a' && y<='z' ||y>='A' && y<='Z' ) {
			System.out.println("alphabet");
		}
		else {
			System.out.println("not a alphabet");
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
