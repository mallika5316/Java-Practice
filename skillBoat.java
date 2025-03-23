package pattern;

public class skillBoat {
public static void skillBoa(int n) {
	for(int i=0;i<n;i++) {
		for(int j=0;j<n*20;j++) {
			if((i<5 && j==0||i==n/2&& j<5|| j== 4&& i>n/2||i==0 && j<5||i==n-1 && j<5) ||(j==n/2 +2||(i+j)==(n-1)+2&& j>n/2+2 ||(i-j)==0+2&& j>n/2+2 ||
					(i-j)+7==n/2 && j>6) ||
					(i==0 && j>11 && j<17||j==n/2 +10||i==n-1 &&j>11 && j<17)|| (j==18 ||i==n-1 && j>18 && j<24) || (j==25 ||i==n-1 && j>25 && j<31)
					||(j==37 ||j==43||i==0 && j<44&&j>36||i==n/2&& j<44 && j>36 ||i==n-1 && j<44 && j>36)||
					(i==0 && j<51&&j>45|| j==45  ||i==n-1 && j<51&&j>45||j==51)||
					(j==53||j==59||i==0 && j<59 && j>53||i==n/2 && j<59 && j>53)||
					i==0   & j>60 && j<68 ||j==64){
				System.out.print("*");}
				else {
					System.out.print(" ");
				}
			
			
			
	}
		
	System.out.println();}
	
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
skillBoa(8);
	}

}
