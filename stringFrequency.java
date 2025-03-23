package arayConcept;

public class stringFrequency {
	public static void dis(char ch[]) {
		int n=ch.length;
		for(int i=0;i<n;i++) {
			System.out.print(ch[i]);
		}
		System.out.println();
	}
	
	
	public static void freq(char ch[]) {
		
int n=ch.length;
int p[]=new int[n];
for(int i=0;i<n;i++) {
	int k=1;
	for(int j=i+1;j<n-1;j++) {
		if(ch[i]==ch[j]) {
			k++;
			ch[j]=0;
		}
	}
	if(ch[i]!=0) {
		System.out.println(ch[i]+ " "+ k);
	}
}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="What is your name";
		char ch[]=s.toCharArray();
		freq(ch);
		//dis(ch);
	}

}
