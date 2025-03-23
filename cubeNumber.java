package Day6;

public class cubeNumber {
	public static void PerfectCube(int n) {
		for(int i=1;i*i*i<=n;i++) {
			if(i*i*i==n) {
				System.out.println("number "+n+" is perfect cube");
				return;
			}
			
		}
		System.out.println("not");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     PerfectCube(125);
	}

}
