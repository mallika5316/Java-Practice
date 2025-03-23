package arayConcept;

public class string7 {
	public static void dis(char ch[]) {
		int n=ch.length;
		for(int i=0;i<n;i++) {
			System.out.print(ch[i]);
		}
		System.out.println();
	}
	
	
	
	
	
	
	public static void wordrev(char ch[]) {
		int n=ch.length;
		dis(ch);
		int s=0;
		int c=0;
		for(int i=0;i<n;i++) {

			if(97<=ch[i] &&ch[i]<=122 && ch[i]!=' ') {
				ch[i]=(char)(ch[i]-32);
			}
				
				
			}


			
			
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="what Is your name";
		char ch[]=s.toCharArray();
		wordrev(ch);
		dis(ch);
	}

}
