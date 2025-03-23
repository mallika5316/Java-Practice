package arayConcept;
import java.util.ArrayList;
import java.util.Collections;

public class p1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(6);
        list.add(9);
        list.add(3);
        list.add(7);
        
        int i = 0, j = list.size() - 1;
        
        while(i<j) {
        	int temp=list.get(i);
        	list.set(i, list.get(j));
        	list.set(j, temp);
        	
        	
        	i++;
        	j--;
        }
        
        
        
        
        while (i < j) {
            Collections.swap(list, i, j); 
            i++; 
            j--; 
           
        }
        
        System.out.println(list);
    }
}
