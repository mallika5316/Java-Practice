package pattern;

public class O {public static void Oo(int n) {
	
	

	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if(i==0|| j==n-1 ||i==0 ||i==n-1||j==0) {
			System.out.print("*");}
			else {
				System.out.print(" ");
			}
			
	}
		System.out.println();}}

public static void p(int n) {
	
	

	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if(j==0||i==0 ||i==n/2||j==n-1&&i<n/2) {
			System.out.print("*");}
			else {
				System.out.print(" ");
			}
			
	}
		
		System.out.println();}}
public static void Q(int n) {
	
	

	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if(j==0 && i<3*n/4||i==0 && j<3*n/4 ||i==3*n/4 && j<n-1||j==n-2&&i<3*n/4|| i-j==0 && i>n/2-1) {
			System.out.print("*");}
			else {
				System.out.print(" ");
			}
			
	}
		System.out.println();}}


public static void Rr(int n) {
	
	

	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if(i==0|| j==n-1 && i<n/2 ||i==n/3+1||j==0 || i-j==n/3) {
			System.out.print("*");}
			else {
				System.out.print(" ");
			}
			
	}
		System.out.println();}}





public static void Ss(int n) {
	
	

	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if(i<n/2 && j==0||i==n/2|| j==n-1 && i>n/2||i==0 ||i==n-1) {
			System.out.print("*");}
			else {
				System.out.print(" ");
			}
			
	}
		
	System.out.println();}}



public static void Tt(int n) {
	
	

	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if(i==0 ||j==n/2) {
			System.out.print("*");}
			else {
				System.out.print(" ");
			}
			
	}
		System.out.println();}}





public static void Uu(int n) {
	
	

	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if(j==n-1 ||i==n-1||j==0) {
			System.out.print("*");}
			else {
				System.out.print(" ");
			}
			
	}
		System.out.println();}}


public static void vv(int n) {
	
	

	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if(i-j==0&&i<n/2 ||i+j==n-1&& j>n/2) {
			System.out.print("*");}
			else {
				System.out.print(" ");
			}
			
	}
		System.out.println();}}



public static void ww(int n) {
	
	

	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if(i-j==0 && j>n/2 || j==0||j==n-1|| i+j==n-1&&j<n/2) {
			System.out.print("*");}
			else {
				System.out.print(" ");
			}
			
	}
		System.out.println();}}


public static void xx(int n) {
	
	

	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if(i-j==0  ||i+j==n-1) {
			System.out.print("*");}
			else {
				System.out.print(" ");
			}
			
	}
		System.out.println();}}


public static void yy(int n) {
	
	

	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if(i-j==0 && j<n/2 ||i+j==n-1) {
			System.out.print("*");}
			else {
				System.out.print(" ");
			}
			
	}
		System.out.println();}}


public static void zz(int n) {
	
	

	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if(i+j==n-1||i==0||i==n-1) {
			System.out.print("*");}
			else {
				System.out.print(" ");
			}
			
	}
		System.out.println();}}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Oo(8);
		p(8);
//	Q(8);	
//		Rr(8);
//		Ss(8);
//Tt(8);
//		Uu(8);
//		vv(10);
//		ww(8);
//		
//		xx(9);
//		yy(9);
		
//		zz(9);
		
	}

}
