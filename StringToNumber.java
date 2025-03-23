package arayConcept;

public class StringToNumber {
	 static void numtoword(String n){
	        String one[]={"","one","two","three","four","five",
	                        "six","seven","eight","nine"};
	        String teens[]={"Ten","eleven","tweleve","thirteen","fourteen",
	                        "fifyteen","sixteen","seventeen","eighteen",
	                        "ninteen"};
	        String tens[]={"","","twenty","thirty","fourty","fifty","sixty",
	                        "seventy","eighty","ninty"};
	        
	        String[] parts = n.split(" ");
	        
	        for(int i=0;i<parts.length;i++) {
	        	if(parts[i]=="zero") {
	        		System.out.println(0);
	        	}
	        	for(String p :one) {
	        		if(p==parts[i]) {
	        			System.out.println();
	        		}
	        	}
	        	for(String p :teens) {
	        		if(p==parts[i]) {
	        			System.out.println(parts[i].indexOf(parts[i]));
	        		}
	        	}
	        	
	        	
	    }
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
