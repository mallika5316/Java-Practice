package arayConcept;

public class StringEntireSort {
	public static void dis(char ch[]) {
		int n=ch.length;
		for(int i=0;i<n;i++) {
			if(ch[i]!=' ') {
			System.out.print(ch[i]+" ");
			}
		}System.out.println();
		
		
		
		
		
	}
	
	
	
	public static void wordrev(char ch[]) {
		int n=ch.length;
		dis(ch);
	
		int s=0;
		for(int j=0;j<n-1;j++) {
     	   for(int k=j+1;k<n;k++) {
     		
     		  
     		   
     		   if(ch[k]==' '||ch[j]>ch[k] ) {
     			   
     			   char t=ch[j];
     			   ch[j]=ch[k];
     			   ch[k]=t;
     			   
     		   }
     	   }
        }	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="what is your name";
		char ch[]=s.toCharArray();
		wordrev(ch);
		dis(ch);
	}

}
