package arayConcept;

public class AltSwap {
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
		//int s=0;
		int s=0;
		for(int i=0;i<n-1;i++) {
			
			if(ch[i]!=' ') {
		    char t=ch[i];
			ch[i]=ch[i+1];
			ch[i+1]=t;
			i=i+1;
		
			}
				
			}}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="what is your name";
		char ch[]=s.toCharArray();
		wordrev(ch);
		dis(ch);
	}

}
