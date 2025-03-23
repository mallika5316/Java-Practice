package arayConcept;

import java.util.Arrays;

public class Anagram {

	 public static boolean isAnagram(String s, String t) {
		 char p[]=s.toCharArray();
		 
		 
		 
		           char q[]=t.toCharArray();
		           Arrays.sort(p);
		           Arrays.sort(q);

		           if(Arrays.equals(p,q)){
		             return true;
		           }
		           return false;


		 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String p="hi";
		String q="ih";
		
        System.out.println(isAnagram(p,q));
	}

}
