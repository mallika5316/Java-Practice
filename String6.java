package arayConcept;

public class String6 {
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
		int c=0;
		for(int i=0;i<n;i++) {
			c=c+1;
			if(i==n-1|| ch[i+1]==' ') {
				     //if single char word and we need only "#" then   if(s!=i) ch[s]='@'
				ch[i]=(char)(48+c);
				c=-1;
				 
			}
			
			
			
		}}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="What is your name";
		
		String p=" ";
		char ch[]=s.toCharArray();
		wordrev(ch);
		dis(ch);
	}

}
