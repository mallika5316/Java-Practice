package pattern;

public class P1 {
public static void pa1(int n) {
		
		

		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j<n/2 &&i+j>n/2 && i-j<n/2) {
				System.out.print("*");}
				else {
					System.out.print(" ");
				}
				
		}
			System.out.println();}}

public static void pa2(int n) {
	
	

	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if(j<n/2 &&i+j>n/2 && i-j<n/2) {
			System.out.print(j);}
			else {
				System.out.print(" ");
			}
			
	}
		System.out.println();}}




public static void pa6(int n) {
	
	

	for(int i=0;i<n;i++) {
		int k=65+n/2;
		for(int j=0;j<n;j++) {
			if(j<n/2 &&i+j>n/2 && i-j<n/2) {
			System.out.print((char)k);
			k--;}
			else {
				System.out.print(" ");
			}
			
	}
		System.out.println();}}

public static void pa3(int n) {
	
	

	for(int i=0;i<n;i++) {
		int k=n/2;
		for(int j=0;j<n;j++) {
			if(i>0 &&i-j>0&&i+j<n-1) {
			System.out.print((k));
			
			k--;
			}
			else {
				System.out.print(" ");
			}
			
	}
		System.out.println();}}


public static void pa4(int n) {
	
	

	for(int i=0;i<n;i++) {
		int k=65+n/2;
		for(int j=0;j<n;j++) {
			if(i>0 &&i-j>0&&i+j<n-1) {
				
			System.out.print((i-j));
				
			
			}
			else {
				System.out.print(" ");
			}
			
	}
		System.out.println();
		}
	}


public static void pa5(int n) {
	
	

	for(int i=0;i<n;i++) {
		
		 int k=65+n/2;
		for(int  j=0;j<n;j++) {
			if(i>0 &&i-j>0&&i+j<n-1) {
			System.out.print((char)(k));
			k--;
			}
			else {
				System.out.print(" ");
			}
			
	}
		System.out.println();
		
		}
	}


public static void pa7(int n) {
	
	

	for(int i=0;i<n;i++) {
		int k=65+n/2;
		for(int j=0;j<n;j++) {
			if(j<n/2 &&i+j>n/2 && i-j<n/2) {
			System.out.print((char)k);
			}
			else {
				System.out.print(" ");
			}
			k--;
	}
		System.out.println();}}



public static void pa8(int n) {
	
	for(int i=0;i<n;i++) {
	int	k=n/2-2;
		for(int j=0;j<n;j++) {
			if(j<n/2 &&i+j>n/2 && i-j<n/2) {
			System.out.print(k);
			k--;
			}
			else {
				System.out.print(" ");
			}
			
	}
		System.out.println();}}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
pa1(11);
System.out.println();

pa2(9);
System.out.println();
pa3(11);
pa4(9);
pa5(9);
pa6(11);
pa7(11);
pa8(11);
	}

}
