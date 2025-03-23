package arayConcept;



public class startCharPrint {
	public static void dis(char ch[]) {
		int n=ch.length;
		for(int i=0;i<n;i++) {
			System.out.print(ch[i]);
		}
		System.out.println();
	}	
	public static int word(char ch[]) {
		int n=ch.length;
		dis(ch);
		int s=Integer.MAX_VALUE;
		int c=0;
		char ar[]=new char[n];
		for(int i=0;i<n;i++) {
			c=c+1;
			
			if(i==n-1|| ch[i+1]==' ') {
				     //if single char word and we need only "#" then   if(s!=i) ch[s]='@'
//				ar[s++]=(char)c;
				if(c<s) {
					s=c;;
				}
				c=-1;
				 
			}	
		}
		return s;		 
		 }
	
	public static void wordrev(char ch[]) {
		int n=ch.length;
		
		int p=0;
		int s=0;
		int l=word(ch);
//		for(int j=0;j<l;j++) {
//		     	for(int i=0;i<n;i++) {
//				if(i==n-1||ch[i+1]==' ') {
//					System.out.print((char)(ch[s+j]-32));   //    s[p++]=(char)(ch[s+j]-32);
//					s=i+2;
//				}
//			}
//		s=0;
//		System.out.print(" ")                                  // s[p++]=' ';
//		}
		
		
		//method2
		System.out.println(l);
		for(int j=1;j<l+1;j++) {
			for(int i=j-1;i<n;i++) {
				if(i==j-1 || ch[i-j]==' ') {
					System.out.print((char)(ch[i]));
				}
			}
			System.out.print(" ");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="what is your name";
		char ch[]=s.toCharArray();
		wordrev(ch);
		
		
		
	}

}
