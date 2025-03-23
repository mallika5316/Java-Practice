package arayConcept;

public class string4 {
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
		for(int i=0;i<n;i++) {
			
			if(i==n-1|| ch[i+1]==' ') {
				     //if single char word and we need only "#" then   if(s!=i) ch[s]='@'
				ch[i]=(char)(ch[i]-32);
				ch[s]=(char)(ch[s]-32);
				 s=i+2;
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
