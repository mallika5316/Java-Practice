package arayConcept;

public class consonentandovel {
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
		int k=0;
		for(int i=0;i<n;i++) {
			
			if((ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'|| ch[i]=='u' && k==0 )) {
				ch[i]=(char)(ch[i]-32);
				k=1;
			}
			else if(ch[i]!=' '  ) {
				if(k==0) {
				ch[i]=(char)(ch[i]-1);}
				else {
					ch[i]=(char)(ch[i]+1);
				}
			}else {
				k=0;
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
