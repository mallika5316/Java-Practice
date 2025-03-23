package arayConcept;

public class nextovel {
	
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
				
				if(ch[i]=='a'||ch[i]=='e') {
					ch[i]=(char)(ch[i]-32+4);
				}
				if(ch[i]=='i'||ch[i]=='o') {
					ch[i]=(char)(ch[i]-32+6);
				}
				if(ch[i]=='u') {
					ch[i]=(char)(65);
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
