package pattern;

public class specialPattern {
public static void special(int n) {
		
		

		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i*j==0||j==n-1||i==n-1||i==n/4 && j>=n/4 && j<=3*n/4||i==(n/2)&&!(j>n/4-1 && j<3*n/4)||i==3*n/4 && j>=n/4 && j<=3*n/4) {
				System.out.print("*");}
				else {
					System.out.print(" ");
				}
				
		}
			System.out.println();}}


public static void spe2(int n) {
	
	

	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if(i+j==n-1||i-j==0||i==n/2||j==n/2 || i==0&& j<n/2||j==n-1&&i<n/2||i==n-1 && j>n/2||j==0&&i>n/2) {
			System.out.print("*");}
			else {
				System.out.print(" ");
			}
			
	}
		System.out.println();}}


public static void spe3(int n) {
	
	

	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if(i*j==0||j==n-1||i==n-1||i==n/4&&(j>n/4-1 && j<3*n/4)||i==3*n/4&&(j>n/4-1 && j<3*n/4) ||j==n/4&&(i>n/4-1 && i<3*n/4)||j==3*n/4&&(i>n/4-1 && i<=3*n/4)) {
			System.out.print("*");}
			else {
				System.out.print(" ");
			}
			
	}
		System.out.println();}}




public static void spe4(int n) {
	
	

	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if(i+j==n/2|| i-j==-n/2 || i+j==3*(n/2)|| i-j==n/2 ||
                    i+j==3*n/4 && j<=n/2 && i<=n/2 ||
                    i-j==-n/4 && j>=n/2 && i<=n/2 ||
                    i-j==n/4 && i>=n/2 && j<=n/2 ||
                    i+j==(n-1)+n/4 && i>=n/2 && j>=n/2) {
			System.out.print("*");}
			else {
				System.out.print(" ");
			}
			
	}
		System.out.println();}}





public static void spe5(int n) {
	
	

	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if((i+j>n/2&& i-j>-n/2 && i+j<3*(n/2)&& i-j<n/2)&& !(i+j>n/2+3&& i-j>-n/2+3 && i+j<3*(n/2)-3&& i-j<n/2-3) ){
			System.out.print("*");}
			else {
				System.out.print(" ");
			}
			
	}
		System.out.println();}}




public static void spe6(int n) {
	
	

	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if((i+j>n/2&& i-j>-n/2 && i+j<3*(n/2)&& i-j<n/2)&& !(i+j>n/2+3&& i-j>-n/2+3 && i+j<3*(n/2)-3&& i-j<n/2-3) ){
			System.out.print("*");}
			else {
				System.out.print(" ");
			}
			
	}
		System.out.println();}}


//i+j<3*(n/2)&& i-j<n/2 &&i>n/4 &&i+j>n/2&&i-j>-n/2

public static void spe7(int n) {
	
	

	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if( !(i>n/4+n/8  &&i<3*n/4 &&j>n/4+n/8 &&j<=n/2+n/8  )  &&i+j<3*(n/2)&& i-j<n/2 &&i>n/4 &&i+j>n/2&&i-j>-n/2   ){
			System.out.print("*");}
			else {
				System.out.print(" ");
			}
			
	}
		System.out.println();}}





public static void spe8(int n) {
	
	

	for(int i=0;i<n;i++) {
		for(int j=0;j<2*n;j++) {
			if( i+j==n-1||i-j==-n+1||i==n-1&&j<2*n-1||i==n/2 &&j>=3*n/4 &&j<5*n/4
					||    i<=3*n/4 &&i>=n/2&&(i+j==(n-1)+3*n/4||i-j==-n/4)){
			System.out.print("*");}
			else {
				System.out.print(" ");
			}
			
	}
		System.out.println();}}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
special(16);

System.out.println();
System.out.println();
spe2(15);
System.out.println();

System.out.println();
spe3(15);
spe4(15);
System.out.println();
spe5(15);
System.out.println();
spe7(21);

System.out.println();
spe8(15);
	}

}
