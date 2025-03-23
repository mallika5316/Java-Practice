package linkedList;

//class LinkedLi{
//
//	Node root;
//	void append(int data){
//	Node t=new Node();
//	t.data=data;
//	System.out.println("i am append "+this);
//	System.out.println(data+" "+"madbeku"+" "+t+" "+this );
//	return;
//	}
//
//	}




class LinkedLi{

Node root;
void append(int data){
Node t=new Node(data);
return;
}

}

class Node{
int data=86;
Node add;

Node(int data){
this.data=data;
System.out.println(this.data +" " +data);
}
}


public class LinkedList {
	
		public static void main(String a[]){
		LinkedLi l=new LinkedLi();
		LinkedLi l1=new LinkedLi();
		System.out.println(l+" "+l1);
		l.append(90);
		l1.append(100);
		}
		}


//		class Node{
//		int data;
//		Node add;
//		{
//		System.out.println("i am in node " +this);
//		}
//		/*Node(){
//		System.out.println("i am cons of node ");
//		}*/
//		}

