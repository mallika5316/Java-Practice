package arayConcept;

public class StringMetyh {
	
	public static void dis(char ch[]) {
		int n=ch.length;
		for(int i=0;i<n;i++) {
			System.out.print(ch[i]);
		}
		System.out.println();
	}
	
	
	public static void rev(char c[],int i,int j) {
		while(i<j) {
			char t=c[i];
			c[i]=c[j];
			c[j]=t;
			i++;
			j--;
		}

	}
	
	public static void wordrev(char ch[]) {
		int n=ch.length;
		dis(ch);
		int s=0;
		for(int i=0;i<n;i++) {
//			if(+ch[i]==32) 
			//+  bez system convert the char to asci    . Auto convertion
//			if(ch[i]==(char)32)
//				{
//				rev(ch, s, i-1);
//				s=s+i;
//				
//			}
//			
//			if(i==n-1) {
//				rev(ch, s, i);
//			}
//		
			if(i==n-1||ch[i+1]==' ') {
				rev(ch, s, i);
				s=i+2;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="What is your name";
		char ch[]=s.toCharArray();
		wordrev(ch);
		dis(ch);
	}

}
