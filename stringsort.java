package arayConcept;

public class stringsort {
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
		    if(i==n-1||ch[i+1]==' ') {
		           for(int j=s;j<i;j++) {
		        	   for(int k=j+1;k<i+1;k++) {
		        		   if(ch[j]>ch[k]) {
		        			   
		        			   char t=ch[j];
		        			   ch[j]=ch[k];
		        			   ch[k]=t;		        			   
		        		   }
		        	   }
		           }	
			s=i+2;
	
		}}}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="what is your name";
		char ch[]=s.toCharArray();
		wordrev(ch);
		dis(ch);

	}

}
